package Homework.lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Handler {
    public Handler(Socket socket, String name) {
        try (Scanner scanner = new Scanner(System.in)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String message;
            Sender sender = new Sender(scanner, out);
            Thread senderThread = new Thread(sender);
            senderThread.start();

            while (true) {
                message = in.readUTF();
                if (message.equals("exit")) {
                    System.out.printf("%s exit%n", name);
                    break;
                }
                System.out.printf("%s says: %s%n", name, message);
            }
        } catch (IOException e) {
            System.out.println("Client exit");
            ;
        }
    }
}
