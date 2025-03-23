package pl.mikbac.threads.Example100;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by MikBac on 29.12.2023
 */
public class Main {

    private static final int NUMBER_OF_THREADS = 256;

    public static void main(String[] args) throws IOException {
        startServer();
    }

    public static void startServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new SampleHttpHandler());
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        server.setExecutor(executor);
        server.start();
    }

}
