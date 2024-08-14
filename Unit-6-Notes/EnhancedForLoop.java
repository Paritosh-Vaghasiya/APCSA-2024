public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] nums = new int[10];// an integer array of 10 num
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*100)+1;//Fills the array with random numbers between 1-100
        }
        //Prints out using the enhanced for loop
        int sum = 0;
        for(int x:nums){
            System.out.print(x+", ");
            sum += x;
        }
        System.out.println("\nThe sum is: " + sum);
        String[] names = {"Bob", "Jill", "Al", "Joe", "HI"};
        for(String y:names){
            System.out.print(y+", ");
        }
        //Add a y to every name
        for (int j = 0; j < names.length; j++) {
            names[j] = names[j]+"y";
        }
        System.out.println();//Everyone loves a good return char
        for(String z:names){
            System.out.print(z+", ");
        }
    }
}
