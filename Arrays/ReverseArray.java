import java.util.*;
public class ReverseArray{
	
	public static void main(String[] args){
		int[] array=new int[]{10,20,15,3,12,40};
		System.out.println("Original Array ::"+Arrays.toString(array));
		System.out.println("reversed Array ::"+Arrays.toString(reverse(array)));
			}
	public static int[] reverse(int[] array){
		int start=0;
		int end=array.length-1;
		
		while(start <=end){		
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}
	
}