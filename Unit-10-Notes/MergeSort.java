import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int pass = 0;
        //Fill an ArrayList
        int rand = (int)(Math.random()*90)+10;
        for(int i = 0; i < rand; i++)
            arr.add((int)(Math.random()*100)+1);
        printArray(arr, pass);
        sort(arr, 0, arr.size()-1, pass);
    }


    public static void printArray(ArrayList<Integer> arr, int pass){
        System.out.print("Pass " + pass + ": ");
        for (int x : arr){
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<Integer> arr1, int left, int right, int pass){
        pass++;
        if(left<right){ //base case, making sure left is not beyond right
            int middle = (right+left)/2;//Find the middle pt of array
            printArray(arr1, pass);
            //Recursive call to sort the left side of the array
            sort(arr1,left,middle,pass);
            //Recursive call to sort the right side of the array
            sort(arr1,middle+1, right, pass);
            //merge things back
            merge(arr1, left, middle, right);//put things back together
            printArray(arr1, pass);
        }
    }

    public static void merge(ArrayList<Integer> arr2, int left, int middle, int right){
        //calculate tge sizes of our two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;
        //create a temparary array
        ArrayList<Integer> Left = new ArrayList<>();
        ArrayList<Integer> Right = new ArrayList<>();
        //Copy over data to our temp array
        for(int i = 0; i < n1; i++)
            Left.add(arr2.get(left+i));//Copies left half
        for(int j = 0; j < n2; j++)
            Right.add(arr2.get(middle+1+j));//Copies the right half


        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2){
            if(Left.get(i) <= Right.get(j)){//test to see which value is smaller
                arr2.set(k, Left.get(i));//copy left into array
                i++;
            }else{
                arr2.set(k, Right.get(j));//copies right into array
                j++;
            }
            k++;
        }
        //copying over everything that's left in our array from the Left ArrayList
        while(i < n1){
            arr2.set(k, Left.get(i));
            i++;
            k++;
        }
        //Copying over everything that's left over in the Right ArrayList
        while(j < n2){
            arr2.set(k, Right.get(j));
            j++;
            k++;
        }
    }
}
