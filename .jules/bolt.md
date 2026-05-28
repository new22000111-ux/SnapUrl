## 2024-05-28 - Avoid HttpURLConnection.disconnect()
**Learning:** Calling `HttpURLConnection.disconnect()` closes the underlying socket, which prevents Java from pooling the connection for reuse. This adds unnecessary latency to subsequent requests.
**Action:** Close the input/output streams (preferably using try-with-resources) instead of disconnecting the connection object itself to allow connection pooling in Java applications.
