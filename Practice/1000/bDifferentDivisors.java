import java.io.*;
import java.util.*;

public class bDifferentDivisors{
    public static boolean checkPrime(int n){
      for(int i = 2;i*i<=n;i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
    public static boolean checkWorth(int n, int d, int secondDivisor){
      int close = 1;
      for(int i = 2;i*i<=n;i++){
        if(n%i==0){
          if(i-close >= d && Math.abs(secondDivisor-i) >=d){
            close = i;
            continue;
          }else{
            return false;
          }
        }
      }
      return true;
    }
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        int d = Integer.parseInt(br.readLine());
        int secondDivisor = d+1;
        while(!checkPrime(secondDivisor)){
          secondDivisor++;
        }
        int thirdDivisor = secondDivisor+d;
        while(!checkWorth(thirdDivisor,d,secondDivisor)){
          thirdDivisor++;
        }
        System.out.println(secondDivisor * thirdDivisor);
      }
    }
}


/*
Problem: Codeforces 1474B - Different Divisors
Link: https://codeforces.com/problemset/problem/1474/B
*/

