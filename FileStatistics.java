import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileStatistics {
    public static void main(String[] args) {
        String fileName = "C:/Users/psiva/OneDrive/Desktop/java/Add.java"; // Replace with your file path
        int wordCount = 0, charCount = 0, lineCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}