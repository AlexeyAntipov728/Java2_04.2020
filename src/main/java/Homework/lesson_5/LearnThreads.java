package Homework.lesson_5;

import java.util.Arrays;

public class LearnThreads {
    static final int size = 100000;
    static final int halfSize = size / 2;
    float[] arr = new float[size];



    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void OneThread() {

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
            calculate(arr);
        }
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));

    }

    public void MultiThread() {

        float[] arr1 = new float[halfSize];
        float[] arr2 = new float[halfSize];
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        System.arraycopy(arr, 0, arr1, 0, halfSize);
        System.arraycopy(arr, halfSize, arr2, 0, halfSize);

        new Thread(() -> {
            float[] res1 = calculate(arr1);
            System.arraycopy(res1, 0, arr1, 0, res1.length);

        }).start();

        new Thread(() -> {
            float[] res2 = calculate(arr2);
            System.arraycopy(res2, 0, arr2, 0, res2.length);

        }).start();

        System.arraycopy(arr1, 0, arr, 0, halfSize);
        System.arraycopy(arr2, 0, arr, halfSize, halfSize);

        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr));



    }

}




