import java.io.*;
import java.util.*;

public class AYoumuKonpakuAndTheDuel{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int x = Integer.parseInt(br.readLine());
            int n= 1,sum = 1;
            while(sum < x){
                n++;
                sum+=n;
            }
            int ans = n-1;
            int mm = x;
            int m = n;
            while(mm > 0){
                mm -= m;
                m--;
                ans++;
            }

            while(n<ans){
                n++;
                m = n;
                mm = x;
                int tempCount = 0;
                while(mm > 0){
                    mm -= m;
                    m--;
                    tempCount++;
                }
                if(ans < ((n-1) + tempCount)){
                    break;
                }else{
                    ans = ((n-1) + tempCount);
                }
            }
            System.out.println(ans);
        }
    }
}

/*
contest : Div2-1136
link : https://codeforces.com/contest/2287
*/