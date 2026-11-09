import java.io.*;
import java.util.*;

public class bCollectingPackages{
    public static void main(String[] args)throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-- > 0){
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer,ArrayList<Integer>>map = new HashMap<>();
        HashSet<Integer>setOfX = new HashSet<>();
        setOfX.add(0);
        map.put(0,new ArrayList<>());
        StringBuilder path = new StringBuilder();
        String ans = "YES";
        for(int i = 0;i<n;i++){
          StringTokenizer st = new StringTokenizer(br.readLine());
          int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
          setOfX.add(x);
          if(!map.containsKey(x)){
            map.put(x,new ArrayList<>());
          }
          map.get(x).add(y);
        }
        int[] widths = new int[setOfX.size()];
        int k = 0;
        for(int s : setOfX){
          widths[k++] = s;
        }
        Arrays.sort(widths);
        int currentX = 0, currentY = 0;
        for(int i = 0;i<k && ans.equals("YES");i++){
          while(currentX < widths[i]){
            currentX++;
            path.append('R');
          }
          Collections.sort(map.get(widths[i]));
          for(int j = 0;j<map.get(widths[i]).size();j++){
            if(map.get(widths[i]).get(j) < currentY){
              ans = "NO";
              break;
            }
            while(currentY < map.get(widths[i]).get(j)){
              currentY++;
              path.append('U');
            }
          }
        }
        System.out.println(ans);
        if(ans.equals("YES")){
          System.out.println(path.toString());
        }
      }
    }
}

/*
Problem: Codeforces 1294B - Collecting Packages
Link: https://codeforces.com/problemset/problem/1294/B
*/