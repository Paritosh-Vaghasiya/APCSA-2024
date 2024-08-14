public class TwoDArray {
    public static void main(String[] args) {
        int [][] nums = new int[2][3];//Creates a 2x3 array
        String [][] names = {{"Anthony", "Charlotte","Yash", "John"},
                {"John", "Syed", "Evan", "Paritosh","Darsh","Danny", "Rey", "Roshan"},
                {"Alyssa", "Sophia","Anthony","Sia","Kirsten","Kavin","Abrahan", "Andrew"}};

        //fill in the nums array with random numbers
        for (int rows = 0; rows < nums.length; rows++) { //loop over the rows
            for (int cols = 0; cols < nums[0].length; cols++) { //loop over the colums
                nums[rows][cols] = (int)(Math.random()*100)+1; //fill in the cells with random numbers
            }
        }

        //print out nums
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + ", ");
            }
            System.out.println();
        }

        //print out nums
        for (int k = 0; k < names.length; k++) {
            for (int m = 0; m < names[k].length; m++) {
                System.out.print(names[k][m] + ", ");
            }
            System.out.println();
        }
    }
}
