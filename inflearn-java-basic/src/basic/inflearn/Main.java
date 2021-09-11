package basic.inflearn;

import java.util.*;

class Solution {
    int[] arr;
    int[] comb;
    int[] answer;
    int m;

    public int[] solution(int n, int[] shot) {
        answer = new int[11];
        comb = new int[11];
        arr = shot;
        m = n;

        return answer;
    }

    public void dfs(int level, int use) {
        if(level == 9) {
            return;
        }else {

            dfs(level+1, use);

        }
        //정해져있는 m
        //arr shout

    }


}

public class Main {

    public static void main(String[] args) {
        Solution s =  new Solution();

        int n = 5;
        int[] arr = {1, 0, 2, 1, 0, 1, 0, 0, 0, 0};
        int[] answer =  s.solution(n, arr);

        for(int x : answer) System.out.print(x + " ");


    }
}