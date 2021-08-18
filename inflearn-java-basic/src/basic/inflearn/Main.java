package basic.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {

    /*
     * new Person(int id, int priority)
     * new Queue
     *
     * for i ~ n:
     *      q.offer(new Person(i, arr[i])
     *
     * while(q.isNotEmpty()):
     *      Person tmp <- q.poll()
     *      for x in q:
     *          if x.priority > tmp.priority:
     *              q.offer(tmp)
     *              tmp <- null
     *              break
     *      if tmp != null:
     *          answer++
     *          if tmp.id == m:
     *              return answer;
     *
     */

    class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            q.offer(new Person(i, arr[i]));
        }

        while (!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority > tmp.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == m) return answer;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        //Input:    5 2
        //          60 50 70 80 90
        //Output:   3

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));

    }

}