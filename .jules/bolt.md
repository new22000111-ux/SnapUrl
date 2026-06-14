## 2024-05-23 - HttpURLConnection pooling in Android
**Learning:** Calling `HttpURLConnection.disconnect()` actively closes the underlying TCP socket, which defeats the built-in HTTP connection pooling (Keep-Alive) in Java. This forces a new TCP and TLS handshake for every request, which is a major performance bottleneck for repeated actions.
**Action:** Always consume and safely close both the `InputStream` and `ErrorStream` using `try-with-resources` instead of calling `disconnect()`. This returns the connection to the pool, allowing it to be reused for subsequent requests and saving significant time on handshakes.
## 2024-05-23 - Android string resources imported package
**Learning:** If classes are in a different package from the AndroidManifest's `package` definition, you must explicitly import the `R` class using the manifest's package string, otherwise `R.string.x` will fail to resolve.
**Action:** Always check the memory and/or `AndroidManifest.xml` to see if an `import com.namespace.R;` is needed for resources to be available in activities/fragments.
## 2024-05-23 - Android manifest activity naming
**Learning:** If the Java class package (`com.snaptools.snapurl`) differs from the AndroidManifest `package` declaration (`com.snaptools.shorter`), using a relative path like `.ProcessTextActivity` in the manifest will result in a `MissingClass` lint error because it will try to find `com.snaptools.shorter.ProcessTextActivity`.
**Action:** Always use the fully qualified class name in the `AndroidManifest.xml` (e.g., `com.snaptools.snapurl.ProcessTextActivity`) when declaring activities if the packages don't match exactly.
