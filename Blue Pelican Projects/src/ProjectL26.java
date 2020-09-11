import java.io.*;
import java.text.*;
import java.util.*;

public class ProjectL26 {
    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL26.in"));
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMaximumFractionDigits(4);
        fmt.setMinimumFractionDigits(4);


        int competitor = 1;
        while (sf.hasNextLine()) {
            String s = sf.nextLine();
            Scanner sc = new Scanner(s);
            Scanner tempsc = new Scanner(s);
            int maxLength = 0;
            while (tempsc.hasNextDouble()) {
                tempsc.nextDouble();
                maxLength++;
            }
            tempsc.close();
            double[] scores = new double[maxLength];
            double total = 0;
            int index = -1;
            while (sc.hasNextDouble()) {
                index++;
                scores[index] = sc.nextDouble();
            }
            Arrays.sort(scores);
            for (int i = 1; i < index; i++) {
                total += scores[i];
            }
            System.out.printf("For Competitor #%d, the average is %s%n", competitor, fmt.format(total / (maxLength - 2)));
            competitor++;
            sc.close();
        }
        sf.close();
    }
}