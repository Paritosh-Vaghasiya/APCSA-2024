import javax.swing.JOptionPane;
public class Input {
    public static void main(String[] args){
        JOptionPane pane = new JOptionPane();
        String input1, input2, input3;
        input1 = JOptionPane.showInputDialog("Please enter your name");
        System.out.println("You entered: " + input1); //echo name
        input2 = JOptionPane.showInputDialog("Please enter your number");
        JOptionPane.showMessageDialog(null, "Your number is: " + input2);
        int input2AsInt = Integer.parseInt(input2); // turns Strings into int
        input2AsInt *= 3;
        System.out.println("Your number *3 is: " +input2AsInt);
    }
}
