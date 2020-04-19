package Homework.lesson_2;

public class ArrayDataException extends Exception {
    public ArrayDataException(int x, int y) {
        System.out.println("Не удалось привести элемент к числу в строке: " + x + " столбце: " + y);
    }
}
