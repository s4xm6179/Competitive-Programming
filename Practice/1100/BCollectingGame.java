import java.io.*;
import java.util.*;

public class BCollectingGame{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int[] sortArr = new int[n];
            HashMap<Integer,Integer> map = new HashMap<>();
            HashSet<Integer>set = new HashSet<>();
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sortArr[i] = arr[i];
            }
            Arrays.sort(sortArr);
            long sum = 0;
            for(int i = 0;i<n-1;i++){
                sum+= sortArr[i];
                if(sum >= sortArr[i+1]){
                    set.add(sortArr[i]);
                }else{
                    map.put(sortArr[i],i);
                    for(int s : set){
                        map.put(s,i);
                    }
                    set.clear();
                }
            }
            if(!set.isEmpty()){
                for(int s : set){
                    map.put(s,n-1);
                }
            }
            map.put(sortArr[n-1],n-1);
            for(int i = 0;i<n;i++){
                System.out.print(map.get(arr[i]) + " ");
            }
            System.out.println();
        }
    }
}

/*
Codeforces: 1904B - Collecting Game
https://codeforces.com/problemset/problem/1904/B
*/
