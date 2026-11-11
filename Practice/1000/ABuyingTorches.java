import java.io.*;
import java.util.*;

public class ABuyingTorches{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            long totalSticks = ((long)k*y) + (k-1);
            long ans = k + (totalSticks/(x-1)) + (totalSticks%(x-1)!=0?1 : 0);
            System.out.println(ans);
        }
    }
}

/*
Problem: Codeforces 1418A - Buying Torches
Link: https://codeforces.com/problemset/problem/1418/A
*/