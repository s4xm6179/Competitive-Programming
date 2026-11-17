import java.io.*;
import java.util.*;

public class BEraseFirstOrSecondLetter{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            HashSet<Character>set = new HashSet<>();
            long ans = 0;
            for(int i = 0;i<n;i++){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                    ans += (n-i-1);
                }
            }
            ans += set.size();
            System.out.println(ans);
        }
    }
}

/*
Codeforces: 1917B - Erase First or Second Letter
link : https://codeforces.com/problemset/problem/1917/B 
*/