public class StringClass {
    public static void main(String[] args){
        String input3 = "IPL is better than PSL";
        String input1 = "PSL is the worst";
        // .length () method -> how many characters in the String
        System.out.println("You entered: " + input3);
        System.out.println("The length of your sentence is: " +input3.length());
        // .substring makes the string shorter
        System.out.println("The shorter sentence is: " + input3.substring(23));
        // .substring (two parameters) [23, 30)
        System.out.println("The shorter sentence is: " + input3.substring(23, 30));
        // .replace
        System.out.println("The replacement sentence is: " + input3.replace('t', '#'));
        // turn everything to CAPS
        System.out.println("The LOUD sentence is: " + input3.toUpperCase());
        // turn everything to lower case
        System.out.println("The quiet sentence is: " + input3.toLowerCase());
        //how do we compare Strings? .equals
        System.out.println("The sentences are equal: " + input3.equals(input1)); //prints true or false
        // .contains
        System.out.println("Does the sentence contain 'tied'? " + input3.contains("IPL"));
        // Where is the occurrence
        System.out.println("Where does the sentence contain 'tied'? " + input3.indexOf("IPL"));
    }
}