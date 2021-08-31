package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * new int[m] pm
     * DFS(level):
     *      if  level == m:
     *          output:
     *      else:
     *          for i=1 ~ n+1:
     *              pm[level] = i
     *              DFS(level+1)
     */

    static int[] pm;
    static int n;
    static int m;

    public void DFS (int level) {
        if (level == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        }else {
            for (int i=1; i<n+1; i++) {
                pm[level] = i;
                DFS(level+1);
            }
        }

    }

    public static void main(String[] args) {

        //Input:    3 2
        //Output:   1 1
        //          1 2
        //          1 3
        //          2 1
        //          2 2
        //          2 3
        //          3 1
        //          3 2
        //          3 3

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];

        T.DFS(0);

    }
}