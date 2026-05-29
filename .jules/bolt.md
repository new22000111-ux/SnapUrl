## 2024-05-24 - Enable HTTP Connection Pooling in Java
**Learning:** Calling `HttpURLConnection.disconnect()` closes the underlying socket, which prevents the connection from being added to the pool for reuse. For optimal network performance, especially on mobile, sockets should be reused.
**Action:** To safely return a connection to the pool, do not call `disconnect()`. Instead, ensure the `InputStream` (on 200 OK) or the `ErrorStream` (on non-200 responses) is fully consumed and properly closed using `try-with-resources`.
