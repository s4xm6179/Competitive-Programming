import java.io.*;
import java.util.*;

public class BEffectiveApproach{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] index = new int[n+1];
        for(int i = 0;i<n;i++){
            index[Integer.parseInt(st.nextToken())] = i;
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long LeftToRight = 0, RightToLeft = 0;
        for(int i = 0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            LeftToRight += index[num] + 1;
            RightToLeft += n - index[num];
        }
        System.out.println(LeftToRight + " " + RightToLeft);
    }
}


/*
Problem: Codeforces 227B - Effective Approach
Link: https://codeforces.com/problemset/problem/227/B
*/
