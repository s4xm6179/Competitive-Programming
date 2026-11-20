import java.io.*;
import java.util.*;

public class CYarikAndArray{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken()), sum =Math.max(pre,0),ans = pre;
            for(int i = 1;i<n;i++){
                int curr = Integer.parseInt(st.nextToken());
                ans = Math.max(ans, curr);
                if(Math.abs(pre%2)==Math.abs(curr%2)){
                    sum = Math.max(curr,0);
                }else{
                    sum += curr;
                    ans = Math.max(ans,sum);
                    sum = Math.max(sum,0);
                }
                pre = curr;
            }
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1899C - Yarik and Array
https://codeforces.com/problemset/problem/1899/C
*/