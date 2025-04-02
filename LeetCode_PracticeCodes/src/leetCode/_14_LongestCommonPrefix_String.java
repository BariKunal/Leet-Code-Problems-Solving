package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class _14_LongestCommonPrefix_String {

	
	    public String longestCommonPrefix(String[] strs) {
	        Arrays.sort(strs);
	        String str1 = strs[0];
	        String str2 = strs[strs.length-1];
	        int i=0;
	        while(i<str1.length())
	        {
	            if(str1.charAt(i)==str2.charAt(i))
	            {
	                i++;
	            }
	            else{
	                break;
	            }
	        }
	        return i==0?"":str1.substring(0,i);
	    }
	    public static void main(String args[])
	    {
//	        String str[]={"flower","flow","flight"};
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("How Many Elements You want to Add in String :");
	        int size = sc.nextInt();
	        sc.nextLine();
	        String str[] = new String[size];
	        System.out.println("Enter The String Elements :"+size);
	        for(int i=0; i<size; i++) {
	        	str[i]=sc.nextLine();
	        }
	        _14_LongestCommonPrefix_String sol = new _14_LongestCommonPrefix_String();
	        System.out.println("Longest Common Prefix :"+sol.longestCommonPrefix(str));
	    }
	

}
