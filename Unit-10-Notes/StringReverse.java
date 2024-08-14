public class StringReverse {
    public static void main(String[] args) {
        String sentence = "radar";
        System.out.println(sentence);
        String reverseString = reverse(sentence);
        System.out.println(reverseString);
    }

    public static String reverse(String words){
        if (words.isEmpty()) {//Check to see if I ran out of letters
            return words;
        }
        return reverse(words.substring(1))+words.charAt(0);
    }
}
