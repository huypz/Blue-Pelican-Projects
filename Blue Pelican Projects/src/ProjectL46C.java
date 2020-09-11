import java.util.*;
import java.io.*;

public class ProjectL46C {
    public static void main(String[] args) {
        try {
            Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL46C.txt"));
            String lineInput = sf.nextLine();
            String[] words = lineInput.split("\\s*,\\s*");

            Map wordsMap = new TreeMap();

            for (String word : words) {
                if (wordsMap.containsKey(word)) {
                    wordsMap.put(word, ((Integer) wordsMap.get(word)) + 1);
                }
                else {
                    wordsMap.put(word, 1);
                }
            }

            Set wordsSet = wordsMap.keySet();
            Iterator iter = wordsSet.iterator();

            System.out.printf("%-20s%10s%n", "Words", "Frequency");
            while (iter.hasNext()) {
                Object key = iter.next();
                Object value = wordsMap.get(key);
                String dots = "";
                int length = 0;
                while (length < (Integer) value) {
                    dots += "*";
                    length++;
                }

                System.out.printf("%-20s%10s%n", (String) key, dots);
            }

            sf.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
