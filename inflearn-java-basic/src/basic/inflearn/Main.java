package basic.inflearn;

import java.util.Scanner;

public class Main {

    static int n;
    static int[] check;

    public void DFS(int L){

    }

    public static void main(String[] args) {

        //Input:    3
        //Output:   1 2 3
        //          1 2
        //          1 3
        //          1
        //          2 3
        //          2
        //          3

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        check = new int[n+1];
        T.DFS(1);
    }
}