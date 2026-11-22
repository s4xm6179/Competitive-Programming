import java.io.*;
import java.util.*;
 
public class AProblemFromDolgoderevenskoye{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            long x = Long.parseLong(br.readLine());
            if(x%4==2){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}

/* 
contest : Div2-1137
link : https://codeforces.com/contest/2289
*/

/*

I was not able to solve this problem duirng contest.
I was trying the general sqrt(x) for loop technique for finding even and odd factors and then just compare them were they equal or not.
if they are equal means the ans is no else ans will be yes.but this got me tle two time. i tried to optimize it duirng whole contest but not able to make it.
later when i was upsolving i took chat gpt help to understand and upsolve this.
found out technique or mathmatical observation which is this :-

see a positive number can be formed like this N = 2^k * m.
here 2^k means the highest power of 2 that can devide N.  (k>=0)
and m is the odd number which is remained after N/2^k.
now,
N = 2^k * m.
lets say d is the count of odd divisors.
if we see N = 2^k * m. the odd divisors N are the divisors of m(including 1 and m)

odd divisors count = count of divisors of m(including 1 and m) = d

now lets understand the 2^k role here.

if we multiple factors of m with 2^1,2^2,...2^k we will get all even factors.
because the from 2^1 ... 2^k their value will be always even cuz they are power of 2 and the divisors of m will always of be odd cuz m is odd.
and odd * even is always even.

so now we got the count of even devisors here
even divisors count = k * d. (cuz we are doing 2^1 ... 2^k  * all divisors of m)

now we know from the start that if the count of even divisors and odd divisors are same then the ans will be no else it will be yes.

so lets derive the condition for ans = No

even divisors count = odd divisors count
k * d = d 
divide both side with d cuz it is common on both side
k = 1

here we got the condition for the N where k ==1 means the ans is No.

so lets implement it
N = 2^k * m
N = 2 * m

now here is one important thing every odd num is (2 * x) + 1.
N = 2 * ((2x)+1)
N = 4x + 2

means for the N where the ans is No. if we divide it with 4
there will always be a remider 2.

so inshort for the ans = No the condition becomes N%4==2. 
if the condition is satisfying then ans is No
else ans is Yes