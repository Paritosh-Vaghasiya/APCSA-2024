public class IfElse {
    public static void main(String[] args){
        int num = 1, num1 = 1,num2 = 2, num3 = 13;
        String word = "hello", word1 = "hello", word2 = "Hello";

        //Simple Conditionals
        if(num == num1){//executes the next statment(s) if the condition is TRUE
            System.out.println("Num is equal to Num1");
        }if(num == num2){//True
            System.out.println("Num1 is equal to Num2");
        }if(num != num2){//True
            System.out.println("Num is not equal to Num 1");
        }if(num3 > num){//True
            System.out.println("Num3 is greater than to Num");
        }if(num1 > num){//False
            System.out.println("Num1 is greater than to Num");
        }if(word.equals(word1)){//True
            System.out.println("Words are the same");
        }if(word.equals(word2)){//False
            System.out.println("Words are the same");
        }if(word.equalsIgnoreCase(word2)){//True
            System.out.println("Words are the same, allegedly");
        }if(word == word1){//True -> DON'T do this on the AP Exam
            System.out.println("Words are the same");
        }if(num > 0){//See if num is pos
            System.out.println("num is pos");
        }if(!(num < 0)){//Check to see if it's NOT negative
            System.out.println("num is pos");
        }

        // if - else
        if(num < num1){//Do this if condition is true
            System.out.println("num is less than num1");
        }else{//Do this if condition is false
            System.out.println("num is Not less than num1");
        }

        //else if
        if(num < num1){//Do this if condition is true
            System.out.println("num is less than num1");
        }else if(num > num2){//Do this if condition is false
            System.out.println("num is less than num2");
        }else{//Does this if everything was false
            //You need the else to end the else If code
            System.out.println("None of that was true");
        }

        if(num3 > 12){
            num3++;//add 1 and make it 14
            System.out.println("Num3 is now " + num3);
        }if(num3 > 115){//num3 = 14 at this point, this is false
            num3-=27;
            System.out.println("num3 is now " + num3);
        }else if(num3 < 6){//still false
            num3-=27;
            System.out.println("num3 is now " + num3);
        }else{//true
            num3-=5;
            System.out.println("num3 is now " + num3);
        }

        boolean flag = true;//set a flag
        if(flag){
            System.out.println("Flag is true");
            flag=false;//change our flag value
        }else{
            System.out.println("Flag is false");
            flag=true;
        }
        //Going back and forth with the true and false value for flag
        if(flag){
            System.out.println("Flag is true");
            flag=false;//change our flag value
        }else{
            System.out.println("Flag is false");
            flag=true;
        }

        //Never ever do this
        if(true){
            System.out.println("What is true, apparently everything");
        }
    }
}
