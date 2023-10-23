package bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BT3 {
    public static void main(String[] args) throws IOException{
        String filePath = "my_output.txt";

            List<String> words = readFile(filePath);
            List<String> duplicateWords = findDuplicateWords(words);
            displayResult(duplicateWords);
    }

    public static List<String> readFile(String filePath) throws IOException {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    words.add(word);
                }
            }
        }

        return words;
    }

    public static List<String> findDuplicateWords(List<String> words) {
        List<String> duplicateWords = new ArrayList<>();
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.add(entry.getKey());
            }
        }

        return duplicateWords;
    }

    public static void displayResult(List<String> duplicateWords) {
            System.out.println("Các từ trùng lặp trong tệp là:");
            for (String word : duplicateWords) {
                System.out.println(word);
            }
    }
}