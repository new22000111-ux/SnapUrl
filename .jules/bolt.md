## 2024-05-18 - Prevent HttpURLConnection Leaks
**Learning:** `HttpURLConnection` must be reliably disconnected even when an exception occurs, or the backend connection pool could leak, slowly degrading performance over time. Handing exceptions without a finally block to disconnect is a performance anti-pattern.
**Action:** Always wrap `HttpURLConnection` in a `try-catch-finally` block to guarantee `disconnect()` is called and resources are released, preventing long-term connection leaks.
