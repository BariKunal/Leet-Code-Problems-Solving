package leetCode;
import java.util.*;
public class _35_Search_Element_Index {

	public int searchInsert(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>=target) {
				return i;
			}
		}
		return nums.length;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the target value ");
		int tar = sc.nextInt();

		_35_Search_Element_Index sol = new _35_Search_Element_Index();
		System.out.println("Index  :" + sol.searchInsert(a, tar));
	}

}
