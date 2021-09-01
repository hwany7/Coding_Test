package basic.inflearn;

import java.util.Scanner;

public class Main {
    static int[][] memo;

    public int comb (int n, int r) {
        if(memo[n][r] > 0) return memo[n][r];

        if(n==r || r==0) return 1;
        else return memo[n][r] = comb(n-1, r-1) + comb(n-1, r);
    }

    /***
     * 조합의 식: nCr = (n-1)C(r-1) + (n-1)C(r)
     *
     * ex) 5C3 = 4C2 + 4C3
     *
     * {1, 2, 3, 4 ,5} 의 배열이 있다고 생각하자
     * 1을 기준으로 봤을때는
     * 자신이 포함된 경우(1)
     * 자신이 포함되지 않은 경우(2)가 존재하는데
     * (1)의 경우에는 나머지 {2, 3, 4, 5} 중에 2개를 뽑아야 하므로 4C2이 나오고
     * (2)의 경우에는 나머지 {2, 3 ,4, 5} 중에 3개를 뽑아야 하므로 4C3이 나온다
     *
     * 따라서 두개의 합인 4C2 + 4C3 = 5C3으로 표현 가능하다
     * 이러한 표현을 사용하는 이유는 DFS 코딩하기 용이한 표현이기 때문이다
     */

    public static void main(String[] args) {

        //Input:    5 3
        //Output:   10

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int r = kb.nextInt();
        memo = new int[n+1][r+1];

        System.out.println(T.comb(n, r));

    }
}