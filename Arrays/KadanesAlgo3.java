//this is actual kadanes algorithm, other kadanes java files are brutforce waysss
public class KadanesAlgo3 {
    public static void main(String[] args) {
        int[] nums = { -3, 2, -1, 4, -2 };
        KadanesAlgo3 kl = new KadanesAlgo3();
        System.out.println(kl.findMaxSubArraySum(nums));
    }
    public int findMaxSubArraySum(int[] nums) {
        int maxSumSoFar = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(maxSum + nums[i], nums[i]);
            if (maxSumSoFar < maxSum) {
                maxSumSoFar = maxSum;
            }
        }
        return maxSumSoFar;
    }
}
