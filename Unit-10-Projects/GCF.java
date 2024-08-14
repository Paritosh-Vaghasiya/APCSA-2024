public class GCF {
    public static void main(String[] args) {
        int rand1 = (int)(Math.random()*100);
        int rand2 = (int)(Math.random()*100);
        System.out.println("GCF of " + rand1 + " and " + rand2 + " is: " + gcf(rand1, rand2));
    }
    public static int gcf(int a, int b) {
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        return gcf(b, a % b);
    }
}

