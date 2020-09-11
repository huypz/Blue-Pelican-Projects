import java.util.*;
import java.io.*;

public class ProjectL46B {
    public static void main(String[] args) {
        try {
            Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL46B.txt"));
            int wordCount = Integer.parseInt(sf.nextLine());
            int i = 0;

            Map dictionary = new HashMap();

            Scanner sc;
            while (sf.hasNextLine() && i < wordCount) {
                String line = sf.nextLine();
                sc = new Scanner(line);
                sc.useDelimiter("=");
                dictionary.put(sc.next(), sc.next()); //key, value
                i++;
            }

            String toBeDecoded = sf.nextLine();
            sc = new Scanner(toBeDecoded);
            while (sc.hasNext()) {
                String word = sc.next();
                if (dictionary.containsKey(word)) {
                    toBeDecoded = toBeDecoded.replace(word, dictionary.get(word).toString());
                }
            }
            System.out.println(toBeDecoded);
            sc.close();
            sf.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
