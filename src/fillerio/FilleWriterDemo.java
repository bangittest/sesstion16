package fillerio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FilleWriterDemo {
    public static void main(String[] args) throws Exception {
        File outputFile=new File("src/fillerio/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter=new FileWriter(outputFile);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        fileWriter.write("hello java");
//        fileWriter.close();
            bufferedWriter.newLine();
            bufferedWriter.write("hello java");
            bufferedWriter.newLine();
            bufferedWriter.write("hello python");

            bufferedWriter.flush();
            bufferedWriter.close();
    }

}
