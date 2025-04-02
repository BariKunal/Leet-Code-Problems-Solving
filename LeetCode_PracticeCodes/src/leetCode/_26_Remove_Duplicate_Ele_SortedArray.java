package leetCode;

import java.util.*;

public class _26_Remove_Duplicate_Ele_SortedArray {

	    public int removeDuplicates(int[] nums) {
	        int j=0;
	        for(int i=1; i<nums.length; i++){
	            if(nums[i]!=nums[j]){
	                j++;
	              nums[j] = nums[i];
	            }
	        }
	        return j+1;

	    }
	    public static void main(String x[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Array Size :");
	        int size = sc.nextInt();
	        int a[] = new int[size];
	        for(int i=0; i<size; i++){
	            a[i]=sc.nextInt();
	        }
	        _26_Remove_Duplicate_Ele_SortedArray sol = new _26_Remove_Duplicate_Ele_SortedArray();
	        int resLength = sol.removeDuplicates(a);
	        for(int i=0; i<resLength; i++){
	             System.out.print(a[i]+" ");
	        }
	       
	    }
	

}
