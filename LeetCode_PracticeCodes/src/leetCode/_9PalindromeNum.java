package leetCode;
import java.util.*;
public class _9PalindromeNum {
      
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        if(x<0) return false;
        while(temp!=0)	
        {
           int rem = temp % 10;
            rev = rev * 10 + rem;
            temp/=10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
    
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();

        _9PalindromeNum sol = new _9PalindromeNum();
        boolean res = sol.isPalindrome(n);
        if(res)
        {
            System.out.println(res);
        }
        else{
            System.out.println(res);
        }
    }
}
