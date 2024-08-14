public class HighLow {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*100)+1;
        System.out.println("Num of Guess: " + highLow(rand, 1, 100));
    }
    public static int highLow(int target, int low, int high){
        int mid = (low + high)/2;
        if (mid == target){
            return 1;
        } else if (mid < target){
            return 1 + highLow(target, mid++, high);
        } else {
            return 1 + highLow(target, low, mid--);
        }
    }
}
