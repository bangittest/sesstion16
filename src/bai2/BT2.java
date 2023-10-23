package bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BT2 {
    public static void main(String[] args) throws IOException {
        String fileName = "my_output.txt";
        int lineCount = countLines(fileName);
        System.out.println("Số dòng trong tệp: " + lineCount);
    }

    public static int countLines(String fileName) throws IOException {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }
}
