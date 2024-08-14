public class Arrays {
    public static void main(String[] args){
        int[] nums = new int[10];//Creates an int array of 10 num
        //Fill the array
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*100)+1;//Fills w/ random num from 1 - 100
        }
        //Echo print out the array
        for(int j = 0; j < nums.length; j++) {
            System.out.println("Element " + j + " is: "+ nums[j]);
        }
        //Create a String array of names
        String[] names = {"Bill", "Jill", "Charlotte", "Yashllll", "Andrewlllll", "John", "Reyllllll"};
        for(int k = 0; k < names.length; k++){
            System.out.println("Element " + k + " is: "+ names[k]);
        }
        //Other ways to use arrays
        int sum = 0;
        for(int m = 0; m < nums.length; m++){
            sum+= nums[m];
        }
        System.out.println("The sum of num is: " + sum);
        //Find the avg
        System.out.println("The avg is: " + ((double)sum/nums.length));
        //Prints out the first initial of each person name
        for(int n = 0; n< names.length; n++){
            System.out.println("First Initial is: " +names[n].charAt(0));
        }
        //Prints out the last initial of each person name
        for(int p = 0; p < names.length; p++){
            System.out.println("Last Initial is: " +names[p].charAt(names[p].length()-1));
        }
        //Counts the number of l's in the names
        int count = 0;
        for(int q = 0; q < names.length; q++){//Loop over the list of names
            for(int r = 0; r < names[q].length(); r++){//Loop over each character in the name
                if(names[q].charAt(r) == 'l'){
                    count++;
                }
            }
        }
        System.out.println("There are " + count + " num of l's");
        boolean[] what = new boolean[5];
        for(int s = 0; s < what.length; s++){
            System.out.println(what[s]);
        }
        for(int t = 0; t < what.length; t++){
            if(t%2==0)//Sets even indices to true
                what[t] = true;
        }
        for(int u = 0; u < what.length; u++){
            System.out.println(what[u]);
        }
    }
}
