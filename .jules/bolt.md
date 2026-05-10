## 2024-05-10 - Avoid repetitive memory allocations for static data in Activity lifecycle
**Learning:** The Android Activity `getString()` method was recreating a large nested `HashMap` of localized strings every time it was called (2-3 times per activity start). This caused significant unnecessary memory allocation (70+ objects) and GC pressure on the main thread for data that never changes.
**Action:** Cache static, read-only structures like dictionaries using static variables with lazy initialization to reduce GC overhead and main thread blocking.
