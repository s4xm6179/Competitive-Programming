import java.io.*;
import java.util.*;

public class bNumbersBox {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int sum = 0, smallestNum = -1,negativeNumCount = 0;
        boolean flag = false;
        for(int i = 0;i<n;i++){
          st = new StringTokenizer(br.readLine());
          for(int j = 0;j<m;j++){
            int num = Integer.parseInt(st.nextToken());
            sum += Math.abs(num);
            if(smallestNum==-1){
              smallestNum = Math.abs(num);
            }
            if(num==0){
              flag= true;
            }
            if(num<0){
              negativeNumCount++;
            }
            smallestNum = Math.min(smallestNum,Math.abs(num));
          }
        }
        if(negativeNumCount%2!=0 && !flag){
          sum -= smallestNum * 2;
        }
        System.out.println(sum);
      }
    }
}


/*
Problem: Codeforces 1447B - Numbers Box
Link: https://codeforces.com/problemset/problem/1447/B
*/