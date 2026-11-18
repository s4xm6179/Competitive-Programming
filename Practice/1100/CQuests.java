import java.io.*;
import java.util.*;

public class CQuests{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            StringTokenizer arr1 = new StringTokenizer(br.readLine());
            StringTokenizer arr2 = new StringTokenizer(br.readLine());
            long sum = 0, maxSum = 0, arr2MaxScore = 0;
            for(int i = 0;i<Math.min(n,k);i++){
                sum += Integer.parseInt(arr1.nextToken());
                arr2MaxScore = Math.max(arr2MaxScore,Integer.parseInt(arr2.nextToken()));
                maxSum = Math.max(maxSum, sum + ((k-i-1) * arr2MaxScore));
            }
            System.out.println(maxSum);
        }
    }
}

/*
Codeforces: 1914C - Quests
https://codeforces.com/problemset/problem/1914/C
*/