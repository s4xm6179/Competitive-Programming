import java.io.*;
import java.util.*;

public class AJohnnyAndAncientComputer{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
            if(a==b){
                System.out.println(0);
                continue;
            }
            long div = Math.max(a,b)/Math.min(a,b), ans = -1;
            if(Math.max(a,b)%Math.min(a,b)==0 && div%2==0){
                ans = 0;
                while(div%8==0 && div>0){
                    ans++;
                    div/=8;
                }
                while(div%4==0 && div>0){
                    ans++;
                    div/=4;
                }
                while(div%2==0 && div>0){
                    ans++;
                    div/=2;
                }
                if(div>1){
                    ans = -1;
                }
            }
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1362A - Johnny and Ancient Computer
Link: https://codeforces.com/problemset/problem/1362/A
*/