import java.io.*;
import java.util.*;

public class ECardboardForPictures{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            long w = 0;
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long low = 1, high = Integer.MAX_VALUE;
            while(low <= high){
                long mid = low  + (high-low)/2;
                long sum = 0;
                for(int i = 0;i<n;i++){
                    sum += (((long)arr[i] + mid) * ((long)arr[i] + mid));
                    if(sum < 0){
                        break;
                    }
                } 
                if(sum <= c && sum > 0){
                    w = mid/2;
                    low = mid + 1;
                }else{
                    high = mid-1;
                }
            }
            System.out.println(w);
        }
    }
}

/*
Codeforces: 1850E - Cardboard for Pictures
https://codeforces.com/problemset/problem/1850/E
*/