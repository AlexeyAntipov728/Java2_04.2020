package Homework.lesson_6.Server;

public class MainServer {
    public static void main(String[] args) {
        try {
            new Server(80).start();
        } catch (Exception e) {
            System.out.println("Клиент отсоединился. Сервер прекратил работу");
        }
    }
}
