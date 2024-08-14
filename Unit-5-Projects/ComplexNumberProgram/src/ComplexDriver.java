public class ComplexDriver {
    public static void main(String[] args) {
        Complex num = new Complex(3,6);
        System.out.println(num);
        num.addComplex(5, 4);
        System.out.println(num);
        num.subtractComplex(1, 3);
        System.out.println(num);
    }
}
