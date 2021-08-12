package basic.inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    /*
     *  answer <- -1
     * new TreeSet<Integer> treeSet
     *
     * for i ~ n:
     *      for j=i+1 ~ n:
     *          for k=j+1 ~ n:
     *              treeSet.add(arr[i] + arr[j] + arr[l])
     *
     * cnt <- 0
     * for x in treeSet:
     *      cnt++
     *      if cnt == k:
     *          return x
     *
     * return answer
     */

    public int solution(int[] arr, int n, int k) {

        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l =j+1; l<n; l++){
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : treeSet){
            cnt++;
            if(cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {

        //Input:    10 3
        //          13 15 34 23 45 65 33 11 26 42
        //Output:   143

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(arr, n, k));
    }

}