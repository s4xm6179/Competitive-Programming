import java.io.*;
import java.util.*;

public class BFairNumbers{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long n = Long.parseLong(br.readLine());
            boolean flag = false;
            n--;
            while(!flag){
                n++;
                long m = n;
                while(m>0){
                    flag = true;
                    long d = m%10;
                    m/=10;
                    if(d==0){
                        continue;
                    }
                    if(n%d!=0){
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println(n);
        }
    }
}

/*
Problem: Codeforces 1411B - Fair Numbers
Link: https://codeforces.com/problemset/problem/1411/B
*/