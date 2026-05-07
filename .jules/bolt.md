## 2024-05-07 - Cached HashMap Instantiation in ProcessTextActivity

**Learning:** Android components like `ProcessTextActivity` instantiate HashMaps continuously if placed inside methods like `getString` without static caching. When checking multiple localized strings upon initialization, these maps are instantiated over and over, generating significant garbage. Also, gradle wrapper updates may break build compilation on old projects - be cautious about unprompted toolchain upgrades.

**Action:** Look for HashMaps created inside frequently accessed methods in Android activities. Always extract them to static cache fields when they contain static content like translations. Avoid updating Gradle versions to resolve build issues; prefer cleaning and fixing specific build artifacts.
