package leetCode;

import java.util.Scanner;

public class _27_Remove_Ele_Array {

	public int removeElement(int[] nums, int val){
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int []a = new int[size];
		System.out.println("Enter the Array Elements in Array :");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter The Value for Delete :");
		int value = sc.nextInt();
		
		_27_Remove_Ele_Array delete = new _27_Remove_Ele_Array();
		int resSize = delete.removeElement(a,value);
		System.out.println("After Delete Values in Array :");
		for(int i=0; i<resSize; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
