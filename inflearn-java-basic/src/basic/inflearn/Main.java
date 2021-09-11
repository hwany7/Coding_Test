package basic.inflearn;

import java.util.*;

class Solution {
    int[] arr;
    int[] comb;
    int[] answer;
    int m;
    int max = Integer.MIN_VALUE;

    public int[] solution(int n, int[] shot) {
        answer = new int[10];
        comb = new int[10];
        arr = shot;
        m = n;

        dfs(0, 0, 0);

        return answer;
    }

    public void dfs(int level, int use, int score) {
        if(use > m) return;
        else if(use == m) {
            if(score > max){
                for(int i = level; i<comb.length; i++) comb[i] = 0;
                max = score;
                answer = comb.clone();
                System.out.println("맥스 힛트" + max);
            }
            return;
        }

        if(level == 10) {
            return;
        }else {
            int _use = arr[level]+1;
            int _score = (10-level);

            comb[level] = _use;
            dfs(level+1, use+_use, score+_score); //사용

            comb[level] = 0;
            dfs(level+1, use, score);//미사용
        }
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