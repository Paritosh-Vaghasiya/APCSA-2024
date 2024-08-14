package CarClass;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Driver {
    public static void main(String[] args) throws IOException {
        JFileChooser chooser = new JFileChooser(); // Creates a file chooser object
        FileReader in = null; //set the file reader object to null
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile(); //Gets the selected file and path
            in = new FileReader(selectedFile); //Stores the path in the filereader object
        }
        BufferedReader readin = new BufferedReader(in); //Creates A buffered reader object to store

        Car[] list = new Car[20];

        for (int i = 0; i < 20; i++) {
            String[] info = new String[3];
            for (int j = 0; j < info.length; j++) {
                String line = readin.readLine();
                info[j] = line;
            }
            Car cars = new Car(info[0],info[1],info[2]);
            list[i] = cars;
        }

        for(Car x : list){
            System.out.println(x.toString());
        }
    }
}
