import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmailFinder {

//creating list
    public static List<String> findEmailsWithPrefix(String filePath, String prefix) {
        List<String> matchingEmails = new ArrayList<>();

//use Bufferreader to read file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {              //read line by line
                String email = line.trim();
                if (email.toLowerCase().startsWith(prefix.toLowerCase())) {        //
                    matchingEmails.add(email);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return matchingEmails;
    }

    public static void main(String[] args) {
        String filePath = "D/file.txt";
        String prefixToFind = "sam";
        
        List<String> matchingEmails = findEmailsWithPrefix(filePath, prefixToFind);
        
        System.out.println("Found " + matchingEmails.size() + " email IDs starting with 'sam':");
        for (String email : matchingEmails) {
            System.out.println(email);
        }
    }
}
