import java.io.*;
import java.util.*;

public class BDiverseString{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            int zeros  = 0, ones = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)=='1'){
                    ones++;
                }else{
                    zeros++;
                }
            }
            int Max = Math.max(ones,zeros), Min = Math.min(ones,zeros);
            Max = Max + Math.min(k,Min);   
            Min = Min - Math.min(k,Min);
            long ans = 1 + (((long)Max * (Max+1))/2) + (((long)Min * (Min+1))/2);
            System.out.println(ans);
        }
    }
}

/*
contest: Div2/1135
link : https://codeforces.com/contest/2285 
*/

/* 
I was not able to solve this question during contest :(
I brain had gone completely blank while attempting this question.
I was not able to find an approach and not able to find the mathematical formula to count the no. of distinct options.
During upsolving I took chatgpt help and understand the problem. 
Understood the mathematical formula and the approach for this solution which was not so hard to understand.
This was a good upsolve. Hope I will remember the learning from here and implement it in future :)