import java.io.*;
import java.util.*;

public class BBogosort{
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
            Arrays.sort(arr);
            for(int i =n-1;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

/*
Problem: Codeforces 1312B - Bogosort
Link: https://codeforces.com/problemset/problem/1312/B
*/