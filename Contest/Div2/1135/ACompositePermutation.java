import java.io.*;
import java.util.*;

public class ACompositePermutation{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            if(n<4){
                System.out.println(-1);
                continue;
            }
            if(n%2==1){
                System.out.print((n-1) + " " + (n) + " " + (n-2) + " " + 1 + " ");
                for(int i = n-3;i>1;i--){
                    System.out.print(i + " ");
                }
                System.out.println();
                continue;
            }
            for(int i = n;i>=1;i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
contest: Div2/1135
link : https://codeforces.com/contest/2285 
*/