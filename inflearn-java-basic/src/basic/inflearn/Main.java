package basic.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    /*
     * new Queue
     * for i=1 ~ n+1:
     *      queue.offer(i)
     * while queue.isNotEmpty():
     *      for i=1 ~ k:
     *          queue.offer(queue(poll())
     *      queue.poll()
     *      if queue.size() == 1:
     *          answer <- queue.poll()
     */

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<n+1; i++){
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for(int i=1; i<k; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }


        return answer;
    }

    public static void main(String[] args) {

        //Input:    8 3
        //Output:   7

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.println(T.solution(n, k));

    }

}