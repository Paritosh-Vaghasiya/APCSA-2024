import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileReadInput {
    public static void main(String[] args) throws IOException {
        String word = ""; //Create an empty string to store our text
        JFileChooser chooser = new JFileChooser(); // Creates a file chooser object
        FileReader in = null; //set the fi;e reader object to null
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile(); //Gets the selected file and path
            in = new FileReader(selectedFile); //Stores the path in the filereader object
        }
        BufferedReader readin = new BufferedReader(in); //Creates A buffered reader object to store
        for (int i = 0; i < 5; i++){
            String inputLine = readin.readLine();
            System.out.println("Line " + (i+1)+ " is: " + inputLine); //echo print
        }
    }
}
