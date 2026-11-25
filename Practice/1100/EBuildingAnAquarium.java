import java.io.*;
import java.util.*;

public class EBuildingAnAquarium {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t--  > 0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
          arr[i] = Integer.parseInt(st.nextToken());
        }
        int high = Integer.MAX_VALUE, low = 1;
        int ans = 1;
        while(low<=high){
          int mid = low + (high-low)/2;
          long sum = 0;
          for(int i = 0;i<n;i++){
            if(arr[i]<mid){
              sum += (mid-arr[i]);
            }
          }
          if(sum <= x){
            ans = mid;
            low = mid+1;
          }else{
            high = mid-1;
          }
        }
        System.out.println(ans);
      }
    }
}

/*
Codeforces: 1873E - Building an Aquarium
https://codeforces.com/problemset/problem/1873/E
*/