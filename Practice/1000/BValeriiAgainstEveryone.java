import java.io.*;
import java.util.*;

public class BValeriiAgainstEveryone{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Integer> set = new HashSet<>();
            String ans = "NO";
            for(int i = 0;i<n;i++){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    ans = "YES";
                }
                set.add(num);
            }
            System.out.println(ans);
        }
    }
}


/*
Problem: Codeforces 1438B - Valerii Against Everyone
Link: https://codeforces.com/problemset/problem/1438/B
*/
