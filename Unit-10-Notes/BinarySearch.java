import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int rand = (int) (Math.random()*50)+10;
        for (int i = 0; i < rand; i++) {
            nums.add((int)(Math.random()*100)+1);// fill 1-100
        }
        printArray(nums);
        Collections.sort(nums);
        printArray(nums);
        String input = JOptionPane.showInputDialog("What number are you looking for?");
        int num1 = Integer.parseInt(input);
        int num2 = binarySearch(nums, num1, 0, nums.size()-1);
        if (num2>=0){
            System.out.println("number was found at index "+ num2);
        } else {
            System.out.println("Number not found");
        }

    }

    public static void printArray(ArrayList<Integer> arr){
        for(int x : arr){
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Length: " + arr.size());
    }

    public static int binarySearch(ArrayList<Integer> arr1, int number, int low, int high){
        int middle = 0;
        if(low>high){
            return -1;
        } else {
            middle = (low+high)/2;
            System.out.println("middle index: " + middle);
            if(number == arr1.get(middle)){
                return middle;
            } else if (number > arr1.get(middle)){
                return binarySearch(arr1, number, middle+1, high);
            } else {
                return binarySearch(arr1, number, low, middle-1);
            }
        }
    }
}
