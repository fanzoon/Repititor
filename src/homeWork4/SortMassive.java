package homeWork4;

import java.util.Arrays;

public class SortMassive {

    public static void main(String[] args) {

        int[][] a = {{2, 4, 8}, {3, 7, 1}, {6, 3, 9}};

        Arrays.sort(a);

        System.out.println(Arrays.deepToString(a));

//        sortBubble(a);

    }

//    private static void sortBubble(int[][] b) {
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                for (int k = 0; k < b.length; k++) {
//                    for (int m = 1; m < b[k].length-1; m++) {
//                        if(b[k][m] < b[k][m - 1]) {
//                            int temp = b[k][m];
//                            b[k][m] = b[k][m - 1];
//                            b[k][m - 1] =temp;
//                        }
//                    }
//                }
//
//            }
//        }
//
//    }



}
