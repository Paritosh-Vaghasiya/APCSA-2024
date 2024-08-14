package BubbleSort;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int rand = (int)(Math.random()*16)+4;
        for (int i = 0; i < rand; i++) {
            nums.add((int)(Math.random()*100)+1);
        }

        System.out.print("Pass 0:");
        for (int x:nums)
            System.out.print(x+", ");
        System.out.println();
        //sort
        for (int j = 0; j < nums.size()-1; j++) {
            for (int k = 0; k < nums.size()-1-j; k++) {
                if ((nums.get(k)>nums.get(k+1))) {
                    int temp = nums.get(k);
                    nums.set(k, nums.get(k + 1));
                    nums.set(k + 1, temp);
                }
            }
            System.out.print("Pass "+(j+1)+": ");
            for (int y:nums)
                System.out.print(y+", ");
            System.out.println();
        }

    }
}
