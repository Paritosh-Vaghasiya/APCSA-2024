package InsertionSort;
public class Array {
    static int[] nums = {6,3,9,8,5,2,7,1,45,21,0};
    public static void main(String[] args) {
        printArray(0);
        for (int j = 1; j < nums.length; j++) {//Outer loop
            int key = nums[j];//pull our key value
            int i = j-1;
            while ((i>-1)&&(nums[i]>key)){//inner loop
                nums[i+1] = nums[i];//move cells to the right
                i--;//decrement i
            }
            nums[i+1]=key;//put the key in the appropraite place
            printArray(j);
        }

    }
    public static void printArray(int pass) {
        System.out.print("Pass " + pass + ": ");
        for( int value: nums)
            System.out.print(value+", ");
        System.out.println();
    }
}
