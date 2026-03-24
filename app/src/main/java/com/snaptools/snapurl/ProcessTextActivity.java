package com.snaptools.snapurl;

public class ProcessTextActivity extends android.app.Activity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CharSequence selected = getIntent()
            .getCharSequenceExtra(android.content.Intent.EXTRA_PROCESS_TEXT);

        boolean readOnly = getIntent()
            .getBooleanExtra(android.content.Intent.EXTRA_PROCESS_TEXT_READONLY, false);

        if (selected == null || selected.toString().trim().isEmpty()) {
            finish();
            return;
        }

        final String url = selected.toString().trim();
        final boolean isReadOnly = readOnly;

        new android.os.AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... v) {
                try {
                    String encoded = java.net.URLEncoder.encode(url, "UTF-8");
                    java.net.URL api = new java.net.URL(
                        "https://tinyurl.com/api-create.php?url=" + encoded
                    );
                    java.net.HttpURLConnection conn =
                        (java.net.HttpURLConnection) api.openConnection();
                    conn.setConnectTimeout(6000);
                    conn.setReadTimeout(6000);
                    java.io.BufferedReader reader = new java.io.BufferedReader(
                        new java.io.InputStreamReader(conn.getInputStream())
                    );
                    String result = reader.readLine();
                    reader.close();
                    conn.disconnect();
                    return result;
                } catch (Exception e) {
                    return null;
                }
            }

            @Override
            protected void onPostExecute(String shortUrl) {
                if (shortUrl != null && shortUrl.startsWith("http")) {
                    if (!isReadOnly) {
                        android.content.Intent result = new android.content.Intent();
                        result.putExtra(
                            android.content.Intent.EXTRA_PROCESS_TEXT, shortUrl);
                        setResult(RESULT_OK, result);
                    } else {
                        android.content.ClipboardManager clip =
                            (android.content.ClipboardManager)
                                getSystemService(CLIPBOARD_SERVICE);
                        clip.setPrimaryClip(
                            android.content.ClipData.newPlainText("SnapURL", shortUrl)
                        );
                        android.widget.Toast.makeText(
                            ProcessTextActivity.this,
                            "تم النسخ: " + shortUrl,
                            android.widget.Toast.LENGTH_LONG
                        ).show();
                    }
                } else {
                    android.widget.Toast.makeText(
                        ProcessTextActivity.this,
                        "تعذر تقصير الرابط",
                        android.widget.Toast.LENGTH_SHORT
                    ).show();
                }
                finish();
            }
        }.execute();
    }
}
