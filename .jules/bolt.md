## 2024-11-20 - Connection Pooling in HttpURLConnection
**Learning:** `HttpURLConnection.disconnect()` closes the underlying socket and prevents connection pooling. In environments with repeated network calls to the same host, reusing connections is a significant backend optimization.
**Action:** Removed `conn.disconnect()` in network calls to allow Android's default connection pooling mechanism to take effect, while ensuring resources like `InputStreamReader` are safely closed with try-with-resources.
