import java.io.*;
import java.util.*;

public class aJuicer {
    public static void main(String[] args)throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
      st = new StringTokenizer(br.readLine());
      int wasteCount = 0, emptyCount = 0;
      for(int i = 0;i<n;i++){
        int size = Integer.parseInt(st.nextToken());
        if(size <= b){
          wasteCount += size;
        }
        if(wasteCount > d){
          wasteCount = 0;
          emptyCount++;
        }
      }
      System.out.println(emptyCount);
    }
}

/*
Problem: Codeforces 709A - Juicer
Link: https://codeforces.com/problemset/problem/709/A
*/