package com.snaptools.snapurl;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.snaptools.shorter.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ProcessTextActivity extends Activity {

    private static final String TAG = "SnapURL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CharSequence selected = getIntent()
            .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT);

        final boolean readOnly = getIntent()
            .getBooleanExtra(Intent.EXTRA_PROCESS_TEXT_READONLY, false);

        if (selected == null || selected.toString().trim().isEmpty()) {
            Toast.makeText(this, getString(R.string.empty),
                Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        final String url = selected.toString().trim();

        Toast.makeText(this, getString(R.string.shortening),
            Toast.LENGTH_SHORT).show();

        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... v) {
                try {
                    String encoded = URLEncoder.encode(url, "UTF-8");
                    URL api = new URL(
                        "https://is.gd/create.php?format=simple&url=" + encoded
                    );
                    HttpURLConnection conn =
                        (HttpURLConnection) api.openConnection();
                    conn.setConnectTimeout(8000); // Slightly more generous timeout
                    conn.setReadTimeout(8000);
                    conn.setRequestProperty("User-Agent", "SnapURL/1.0");
                    
                    int responseCode = conn.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        // Safely consume and close the InputStream so the connection can be pooled and reused
                        try (java.io.InputStream in = conn.getInputStream();
                             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
                            return reader.readLine();
                        }
                    } else {
                        // Safely consume and close the ErrorStream on non-200 responses to allow connection reuse
                        java.io.InputStream err = conn.getErrorStream();
                        if (err != null) {
                            try (java.io.InputStream eStream = err) {
                                byte[] buffer = new byte[8192];
                                while (eStream.read(buffer) != -1) {
                                    // consume
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Error shortening URL", e);
                }
                return null;
            }

            @Override
            protected void onPostExecute(String shortUrl) {
                if (shortUrl != null && shortUrl.startsWith("http")) {
                    if (!readOnly) {
                        Intent result = new Intent();
                        result.putExtra(
                            Intent.EXTRA_PROCESS_TEXT, shortUrl);
                        setResult(RESULT_OK, result);
                    } else {
                        ClipboardManager clip =
                            (ClipboardManager)
                                getSystemService(CLIPBOARD_SERVICE);
                        clip.setPrimaryClip(
                            ClipData.newPlainText("SnapURL", shortUrl)
                        );
                        Toast.makeText(
                            ProcessTextActivity.this,
                            getString(R.string.copied) + shortUrl,
                            Toast.LENGTH_LONG
                        ).show();
                    }
                } else {
                    Toast.makeText(
                        ProcessTextActivity.this,
                        getString(R.string.error),
                        Toast.LENGTH_LONG // Changed to LONG for better readability
                    ).show();
                }
                finish();
            }
        }.execute();
    }
}
