package Homework.lesson_5;

public class main {
    public static void main(String[] args) {
        LearnThreads learnThreads = new LearnThreads();
//        System.out.println("Выполнение в один поток в миллисекундах:");
//        learnThreads.OneThread();
        System.out.println("Выполнение в два потока в миллисекундах:");
        learnThreads.MultiThread();
    }
}
