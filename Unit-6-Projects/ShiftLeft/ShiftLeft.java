package ShiftLeft;
public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*10)+1;
        }
        for(int x : nums){
            System.out.print(x + ", ");
        }
        int index1 = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if(j==nums.length-1){
                nums[j]=index1;
            } else {
                nums[j] = nums[j+1];
            }
        }
        System.out.println();
        for(int x : nums){
            System.out.print(x + ", ");
        }
    }
}
