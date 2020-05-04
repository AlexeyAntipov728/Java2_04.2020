package Homework.lesson_6.Client;

import Homework.lesson_6.Handler;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private final String serverIP;
    private final int serverPort;

    public Client(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    void run() {
        try (Socket socket = new Socket(serverIP, serverPort)) {
            new Handler(socket, "Server");
        } catch (UnknownHostException e) {
            System.err.println("Unknown host");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to");
            System.exit(1);
        }
    }
}
