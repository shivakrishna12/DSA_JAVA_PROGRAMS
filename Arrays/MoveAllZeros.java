import java.util.Arrays;

public class MoveAllZeros{
public static void main(String[] arhs){
   int[] arr=new int[]{3,5,0,0,4};

   int j=0;
   for(int i=0;i<arr.length;i++){
    if(arr[i]!=0){
        arr[j]=arr[i];
        arr[i]=0;
        j++;
    }
   }
System.out.println(Arrays.toString(arr));
}

}
