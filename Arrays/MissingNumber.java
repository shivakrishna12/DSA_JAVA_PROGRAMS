

public class MissingNumber{
public static void main(String[] args){
    // Scanner s=new Scanner(System.in);
    // System.out.println("enter Array length::");
    //     int length=s.nextInt();
       int[] array=new int[3];
    //     System.out.println("enter Array Elements::");
    //     for(int i=0;i<length;i++){
    //         array[i]=s.nextInt();
    //     }
    //     s.close();
    int max=Integer.MIN_VALUE;
        System.out.println(findMissingNumber(array,3));
}
public static int findMissingNumber(int[] num,int length){
    int[] nums={2,1};
    int k=1;
    for(int i=0;i<nums.length;i++){
        
        if(k==nums[i]){
            k+=1;
            i=0;
        }
    }
    return k;
}

}