import java.io.*;
import java.util.*;

public class aFloorNumber {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        int ans = 1;
        n-= 2;
        if(n>0){
          ans += (n/x);
          if(n%x > 0){
            ans++;
          }
        }
        System.out.println(ans);
      }
    }
}

/*
Problem: Codeforces 1426A - Floor Number
Link: https://codeforces.com/problemset/problem/1426/A
*/