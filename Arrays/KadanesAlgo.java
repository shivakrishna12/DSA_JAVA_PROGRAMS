import java.util.Scanner;

public class KadanesAlgo{

public static void main(String[] args){

    Scanner s=new Scanner(System.in);
    System.out.println("Enter Array Length :");
    int length=s.nextInt();
    int[] nums=new int[length];
    System.out.println("Enter array Elements::");
    for(int i=0;i<length;i++){
            nums[i]=s.nextInt();
    }
    int[] nums1={-3,2,-1,4,-2};
    KadanesAlgo.findMaxSubArray(nums1);
}
public static void findMaxSubArray(int[] nums){
    System.out.println("Hello, I'm in find MaxSubArray Method");
    int maxSum=Integer.MIN_VALUE;
    int startIndex=0;
    int endIndex=0;
for(int i=0;i<nums.length;i++){
 for(int j=0;j<nums.length;j++){
    int subSum=0;
    for(int k=i;k<=j;k++){
        subSum+=nums[k];
    }
    if(subSum >maxSum){
        maxSum=subSum;
        startIndex=i;
        endIndex=j;
    }
 }
}
for(int i=startIndex;i<=endIndex;i++){
    System.out.print(nums[i]+" ");
}
}
}