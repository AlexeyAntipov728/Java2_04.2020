package Homework.lesson_2;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        // TODO: 14.04.2020
        // протестируйте arraySum здесь

        /*Тесты здесь проходят успешно, если в массив давать текст, то срабатываест ArrayDataException,
        если в размер дать число больше или меньше 4, то срабатывает ArraySizeException.
        Если все задать как надо, то сумму считает, но при прогоне по Вашим тестам, почему успешно получилось только testSize пройти. */

        String[][] strings = new String[4][4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = String.valueOf(j + 10);  // Тут не понял, как исправить, чтобы в обоих случаях и (j + 10) и (j + "10") была одинаковая сумма.
            }
        }

        ArrayUtils arrayUtils = new ArrayUtils();
        System.out.print(arrayUtils.arraySum(strings));

    }
}
