import java.io.*;
import java.util.*;
 
public class B2DTraveling{
    public static void main(String[] args)throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        long [] x = new long[n];
        long [] y = new long[n];
        for(int i = 0;i<n;i++){
          st = new StringTokenizer(br.readLine());
          x[i] = Long.parseLong(st.nextToken());
          y[i] = Long.parseLong(st.nextToken());
        }
        if(a<=k && b<=k){
          System.out.println(0);
        }else{
          long ans = Math.abs(x[a-1] - x[b-1]) + Math.abs(y[a-1] - y[b-1]);
          if(k>0){
            long ANeighbour = Long.MAX_VALUE, BNeighbour = ANeighbour;
            for(int i = 0;i<k;i++){
              long temp = Math.abs(x[a-1]-x[i]) + Math.abs(y[a-1] - y[i]);
              ANeighbour = Math.min(ANeighbour,temp);
              temp = Math.abs(x[b-1]-x[i]) + Math.abs(y[b-1] - y[i]);
              BNeighbour = Math.min(BNeighbour,temp);
            }
            ans = Math.min(ans, ANeighbour + BNeighbour);
          }
          System.out.println(ans);
        }
      }
    }
}

/*
Codeforces: 1869B - 2D Traveling
https://codeforces.com/problemset/problem/1869/B
*/