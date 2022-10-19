public class SecondLargestIndex {
    public static void main(String[] args) {
        int[] array = new int[] { 10, 5, 8, 20, 13,18,79,56};
        System.out.println(findSecondLargestIndex(array));
    }

    public static int findSecondLargestIndex(int[] array) {

        int max1Index = array[0];
        int max2Index = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max1Index) {
                max2Index = max1Index;
                max1Index = array[i];
            }else if(array[i] > max2Index){
                     max2Index=array[i];
            }
        }
        return max2Index;
    }
}
