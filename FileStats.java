import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        
        String fileName = "filename.txt";
        
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                lineCount++;  
                charCount += line.length();  
                
                
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


