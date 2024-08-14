public class primitiveTypes {
    public static void main(String[] atgs){
        int value = 3;
        double otherVal = value/2;
        System.out.println(otherVal);

        int num=5/2;
        int num1 = (int)(5/2);
        int num2 =(int)(5.0/2);
        int num3 = (int) (5.0/2.0);
        System.out.println();
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println();

        int a=2;
        int b=1;
        System.out.println(a+b);

        int c=1;
        int d=c;
        System.out.println(d);

        int e=5;
        int f=e+3;
        System.out.println(f);

        int g=3;
        int h;
        h=g+4;
        System.out.println(h);

        int j = 3, k = 3;
        System.out.println(j + k);

        int x=5;
        int y=10;
        int z = ++x * ++y;
        System.out.println(z);

        int m=10, n=5, o=1;
        int result = m + o - ++n;
        System.out.println(result);
    }

}
