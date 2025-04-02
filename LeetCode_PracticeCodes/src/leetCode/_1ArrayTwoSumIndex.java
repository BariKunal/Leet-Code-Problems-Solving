package leetCode;
import java.util.*;
public class _1ArrayTwoSumIndex {


    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Array :");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter The Target Sum ");
        int t = sc.nextInt();

        _1ArrayTwoSumIndex solution = new _1ArrayTwoSumIndex(); 
        int []result=solution.twoSum(a,t);
        if(result.length==2)
        {
            System.out.print("Sum OF targeted element indices :"+result[0]+" "+result[1]);
        }
        else{
            System.out.println("Not Found");
        }
    
    }
}
