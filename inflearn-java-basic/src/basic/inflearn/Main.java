package basic.inflearn;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        String a ="CDABQ";

        char[] arr = a.toCharArray();
        Arrays.sort(arr);

        String b = new String(arr);

        System.out.print('A'-'B');


        ArrayList<String> list = new ArrayList<>();
        list.clear();


    }
}


//    public int[][] rotation (int[][] arr) {
//        int m = arr.length;
//        int[][] _arr = new int[m][m];
//
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<m; j++) {
//                _arr[i][j] = arr[m-1-j][i];
//            }
//        }
//
//        return _arr;
//
//        // for (int i=0; i<m; i++) {
//        //     for (int j=0; j<m; j++) {
//        //         switch (deg) {
//        //             case 90:
//        //                 _arr[i][j] = arr[m-1-j][i];
//        //                 break;
//        //             case 180:
//        //                 _arr[i][j] = arr[m-1-i][m-1-j];
//        //                 break;
//        //             case 270:
//        //                 _arr[i][j] = arr[j][m-1-i];
//        //                 break;
//        //         }
//        //     }
//        // }
//    }