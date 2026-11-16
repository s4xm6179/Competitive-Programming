import java.io.*;
import java.util.*;

public class ATheatreSquare{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken());
        long vertical = (n%a==0? n/a : (n/a)+1), horizontal = (m%a==0? m/a : (m/a)+1);
        System.out.println(vertical * horizontal);
    }
}

/* 
Codeforces: 1A - Theatre Square 
link : https://codeforces.com/problemset/problem/1/A 
*/