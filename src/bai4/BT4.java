package bai4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT4 {
    public static void main(String[] args) throws IOException {
        String filePath = "my_output.txt";
        List<String> words = readFile(filePath);
        sortWords(words);
        displayResult(words);
    }

    public static List<String> readFile(String filePath) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                words.addAll(Arrays.asList(lineWords));
            }
        }
        return words;
    }

    public static void sortWords(List<String> words) {
        Collections.sort(words);
    }
    public static void displayResult(List<String> words) {
        System.out.println("Các từ được sắp xếp theo thứ tự bảng chữ cái:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}