import java.io.*;
import java.util.*;

public class bGiftsFixing {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        int n = Integer.parseInt(br.readLine());
        int[] candies  = new int[n];
        int[] oranges = new int[n];
        int candiesMin = Integer.MAX_VALUE;
        int orangesMin = Integer.MAX_VALUE;
        StringTokenizer a = new StringTokenizer(br.readLine()), b = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
          candies[i] = Integer.parseInt(a.nextToken());
          oranges[i] = Integer.parseInt(b.nextToken());
          candiesMin = Math.min(candiesMin,candies[i]);
          orangesMin = Math.min(orangesMin,oranges[i]);
        }
        long ans = 0;
        for(int i = 0;i<n;i++){
          ans += Math.max(candies[i]-candiesMin, oranges[i]-orangesMin);
        }
        System.out.println(ans);
      }
    }
}

/*
Problem: Codeforces 1399B - Gifts Fixing
Link: https://codeforces.com/problemset/problem/1399/B
*/