package BubbleSort;

public class Array {
    static int[]  nums = {21, 32,23,45,76, 1,8 ,4, 9 ,7, 111, 23};
    public static void main(String[] args) {
        //Echo print the array
        printArray(0);
        //sort the array
        for (int i = 0; i < nums.length-1; i++) { //outer loop
            for (int j = 0; j < nums.length-1-i; j++) {//inner loop
                if (nums[j]>nums[j+1]){//swap
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            printArray(i);//print the array with the pass
        }
    }

    public static void printArray(int pass) {
        System.out.println("Pass " + pass + ": ");
        for( int value: nums)
            System.out.print(value+", ");
        System.out.println();
    }
}
