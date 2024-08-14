package SelectionSort;
public class Array {
    public static int[] nums = {6,3,2,9,7,1,5,0,4};
    public static void main(String[] args) {
        printArray(0);
        for (int i = 0; i < nums.length; i++) {//outer loop
            int lowIndex = i;//set the lowest index value to the first element in the array
            for (int j = i+1; j < nums.length; j++) {//inner loop
                if(nums[j] < nums[lowIndex])
                    lowIndex=j;//set a new lowIndex
            }
            //swap
            int temp = nums[lowIndex];
            nums[lowIndex]=nums[i];
            nums[i]=temp;
            printArray(i+1);

        }
    }
    public static void printArray(int pass) {
        System.out.print("Pass " + pass + ": ");
        for( int value: nums)
            System.out.print(value+", ");
        System.out.println();
    }
}
