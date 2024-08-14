public class RecursionDay1 {
    public static void main(String[] args) {
        int s;
        System.out.println("The output from the program is: ");
        s = sum(5);
        System.out.println("The sum is: " + s);
    }

    public static int sum(int x){
        int result;
        if (x == 1){
            return 1;
        } else {
            System.out.println("x= " +x);
            result = (x * sum(x-1));
            System.out.println("x= " +x);
        }
        return result;
    }
}
