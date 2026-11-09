import java.io.*;
import java.util.*;

public class aAlmostPrime{
    public static boolean isAlmostPrime(int n){
      HashSet<Integer>set = new HashSet<>();
      int factor = 2;
      while(factor <= n){
        while(n%factor==0){
          set.add(factor);
          n/=factor;
        }
        factor++;
      }
      if(n>1){
        set.add(n);
      }
      if(set.size()==2){
        return true;
      }
      return false;
    }
    public static void main(String[] args)throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      for(int i = 6;i<=n;i++){
        if(isAlmostPrime(i)){
          count++;
        }
      }
      System.out.println(count);
    }
}

/*
Problem: Codeforces 26A - Almost Prime
Link: https://codeforces.com/problemset/problem/26/A
*/