import java.util.Arrays;
import java.util.Scanner;

public class Test {
  int c=100; //instance variable
  static int n=200; //static variable
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        while(true){
          System.out.println("Enter Array Elements");
          for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
          }
        
          System.out.println("Reverse Array::::" + Arrays.toString(array));
        System.out.println("Reverse Array::::" + Arrays.toString(reverseArray1(array)));
        }
}
public static int[] reverseArray1(int[] array) {
  System.out.println(array[0]);
    int startIndex = 0;
    int endIndex = array.length - 1;
    while (startIndex < endIndex) {
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
        System.out.println(Arrays.toString(array));
        startIndex=startIndex+1;
        endIndex=endIndex-1;
    }
    return array;
}

}

