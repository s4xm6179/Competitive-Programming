import java.io.*;
import java.util.*;

public class AChatRoom{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String hello = "hello+";
        int k = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==hello.charAt(k)){
                k++;
            }
        }
        if(k==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

/*
Codeforces: 58A - Chat Room
https://codeforces.com/problemset/problem/58/A
*/