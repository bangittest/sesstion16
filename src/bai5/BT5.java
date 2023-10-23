package bai5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BT5 {
    public static void main(String[] args) throws IOException {
        String filePath = "my_output.txt";
        String fileContent = readFile(filePath);
        List<String> words = extractWords(fileContent);
        List<String> longestWords = findLongestWords(words);
        displayResult(longestWords);
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public static List<String> extractWords(String fileContent) {
        String[] wordsArray = fileContent.split("\\s+");
        return List.of(wordsArray);
    }

    public static List<String> findLongestWords(List<String> words) {
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWords.clear();
                longestWords.add(word);
            } else if (length == maxLength) {
                longestWords.add(word);
            }
        }
        return longestWords;
    }

    public static void displayResult(List<String> longestWords) {
        System.out.println("Các từ có độ dài lớn nhất trong tệp là:");
        for (String word : longestWords) {
            System.out.println(word + " (Độ dài: " + word.length() + ")");
        }
    }
}