import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lector {

    
    /** 
     * @return List<List<String>>
     */
    public List<List<String>> readTextFile() {
        List<List<String>> lines = new ArrayList<>();
        

        try (BufferedReader br = new BufferedReader(new FileReader("procesos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                List<String> currentLine = new ArrayList<>();
                for (String word : words) {
                    currentLine.add(word.trim());
                }
                lines.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }    
}
