public class MathClass {
    public static void main(String[] args){
        int num1=9,  num2=4, num3=17, num4=10;
        //The math Class is a static class
        System.out.println("num1 squared is: " + Math.pow(num1,2));//Raising to a power
        System.out.println("num1 cubed is: " + Math.pow(num1,3));//Raising to a power
        System.out.println("num1 to the half is: " + Math.pow(num1, .5));//Raising to a power
        System.out.println("Square root of num2 is: " + Math.sqrt(num2));//Square root
        System.out.println("The cosine of Pi is:  " + Math.cos(Math.PI));//Trig functions
        System.out.println("The smaller number is: " + Math.min(num3, num2));//Minimum
        System.out.println("The bigger number is: " + Math.max(num3, num2));//Maximum
        System.out.println("The cube root number is: " + Math.cbrt(num3));//Cube root
        System.out.println("The log is: " + Math.log10(num4));//Log base 10
        //Here comes the random number class
        //random class will be on the ap test !!Very important to learn!!
        Double rand;
        int rand1;
        rand = Math.random();//Creates a random number between 0 and 0.99999999999999999
        System.out.println("The random number is: " + rand);//Random Number
        rand1 =(int)(Math.random()*10);//Creates a random number between 0 and 9
        System.out.println("The random number is: " + rand1);//Random Number
        rand1 =(int)(Math.random()*10)+1;//Creates a random number between 1 and 10
        System.out.println("The random number is: " + rand1);//Random Number
        rand1 =(int)(Math.random()*15)+20;//Creates a random number between 20 and 34
        System.out.println("The random number is: " + rand1);//Random Number
        rand1 =(int)(Math.random()*20)-10;//Creates a random number between -10 and 9
        System.out.println("The random number is: " + rand1);//Random Number
        rand1 =(int)(Math.random()*6)+1;//Creates a random number between 1 and 6
        System.out.println("The random number is: " + rand1);//Random Number



    }
}
