package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * answer[0] <- 1
     * answer[1] <- 1
     * for i=2 ~ n :
     *      answer[i] = answer[i-2] + answer[i-3]
     */

    public int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void pivo(int n){
        int a=1, b=1,c ;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.print((c + " "));
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        //Input:    10
        //Output:   1 1 2 3 5 8 13 21 34 55

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int x: T.solution(n)){
            System.out.print(x + " ");
        }

        System.out.println();
        pivo(n);
    }


}