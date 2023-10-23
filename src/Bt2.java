import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Bt2 {
    public static void main(String[] args) throws IOException {
        File file = new File("my_output.txt");
        if (file.exists()) {
            FileReader fr = new FileReader(file);
            LineNumberReader lnr = new LineNumberReader(fr);
            int linenumber = 0;
            while (lnr.readLine() != null) {
                linenumber++;
            }
            System.out.println("so dong : " + linenumber);
            lnr.close();
        } else {
            System.out.println("File does not exists!");
        }
    }
}
