import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandling {


    private String[] spited;

    public String[] getSpited() {
        return spited;
    }

    public void setSpited(String[] spited) {
        this.spited = spited;
    }

    public void filPrint() throws FileNotFoundException {
        Scanner s = new Scanner(new File("navneliste/persons.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()) {
            list.add(s.nextLine());
        }
//        System.out.println(list);
        s.close();

        String listString = String.join(", ", list);
        //        System.out.println(listString);
        setSpited(listString.split("\\s+"));
//        System.out.println(spited[0]);
//        System.out.println(spited[1]);
    }


}
