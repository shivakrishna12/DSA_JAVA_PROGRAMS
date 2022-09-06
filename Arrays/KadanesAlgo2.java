//kadanes algorithm ---before https://www.enjoyalgorithms.com/blog/maximum-subarray-sum 


public class KadanesAlgo2 {
    public static void main(String[] args){
        int[] nums={-3,2,-1,4,-2};
       System.out.println("MaxSum::" +findMaxSumSubArray(nums));

    }
public static int findMaxSumSubArray(int[] nums){
      int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        int subSum=0;
        for(int j=i;j<nums.length;j++){
             subSum=subSum+nums[j];
             if(subSum > maxSum){
                maxSum=subSum;
         }
        }
        
      
    }
    return maxSum;
}
}
