

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = s.nextInt();

            }
           // System.out.println("Given Array::::" + Arrays.toString(array));
            System.out.println("Reverse Array::::" + Arrays.toString(reverseArray1(array)));
        }
        
    }
    public static int[] reverseArray1(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }
}
