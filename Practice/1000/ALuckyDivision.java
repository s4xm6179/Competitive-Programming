import java.io.*;
import java.util.*;
 
public class ALuckyDivision{
    public static int doesItOk(int n,int x){
      if(n>x){
        return 0;
      }
      if(n>0 && x%n==0){
        return 1;
      }
      int a = (n*10) + 4;
      int b = (n*10) + 7;
      return (doesItOk(a,x)|doesItOk(b,x));
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(1==doesItOk(0,n)){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
    }
}

/*
Codeforces: 122A - Lucky Division
https://codeforces.com/problemset/problem/122/A
*/