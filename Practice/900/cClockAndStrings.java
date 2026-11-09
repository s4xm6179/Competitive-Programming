import java.util.*;
import java.io.*;
public class cClockAndStrings {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       while(t-- > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
            if(a>b){
               int temp = a;
               a = b;
               b = temp;
            }
            if(c > a &&  c < b){
              if(d > b || d < a){
                System.out.println("YES");
              }else{
                System.out.println("NO");
              }
            }else if( d > a && d < b){
              if(c > b || c < a){
                System.out.println("YES");
              }else{
                System.out.println("NO");
              }
            }else{
              System.out.println("NO");
            }
       }
    }
}

/*
Problem: Codeforces 1971C - Clock and Strings
Link: https://codeforces.com/problemset/problem/1971/C
*/