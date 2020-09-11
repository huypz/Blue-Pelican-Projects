import java.util.*;
import java.io.*;

public class ProjectL45 {
    public static void main(String[] args) {
        try {
            Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL45.txt"));
            int numGrades = sf.nextInt();
            sf.nextLine();

            Set exempted = new TreeSet();

            int i = 1;
            while (sf.hasNextLine()) {
                String gradeData = sf.nextLine();
                Scanner sc = new Scanner(gradeData);
                String name = sc.next();
                sc.skip("\\D*");
                int grade = sc.nextInt();

                if (exempted.contains(name)) {
                    if (grade >= 89) {
                        exempted.add(name);
                    }
                    else if (i > numGrades) {
                        exempted.remove(name);
                    }
                    else {
                        exempted.remove(name);
                    }
                }
                else {
                    if (i <= numGrades) {
                        exempted.add(name);
                    }
                }
                i++;
            }

            System.out.println("Exempted students: " + exempted);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
