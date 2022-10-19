package matrix;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Array Elements:");
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = s.nextInt();
            }
          IsArraySorted obj=new IsArraySorted();
         System.out.println("Result--------"+obj.isArraySorted(array));
        }
    }

    public static boolean isArraySorted(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (!(array[i - 1] <= array[i])) {
                return false;
            }
        }

        return true;
    }
}
