package homeWork3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {



        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] sumArray1AndArray2 = new double[10];

        Random random = new Random();

        int lengthArray = array1.length;

        for (int i = 0; i < lengthArray; i++) {
            array1[i] = random.nextInt((9 - 1) + 1) + 1;
            array2[i] = random.nextInt((9 - 1) + 1) + 1;
            sumArray1AndArray2[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sumArray1AndArray2));

        int numberOfIntegers = 0;
        for ( int i = 0; i < lengthArray; i++) {
            if(sumArray1AndArray2[i] % 1 == 0) {
                numberOfIntegers++;
            }
        }

        System.out.println("Колличество целых элементов в третьем массиве: " + numberOfIntegers);
    }
}
