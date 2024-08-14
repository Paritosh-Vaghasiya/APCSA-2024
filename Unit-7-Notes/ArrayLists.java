import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String []args){
        ArrayList<Integer> nums = new ArrayList<>();//Create a new arrayList
        //Fill the arraylist
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random()*100)+1; //Create and store num
            nums.add(rand);
        }
        //Print the arraylist
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());

        //proving the .add() method works as advertised
        nums.add(999);//put 999 at the end of the arraylist
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());

        nums.add(5, -999); //put -999 at index 5
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());

        //using the .get method
        for (int j = 0; j < nums.size(); j++) {
            System.out.print(nums.get(j)+", ");
        }
        System.out.println();

        //Using the .set method
        nums.set(10, 1111);//Sets 1111 into index 10
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());
        //return the original value at an index
        System.out.println(nums.set(9, 1111));
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());

        //using the .remove method
        int y = nums.remove(3);//Remove the int at index 3 anf stores it in y
        System.out.println(y);
        for(int x:nums) {
            System.out.print(x + ", ");
        }
        System.out.println();
        //Prints out the size of the arraylist
        System.out.println("The length of the arraylist is: " + nums.size());

        ArrayList<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words and enter stop to stop");
        String word = scan.nextLine();
        while (!(word.equals("stop"))){
            words.add(word);
            System.out.println("Enter words and enter stop to stop");
            word = scan.nextLine();
        }
        for(String s: words){
            System.out.print(s+", ");
        }
    }
}
