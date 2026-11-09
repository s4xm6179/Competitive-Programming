import java.util.*;
import java.io.*;

public class dManhattanCircle {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int rowStart = 0, colStart = m+1, diameter = 0;
        for(int i = 0;i<n;i++){
          String s = br.readLine();
          int tempColStart = m+1;
          for(int j = 0;j<m;j++){
              if(tempColStart==m+1 && s.charAt(j)=='#'){
                tempColStart = j+1;
              }
          }
          if(rowStart==0 && tempColStart<m+1){
            rowStart = i+1;
          }
          if(tempColStart!=m+1){
            diameter++;
          }
          colStart = Math.min(colStart,tempColStart);
        }
        System.out.println((rowStart + (diameter/2)) + " " + (colStart + (diameter/2)));
      }
    }
}


/*
Problem: Codeforces 1985D - Manhattan Circle
Link: https://codeforces.com/problemset/problem/1985/D
*/