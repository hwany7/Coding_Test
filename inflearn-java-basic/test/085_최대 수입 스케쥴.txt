package basic.inflearn;

import java.util.*;

public class Main {

    /*
     * new Lecture(int money, int time) impl Comparable
     *
     * solution(list, max, n):
     *      answer <- 0
     *      j <- 0
     *      new PriorityQueue<Integer> pq
     *
     *      sort(list)
     *      for i=max ~ i>0, i--:
     *          for  ~ j<n:
     *              if list[j].time < i:
     *                  break
     *              pq.offer(list[j].money)
     *          if pq.isNotEmpty():
     *              answer += pq.poll()
     */

    static class Lecture implements Comparable<Lecture> {
        int money;
        int time;

        Lecture (int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture lecture) {
            return lecture.time - this.time;
        }
    }

    public int solution (ArrayList<Lecture> list, int max, int n) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(list);

        int j=0;
        for (int i=max; i>0; i--) {
            for( ; j<n; j++) {
                if (list.get(j).time < i) break;
                pq.offer(list.get(j).money);
            }
            if (!pq.isEmpty()) answer += pq.poll();
        }

        return answer;
    }

    public static void main(String[] args) {

        //Input:    6
        //          50 2
        //          20 1
        //          40 2
        //          60 3
        //          30 3
        //          30 1
        //Output:   150

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Lecture> list = new ArrayList<>();
        int max = 0;

        for (int i=0; i<n; i++) {
            int m = kb.nextInt();
            int d = kb.nextInt();

            list.add(new Lecture(m, d));

            if (d > max) max = d;
        }
        System.out.println(T.solution(list, max, n));
    }
}