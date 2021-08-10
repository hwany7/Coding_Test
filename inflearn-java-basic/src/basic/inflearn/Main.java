package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * dx <- [-1, 0, 1, 0]
     * dy <- [0, 1, 0, -1]
     * for i ~ n:
     *      for j ~ n:
     *          flag <- ture
     *          for k ~ 4:
     *              nx <- i + dx[k]
     *              ny <- j + dy[k]
     *              if (nx >= 0 and nx < n) and (ny >= 0 and ny < n) and arr[nx][ny] >= arr[i][j] :
     *                  flag <- false
     *                  break
     *          if flag == true:
     *                  answer++
     */

    public int solution(int n, int[][] arr) {

        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        //Input:    5
        //          5 3 7 2 3
        //          3 7 1 6 1
        //          7 2 5 3 4
        //          4 3 6 4 1
        //          8 7 3 5 2
        //Output:   10

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));


    }


}