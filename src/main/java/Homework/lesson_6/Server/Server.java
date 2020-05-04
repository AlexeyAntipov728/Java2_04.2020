package Homework.lesson_6.Server;

import Homework.lesson_6.Handler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int port;
    private boolean connect;

    public Server(int port) {
        this.port = port;
        this.connect = true;
    }

    void start() {
        try (ServerSocket server = new ServerSocket(port)) {
            if (connect) System.out.println("Server start. Waiting client");
            try (Socket socket = server.accept()) {
                if (connect) System.out.println("Client connect");
                new Handler(socket, "Client");
            } catch (IOException e) {
                System.out.println("Ошибка запуска сервера");
            }
        } catch (IOException e) {
            System.out.println("Ошибка инициализации сервера");
        }
    }
}
