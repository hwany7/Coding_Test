package basic.inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static class Point implements Comparable<Point>{
        public int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y; //내림차순은 o.y - this.y
            else return this.x - o.x;
        }
    }

    public static void main(String[] args) {

        //Input:    5
        //          2 7
        //          1 3
        //          1 2
        //          2 5
        //          3 6

        //Output:   1 2
        //          1 3
        //          2 5
        //          2 7
        //          3 6

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }

        Collections.sort(arr);

        for(Point o : arr){
            System.out.println(o.x + " " + o.y);
        }

    }

}