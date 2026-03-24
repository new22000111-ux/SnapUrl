<div align="center">

# ⚡ SnapURL

**Instant URL shortener — lives in your text selection menu**

[![License: AGPL-3.0](https://img.shields.io/badge/License-AGPL--3.0-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/Android-6.0%2B-brightgreen.svg)](https://android.com)
[![Open Source](https://img.shields.io/badge/Open%20Source-%E2%9D%A4-red.svg)](https://github.com)

[Download APK](#download) · [How it works](#how-it-works) · [Build yourself](#build)

</div>

---

## What is SnapURL?

SnapURL is a **zero-UI** Android utility. It doesn't appear on your home screen — it lives silently inside your text selection menu, exactly like Copy and Paste.

Select any URL → tap **SnapURL** → done.

No ads. No accounts. No bloat. Just one thing done right.

---

## How it works

1. Select any URL in **any app**
2. Tap the `···` menu in the text selection bar
3. Tap **SnapURL**
4. The URL is instantly replaced with a short link
5. If replacement isn't possible, it's copied to clipboard automatically

---

## Features

- 🌍 Supports **25+ languages** — auto-detects system language
- 📋 Fallback to clipboard copy when needed
- 🔇 Zero UI — invisible on home screen
- ⚡ Lightweight — under 50KB APK
- 🔓 100% open source, no tracking

### Supported languages
Arabic · English · French · Spanish · German · Chinese · Hindi · Portuguese · Russian · Japanese · Korean · Italian · Turkish · Dutch · Polish · Indonesian · Malay · Persian · Urdu · Bengali · Vietnamese · Thai · Swedish · Greek · Hebrew

---

## Download

## Download

Go to the **Releases** section of this repository and open the latest release.

### Steps
1. Open the **Releases** page on GitHub
2. Select the latest version of **SnapURL**
3. Under **Assets**, tap **SnapUrl.apk**
4. Download and install the APK on your Android device

If Android blocks the installation, enable **Install unknown apps** or **Install from unknown sources** in your device settings, then try again.
---

## Build

### Requirements
- Java 11+
- Android SDK (or use GitHub Actions — no setup needed)

### GitHub Actions (recommended)
1. Fork this repo
2. Push any change
3. Go to **Actions** → download the APK artifact

### Local build
```bash
git clone https://github.com/your-username/SnapURL.git
cd SnapURL
gradle assembleDebug
```

APK will be at `app/build/outputs/apk/debug/app-debug.apk`

---

## Part of the SnapTools Series

SnapURL is the first app in the **SnapTools** series — a collection of lightweight system-level utilities that work silently in the background, no UI, no bloat.

| App | Description | Status |
|-----|-------------|--------|
| SnapURL | URL shortener via text selection | ✅ Released |
| SnapOCR | Extract text from screen selection | 🔜 Soon |
| SnapTranslate | Translate selected text instantly | 🔜 Soon |
| SnapQR | Generate QR from selected text | 🔜 Soon |
| SnapHash | Get MD5/SHA256 of any file | 🔜 Soon |

---

## Privacy

- No data collected
- No analytics
- No internet access except the is.gd API call to shorten URLs
- Source code is fully auditable

---

## License

The source code of this project is licensed under AGPL-3.0 unless stated otherwise.

The project name, branding, logo, visual identity, content, datasets, and deployed service structure are proprietary and may not be reused, copied, or redistributed without explicit permission.

---

<div align="center">
Made with ❤️ · Part of the SnapTools open source series
</div>
<div align="center">
ZAIN
</div>
