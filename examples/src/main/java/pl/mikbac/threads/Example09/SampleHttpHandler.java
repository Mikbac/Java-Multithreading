package pl.mikbac.threads.Example09;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by MikBac on 31.12.2023
 */
public class SampleHttpHandler implements HttpHandler {

    @Override
    public void handle(final HttpExchange exchange) throws IOException {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        final Random random = new Random();

        final byte[] response = STR."Success: \{random.nextInt(1000)}".getBytes();
        exchange.sendResponseHeaders(200, response.length);
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(response);
        outputStream.close();
    }

}
