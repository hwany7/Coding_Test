package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * for i=1 ~ n:
     *      tmp <- arr[i]
     *      j <- none
     *      for j=i-1 ~ j>-1, j--:
     *          if arr[j] > tmp:
     *              arr[j+1] <- arr[j]
     *          else:
     *              break;
     *      arr[j+1] <- tmp
     *
     */

    public int[] solution(int n, int[] arr) {

        for(int i=1; i<n; i++){
            int tmp = arr[i];
            int j;

            for(j=i-1; j>-1; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {

        //Input:    6
        //          11 7 5 6 10 9
        //Output:   5 6 7 9 10 11

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }

    }

}