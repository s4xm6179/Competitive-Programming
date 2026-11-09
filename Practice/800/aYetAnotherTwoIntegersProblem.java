import java.io.*;
import java.util.*;

public class aYetAnotherTwoIntegersProblem{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int ans = 0;
            if(Math.abs(a-b)>0){
                ans = (Math.abs(a-b)/10) + (Math.abs(a-b)%10>0 ? 1 : 0);
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1409A - Yet Another Two Integers Problem
Link: https://codeforces.com/problemset/problem/1409/A
*/