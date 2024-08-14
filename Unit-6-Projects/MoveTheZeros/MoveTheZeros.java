package MoveTheZeros;
public class MoveTheZeros {
    public static void main(String[] args) {
        int[] nums = new int[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*21)-10;
        }
        for (int x : nums){
            System.out.print(x + ", ");
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        System.out.println();
        for (int x : nums){
            System.out.print(x + ", ");
        }
    }
}
