public class MoreString {
    public static void main(String[] args) {
        String word1 = "Schaumburg";
        String word2 = "schaumburg";
        String word3 = "Schaumburg";
        String word4 = "Anthoy";
        String word5 = "Antonio";

        System.out.println("The character at index 4 is: " + word1.charAt(4));//Index at 4
        System.out.println("Are the two strings equal?: " + word1.equals(word3));
        System.out.println("Are the two strings equal?: " + word1.equals(word2));

        //.compareTo compares the beggaing string letter by binary number difference
        System.out.println("Comparing two strings: " + word1.compareTo(word2));
        System.out.println("Comparing two strings: " + word1.compareTo(word3));
        System.out.println("Comparing two strings: " + word4.compareTo(word2));
        System.out.println("Comparing two strings: " + word2.compareTo(word4));
        System.out.println("Comparing two strings: " + word4.compareTo(word5));

        //.equalsIgnoreCase lowercases two strings and then compares them
        System.out.println("Comparing two strings: " + word1.equalsIgnoreCase(word2));

        //.concat combines two strings
        System.out.println("Connecting two strings: " + word1.concat(word2));
        System.out.println("Connecting two strings: " + word1+word2);
    }
}
