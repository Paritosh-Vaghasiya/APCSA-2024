package InsertionSort;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int rand = (int)(Math.random()*16)+4;
        for (int w = 0; w<rand; w++) {
            nums.add((int)(Math.random()*100)+1);
        }

        System.out.print("Pass 0: ");
        for (int x:nums)
            System.out.print(x+", ");
        System.out.println();
        for (int j = 1; j < nums.size(); j++) {//outer loop
            int key = nums.get(j);// gets the key value and stores it
            int i=j-1;//iterator
            while ((i>-1)&&(nums.get(i)>key)){
                nums.set(i+1, nums.get(i));
                i--;
            }
            nums.set(i+1, key);//put the keu value in position
            System.out.print("Pass "+j+": ");
            for (int x:nums)
                System.out.print(x+", ");
            System.out.println();
        }

        //OR
        /*
        for (int j = 1; j < nums.size(); j++) {//outer loop
            int key = nums.remove(j);// gets the key value and stores it
            int i=j-1;//iterator
            while ((i>-1)&&(nums.get(i)>key)){
                //nums.set(i+1, nums.get(i));
                i--;
            }
            nums.add(i+1, key);//put the keu value in position
            System.out.print("Pass "+j+": ");
            for (int x:nums)
                System.out.print(x+", ");
            System.out.println();
        }
         */
    }
}
