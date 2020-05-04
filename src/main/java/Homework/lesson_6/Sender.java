package Homework.lesson_6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sender implements Runnable {
    private Scanner in;
    private DataOutputStream out;

    public Sender(Scanner in, DataOutputStream out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public void run() {
        String writer;
        try {
            while (true) {
                writer = in.nextLine();
                out.writeUTF(writer);
                out.flush();
                if (writer.equals("exit")) {
                    break;
                }
            }

        } catch (IOException e) {
            System.out.println("Server stop");
        }
    }
}
