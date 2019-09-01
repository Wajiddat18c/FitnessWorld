import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("FitnessWorld/navneliste/persons.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
            System.out.println(list);
        }
        s.close();
    }


}
