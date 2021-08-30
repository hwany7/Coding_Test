package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     *
     */

    static int answer = Integer.MIN_VALUE;
    static int c;
    static int n;

    public void DFS(int index, int sum, int[] arr){
        if (sum > c) return;

        if (index == n){
            answer = Math.max(answer, sum);
        }else {
            DFS(index+1, sum+arr[index], arr);
            DFS(index+1, sum, arr);
        }
    }

    public static void main(String[] args) {

        //Input:    6
        //          1 3 5 6 7 10
        //Output:   YES

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}