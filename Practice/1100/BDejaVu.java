import java.io.*;
import java.util.*;

public class BDejaVu{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            long[] arr = new long[n];
            int[] que = new int[q];
            HashMap<Long,Long>map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            int k = 0;
            for(int i = 0;i<n;i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i = 0;i<q;i++){
                que[i] = Integer.parseInt(st.nextToken());
            }
            for(int i = 0;i<n;i++){
                if(arr[i]%2!=0){
                    continue;
                }
                if(map.containsKey(arr[i])){
                    arr[i] = map.get(arr[i]);
                    continue;
                }
                long num = arr[i];
                for(int j =0;j<q;j++){
                    if(arr[i]%(1<<que[j])==0){
                        arr[i] += (1L<<(que[j]-1));
                    }
                    if(arr[i]%2==1){
                        break;
                    }
                }
                map.put(num,arr[i]);
            }
            for(int i = 0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

/*
Codeforces: 1891B - Deja Vu
https://codeforces.com/problemset/problem/1891/B
*/