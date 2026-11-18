import java.io.*;
import java.util.*;

public class AYoungPhysicist{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0,z = 0;
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x += Integer.parseInt(st.nextToken());
            y += Integer.parseInt(st.nextToken());
            z += Integer.parseInt(st.nextToken());
        }
        if(x==y && y==z && x==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

/*
Codeforces: 69A - Young Physicist
https://codeforces.com/problemset/problem/69/A
*/