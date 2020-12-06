package src.com.vio.pattern.facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class HttpConnectionHandlerFacade {

    public HttpURLConnection openConnection(URL url) throws IOException {
        HttpConnectionHandler httpConnectionHandler = new HttpConnectionHandler(url);

        return httpConnectionHandler.createConnection();
    }

    public Optional<String> sendRequest(URL url, String requestMethod) throws IOException {
        HttpConnectionHandler httpConnectionHandler = new HttpConnectionHandler(url);
        HttpURLConnection httpURLConnection = httpConnectionHandler.createConnection();

        return httpConnectionHandler.sendBody(httpURLConnection, requestMethod, null);
    }

}
