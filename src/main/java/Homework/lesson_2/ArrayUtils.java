package Homework.lesson_2;

public class ArrayUtils {

    private static void date(String str, int x, int y) throws ArrayDataException {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new ArrayDataException(x, y);
            }
        }
    }

    public long arraySum(Object[][] array) throws ArraySizeException, ArrayDataException {

        if (array.length != 4)
            throw new ArraySizeException();

        for (Object[] objects : array) {
            if (objects.length != 4) {
                throw new ArraySizeException();
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                date((String) array[i][j], i, j);
                sum += Integer.parseInt((String) array[i][j]);
            }
        }
        return sum;
    }

}
