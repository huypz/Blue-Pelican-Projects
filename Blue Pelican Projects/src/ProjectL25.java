import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProjectL25 {
    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL25.in"));
        FileWriter fw = new FileWriter(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL25.out"));
        PrintWriter output = new PrintWriter(fw);
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
            output.printf("%-10s%s%d%n", student + ",", "average = ", total/count);
        }
        output.close();
        fw.close();
        sf.close();
    }
}
