package SelectionSort;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int rand = (int)(Math.random()*16)+4;
        for (int z = 0; z < rand; z++) {
            nums.add((int)(Math.random()*100)+1);
        }
        System.out.print("Pass 0:");
        for (int x : nums){
            System.out.print(x+", ");
        }
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            int lowIndex = i;//set the lowest index value to the first element in the array
            for (int j = i+1; j < nums.size(); j++) {//inner loop
                if(nums.get(j) < nums.get(lowIndex))
                    lowIndex=j;//set a new lowIndex
            }
            //swap
            int temp = nums.get(lowIndex);
            nums.set(lowIndex, nums.get(i));
            nums.set(i, temp);

            System.out.print("Pass "+(i+1)+": ");
            for (int x : nums){
                System.out.print(x+", ");
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("What number are you looking for?");
        int looking = scan.nextInt();

        //linear search
        for (int m = 0; m < nums.size(); m++) {
            if(looking == nums.get(m))
                System.out.println("We found it at index " + m);
        }

        //early exit linear search
        boolean found = false;
        int counter = 0;
        System.out.println("What number are you looking for?");
        int looking2 = scan.nextInt();
        while (!found && counter < nums.size()){
            if(looking2 == nums.get(counter)){
                System.out.println("We found it at index " + counter);
                found = true;
            }
            counter++;
        }
        if (!found){
            System.out.println("Didn't find your number");
        }
    }
}
