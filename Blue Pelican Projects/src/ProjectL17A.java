import java.util.*;

public class ProjectL17A {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter something like 8 + 33 + 1,345 + 137: ");
        String s = kb.nextLine();

        Scanner sc = new Scanner(s);
        final String PLUS = "\\s*\\+\\s*";
        final String MINUS = "\\s*\\-\\s*";

        int sum = 0;

        sc.useDelimiter(PLUS);
        if (s.startsWith("-")) {
            String temp = sc.next();
            Scanner start = new Scanner(temp);
            start.useDelimiter(MINUS);
            int diff = -start.nextInt();
            while (start.hasNext()) {
                diff -= start.nextInt();
            }
            sum += diff;
        }

        while (sc.hasNext()) {
            String temp = sc.next();
            System.out.println(temp);
            if (temp.contains("-")) {
                Scanner sc2 = new Scanner(temp);
                sc2.useDelimiter(MINUS);
                int diff = sc2.nextInt();
                while (sc2.hasNext()) {
                    diff -= sc2.nextInt();
                }
                sum += diff;
            }
            else {
                sum += Integer.parseInt(temp);
            }
        }
        System.out.println("Sum: " + sum);
    }
}
