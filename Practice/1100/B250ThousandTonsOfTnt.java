import java.io.*;
import java.util.*;

public class B250ThousandTonsOfTnt{
    static HashSet<Integer>factors;
    public static void findFactors(int n){
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                factors.add(i);
                factors.add(n/i);
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long ans = 0;
            factors = new HashSet<>();
            findFactors(n);
            for(int f : factors){
                long max = 0,min = Long.MAX_VALUE;
                for(int i = 0;i<n;i+=f){
                    long sum = 0;
                    for(int j = i;j<i+f;j++){
                        sum += arr[j];
                    }
                    max = Math.max(max,sum);
                    min = Math.min(min,sum);
                }
                ans = Math.max(ans, (max-min));
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1899B - 250 Thousand Tons of TNT
https://codeforces.com/problemset/problem/1899/B
*/