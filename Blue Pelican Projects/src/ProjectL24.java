import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ProjectL24 {
    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL24.in"));
        while (sf.hasNextLine()) {
            Scanner sc = new Scanner(sf.nextLine());
            sc.useDelimiter("\\s*\\d");
            String student = sc.next();
            int total = 0, count = 0;
            sc.useDelimiter("\\s");
            while (sc.hasNext()) {
                total += sc.nextInt();
                count++;
            }
            System.out.printf("%-10s%s%d%n", student + ",", "average = ", total/count);
        }

        sf.close();
    }
}
