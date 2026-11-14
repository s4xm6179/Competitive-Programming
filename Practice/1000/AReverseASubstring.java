import java.io.*;
import java.util.*;

public class AReverseASubstring{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int l = 0,r = -1,maxChar = (int)s.charAt(0);
        for(int i = 1;i<n;i++){
            int ch = (int)s.charAt(i);
            if(ch < maxChar){
                r = i;
                break;
            }
            maxChar = ch;
            l = i;
        }
        if(r==-1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            System.out.println(++l + " " + ++r);
        }
    }
}

/*
Problem: Codeforces 1155A - Reverse a Substring
Link: https://codeforces.com/problemset/problem/1155/A
*/