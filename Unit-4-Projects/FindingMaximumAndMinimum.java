import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLOutput;

public class FindingMaximumAndMinimum {
    public static void main(String[] args) throws IOException {
        // Creates a file chooser object
        JFileChooser chooser = new JFileChooser();

        //set the file reader object to null
        FileReader in = null;

        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile(); //Gets the selected file and path
            in = new FileReader(selectedFile); //Stores the path in the filereader object
        }

        //Creates A buffered reader object to store
        BufferedReader readin = new BufferedReader(in);
        String inputLine = readin.readLine();

        //Prints out all the number in a file which are in a list
        for (int i = 0; i < 20; i++){
            if( i == 0){
                System.out.print("Number are: " + inputLine);
            } else {
                inputLine = readin.readLine();
                System.out.print(", " + inputLine);
            }
        }

        //Recall to reset readin and inputline
        File selectedFile = chooser.getSelectedFile(); //Gets the selected file and pat
        in = new FileReader(selectedFile); //Stores the path in the filereader object
        readin = new BufferedReader(in);
        inputLine = readin.readLine();

        //var
        int max = Integer.parseInt(inputLine);
        int min = Integer.parseInt(inputLine);
        System.out.println();

        //Determine max and min
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(inputLine);
            inputLine = readin.readLine();
            if(x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
        }

        //Print max and min
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
}