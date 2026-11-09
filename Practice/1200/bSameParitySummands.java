import java.io.*;
import java.util.*;

public class bSameParitySummands {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        if(n<k){
          System.out.println("NO");
          continue;
        }
        if(n%2==0 && n>= 2*k){
          System.out.println("YES");
          for(int i = 0;i<k-1;i++){
            System.out.print(2 + " ");
            n -= 2;
          }
          System.out.println(n);
          continue;
        }
        if(n%2!=k%2){
          System.out.println("NO");
          continue;
        }
        System.out.println("YES");
        for(int i = 0;i<k-1;i++){
          System.out.print(1 + " ");
          n-= 1;
        }
        System.out.println(n);
      }
    }
}

/*
Problem: Codeforces 1352B - Same Parity Summands
Link: https://codeforces.com/problemset/problem/1352/B
*/