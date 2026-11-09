import java.io.*;
import java.util.*;

public class aLightsOut{
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[][] grid = new int[3][3];
      for(int i = 0;i<3;i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        grid[i][0] = Integer.parseInt(st.nextToken());
        grid[i][1] = Integer.parseInt(st.nextToken());
        grid[i][2] = Integer.parseInt(st.nextToken());
      }
      for(int i = 0;i<3;i++){
        for(int j = 0;j<3;j++){
          int count = 0;
          if(grid[i][j]%2==1){
            count++;
          }
          if(i>0){
            count += (grid[i-1][j]%2==1 ? 1 : 0);
          }
          if(i<2){
            count += (grid[i+1][j]%2==1 ? 1 : 0);
          }
          if(j>0){
            count += (grid[i][j-1]%2==1 ? 1 : 0);
          }
          if(j<2){
            count += (grid[i][j+1]%2==1 ? 1 : 0);
          }
          if(count%2==1){
            System.out.print('0');
          }else{
            System.out.print('1');
          }
        }
        System.out.println();
      }
    }
}

/*
Problem: Codeforces 275A - Lights Out
Link: https://codeforces.com/problemset/problem/275/A
*/