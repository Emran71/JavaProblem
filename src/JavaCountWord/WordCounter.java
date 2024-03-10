package JavaCountWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
	 public static void main(String[] args) {
	        
	        String path = "Files/input.txt";
	        
	        Map<String, Integer> wordCountMap = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.split("\\s+"); 
	                for (String word : words) {
	                    
	                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
	                    if (!word.isEmpty()) {
	                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	            return;
	        }

	        
	        Map<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

	        
	        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
}
