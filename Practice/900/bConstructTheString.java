import java.util.*;
import java.io.*;
public class bConstructTheString {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int tempA = a,tempB = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
          if(tempA==0){
            tempA = a;
            tempB = 0;
          }
          sb.append((char)(97 + tempB));
          if(tempB<b-1){
            tempB++;
          }
          tempA--;
        }
        System.out.println(sb.toString());
      }
    }
}

/*
Problem: Codeforces 1335B - Construct the String
Link: https://codeforces.com/problemset/problem/1335/B
*/