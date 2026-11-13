import java.io.*;
import java.util.*;

public class CMoveBrackets{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Deque<Character>deque = new ArrayDeque<>();
            for(int i = 0;i<n;i++){
                if(!deque.isEmpty()){
                    if(deque.peekLast()=='(' && s.charAt(i)==')'){
                        deque.pollLast();
                        continue;
                    }
                }
                deque.offerLast(s.charAt(i));
            }
            System.out.println((deque.size()/2));
        }
    }
}

/*
Problem: Codeforces 1374C - Move Brackets
Link: https://codeforces.com/problemset/problem/1374/C
*/