public class UsingStringClass {
    public static void main(String[] args){
        String use = "I love programming!";
        String mine = "solving cubes.";
        System.out.println(use.substring(0,1));
        System.out.println(use.length());
        System.out.println(use.substring(18));
        System.out.println(use.substring(1));
        System.out.println(use.substring(0,18));
        System.out.println(use.substring(1,18));
        System.out.println(use.substring(2));
        System.out.println(use.substring(0,7).concat(mine));
    }
}
