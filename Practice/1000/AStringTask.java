import java.io.*;
import java.util.*;

public class AStringTask{
    public static void main(String[] args)throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        HashSet<Character>vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('o');
        vowels.add('i');
        vowels.add('u');
        vowels.add('y');
        for(int i = 0;i<s.length();i++){
            int ch = (int)s.charAt(i);
            if(ch<97){
                ch += 32;
            }
            if(!vowels.contains((char)ch)){
                sb.append('.');
                sb.append((char)ch);
            }
        }
        System.out.println(sb.toString());
    }

/*
Problem: Codeforces 118A - String Task
Link: https://codeforces.com/problemset/problem/118/A
*/