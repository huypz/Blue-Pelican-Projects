import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProjectL23 {
    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL23.in"));
        while (sf.hasNextLine()) {
            String line = sf.nextLine();
            if (line.startsWith("The ")) {
                System.out.println(line);
            }
        }
        sf.close();
    }
}
