public class String_MathClassPractice {
    public static void main(String[] args){
        String school = "Schaumburg";
        String spirit = "GO SAXONS!";
        System.out.println(spirit.substring(5));
        System.out.println(spirit.substring(3,9));
        System.out.println(spirit.indexOf('0'));
        System.out.println(spirit.length());
        System.out.println(spirit.indexOf('!'));
        System.out.println(spirit.compareTo(school));
        System.out.println(spirit.equals(school));
        System.out.println(school.compareTo(spirit));

        System.out.println((Math.random()*5)+6);
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-10));
        Math.pow(3,4);

        int x=1,y=2;
        double z=2.3, average;
        x=z;
        x=y*z;
        z=x+y;
        average =(z+z)/2;
        average =(double)(z+z)/2;
        x=(double)(z+z)/2;
    }
}
