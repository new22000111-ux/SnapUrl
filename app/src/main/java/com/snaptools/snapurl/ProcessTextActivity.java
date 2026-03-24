package com.snaptools.snapurl;

public class ProcessTextActivity extends android.app.Activity {

    private String getString(String key) {
        String lang = java.util.Locale.getDefault().getLanguage();
        
        java.util.HashMap<String, java.util.HashMap<String, String>> all = 
            new java.util.HashMap<>();

        // Arabic
        java.util.HashMap<String, String> ar = new java.util.HashMap<>();
        ar.put("shortening", "جاري تقصير الرابط...");
        ar.put("copied",     "تم النسخ: ");
        ar.put("error",      "تعذر تقصير الرابط");
        ar.put("empty",      "لا يوجد نص محدد");
        all.put("ar", ar);

        // English
        java.util.HashMap<String, String> en = new java.util.HashMap<>();
        en.put("shortening", "Shortening URL...");
        en.put("copied",     "Copied: ");
        en.put("error",      "Failed to shorten URL");
        en.put("empty",      "No text selected");
        all.put("en", en);

        // French
        java.util.HashMap<String, String> fr = new java.util.HashMap<>();
        fr.put("shortening", "Raccourcissement en cours...");
        fr.put("copied",     "Copié : ");
        fr.put("error",      "Échec du raccourcissement");
        fr.put("empty",      "Aucun texte sélectionné");
        all.put("fr", fr);

        // Spanish
        java.util.HashMap<String, String> es = new java.util.HashMap<>();
        es.put("shortening", "Acortando enlace...");
        es.put("copied",     "Copiado: ");
        es.put("error",      "Error al acortar el enlace");
        es.put("empty",      "No hay texto seleccionado");
        all.put("es", es);

        // German
        java.util.HashMap<String, String> de = new java.util.HashMap<>();
        de.put("shortening", "URL wird gekürzt...");
        de.put("copied",     "Kopiert: ");
        de.put("error",      "URL konnte nicht gekürzt werden");
        de.put("empty",      "Kein Text ausgewählt");
        all.put("de", de);

        // Chinese
        java.util.HashMap<String, String> zh = new java.util.HashMap<>();
        zh.put("shortening", "正在缩短链接...");
        zh.put("copied",     "已复制: ");
        zh.put("error",      "缩短链接失败");
        zh.put("empty",      "未选择文本");
        all.put("zh", zh);

        // Hindi
        java.util.HashMap<String, String> hi = new java.util.HashMap<>();
        hi.put("shortening", "URL छोटा हो रहा है...");
        hi.put("copied",     "कॉपी हो गया: ");
        hi.put("error",      "URL छोटा करने में विफल");
        hi.put("empty",      "कोई टेक्स्ट नहीं चुना");
        all.put("hi", hi);

        // Portuguese
        java.util.HashMap<String, String> pt = new java.util.HashMap<>();
        pt.put("shortening", "Encurtando URL...");
        pt.put("copied",     "Copiado: ");
        pt.put("error",      "Falha ao encurtar URL");
        pt.put("empty",      "Nenhum texto selecionado");
        all.put("pt", pt);

        // Russian
        java.util.HashMap<String, String> ru = new java.util.HashMap<>();
        ru.put("shortening", "Сокращение ссылки...");
        ru.put("copied",     "Скопировано: ");
        ru.put("error",      "Не удалось сократить ссылку");
        ru.put("empty",      "Текст не выбран");
        all.put("ru", ru);

        // Japanese
        java.util.HashMap<String, String> ja = new java.util.HashMap<>();
        ja.put("shortening", "URLを短縮中...");
        ja.put("copied",     "コピーしました: ");
        ja.put("error",      "URL短縮に失敗しました");
        ja.put("empty",      "テキストが選択されていません");
        all.put("ja", ja);

        // Korean
        java.util.HashMap<String, String> ko = new java.util.HashMap<>();
        ko.put("shortening", "URL 단축 중...");
        ko.put("copied",     "복사됨: ");
        ko.put("error",      "URL 단축 실패");
        ko.put("empty",      "선택된 텍스트 없음");
        all.put("ko", ko);

        // Italian
        java.util.HashMap<String, String> it = new java.util.HashMap<>();
        it.put("shortening", "Accorciamento URL...");
        it.put("copied",     "Copiato: ");
        it.put("error",      "Impossibile accorciare l'URL");
        it.put("empty",      "Nessun testo selezionato");
        all.put("it", it);

        // Turkish
        java.util.HashMap<String, String> tr = new java.util.HashMap<>();
        tr.put("shortening", "URL kısaltılıyor...");
        tr.put("copied",     "Kopyalandı: ");
        tr.put("error",      "URL kısaltılamadı");
        tr.put("empty",      "Metin seçilmedi");
        all.put("tr", tr);

        // Dutch
        java.util.HashMap<String, String> nl = new java.util.HashMap<>();
        nl.put("shortening", "URL verkorten...");
        nl.put("copied",     "Gekopieerd: ");
        nl.put("error",      "URL verkorten mislukt");
        nl.put("empty",      "Geen tekst geselecteerd");
        all.put("nl", nl);

        // Polish
        java.util.HashMap<String, String> pl = new java.util.HashMap<>();
        pl.put("shortening", "Skracanie URL...");
        pl.put("copied",     "Skopiowano: ");
        pl.put("error",      "Nie udało się skrócić URL");
        pl.put("empty",      "Nie wybrano tekstu");
        all.put("pl", pl);

        // Indonesian / Malay
        java.util.HashMap<String, String> id = new java.util.HashMap<>();
        id.put("shortening", "Mempersingkat URL...");
        id.put("copied",     "Disalin: ");
        id.put("error",      "Gagal mempersingkat URL");
        id.put("empty",      "Tidak ada teks dipilih");
        all.put("id", id);
        all.put("ms", id);

        // Persian
        java.util.HashMap<String, String> fa = new java.util.HashMap<>();
        fa.put("shortening", "در حال کوتاه کردن لینک...");
        fa.put("copied",     "کپی شد: ");
        fa.put("error",      "خطا در کوتاه کردن لینک");
        fa.put("empty",      "متنی انتخاب نشده");
        all.put("fa", fa);

        // Urdu
        java.util.HashMap<String, String> ur = new java.util.HashMap<>();
        ur.put("shortening", "URL مختصر ہو رہا ہے...");
        ur.put("copied",     "کاپی ہو گیا: ");
        ur.put("error",      "URL مختصر کرنے میں ناکامی");
        ur.put("empty",      "کوئی متن منتخب نہیں");
        all.put("ur", ur);

        // Bengali
        java.util.HashMap<String, String> bn = new java.util.HashMap<>();
        bn.put("shortening", "URL সংক্ষিপ্ত হচ্ছে...");
        bn.put("copied",     "কপি হয়েছে: ");
        bn.put("error",      "URL সংক্ষিপ্ত করতে ব্যর্থ");
        bn.put("empty",      "কোনো টেক্সট নির্বাচিত নয়");
        all.put("bn", bn);

        // Vietnamese
        java.util.HashMap<String, String> vi = new java.util.HashMap<>();
        vi.put("shortening", "Đang rút gọn URL...");
        vi.put("copied",     "Đã sao chép: ");
        vi.put("error",      "Không thể rút gọn URL");
        vi.put("empty",      "Chưa chọn văn bản");
        all.put("vi", vi);

        // Thai
        java.util.HashMap<String, String> th = new java.util.HashMap<>();
        th.put("shortening", "กำลังย่อ URL...");
        th.put("copied",     "คัดลอกแล้ว: ");
        th.put("error",      "ไม่สามารถย่อ URL ได้");
        th.put("empty",      "ไม่ได้เลือกข้อความ");
        all.put("th", th);

        // Swedish
        java.util.HashMap<String, String> sv = new java.util.HashMap<>();
        sv.put("shortening", "Förkortar URL...");
        sv.put("copied",     "Kopierat: ");
        sv.put("error",      "Kunde inte förkorta URL");
        sv.put("empty",      "Ingen text vald");
        all.put("sv", sv);

        // Greek
        java.util.HashMap<String, String> el = new java.util.HashMap<>();
        el.put("shortening", "Συντόμευση URL...");
        el.put("copied",     "Αντιγράφηκε: ");
        el.put("error",      "Αποτυχία συντόμευσης URL");
        el.put("empty",      "Δεν επιλέχθηκε κείμενο");
        all.put("el", el);

        // Hebrew
        java.util.HashMap<String, String> he = new java.util.HashMap<>();
        he.put("shortening", "מקצר קישור...");
        he.put("copied",     "הועתק: ");
        he.put("error",      "שגיאה בקיצור הקישור");
        he.put("empty",      "לא נבחר טקסט");
        all.put("he", he);

        java.util.HashMap<String, String> chosen = all.containsKey(lang) 
            ? all.get(lang) 
            : all.get("en");

        return chosen.get(key);
    }

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CharSequence selected = getIntent()
            .getCharSequenceExtra(android.content.Intent.EXTRA_PROCESS_TEXT);

        final boolean readOnly = getIntent()
            .getBooleanExtra(android.content.Intent.EXTRA_PROCESS_TEXT_READONLY, false);

        if (selected == null || selected.toString().trim().isEmpty()) {
            android.widget.Toast.makeText(this, getString("empty"),
                android.widget.Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        final String url = selected.toString().trim();

        android.widget.Toast.makeText(this, getString("shortening"),
            android.widget.Toast.LENGTH_SHORT).show();

        new android.os.AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... v) {
                try {
                    String encoded = java.net.URLEncoder.encode(url, "UTF-8");
                    java.net.URL api = new java.net.URL(
                        "https://is.gd/create.php?format=simple&url=" + encoded
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
                    if (!readOnly) {
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
                            getString("copied") + shortUrl,
                            android.widget.Toast.LENGTH_LONG
                        ).show();
                    }
                } else {
                    android.widget.Toast.makeText(
                        ProcessTextActivity.this,
                        getString("error"),
                        android.widget.Toast.LENGTH_SHORT
                    ).show();
                }
                finish();
            }
        }.execute();
    }
}
