import java.util.Scanner;

public class ProjectL18A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a sentence: ");
            String uInput = sc.nextLine();
            if (uInput.toUpperCase().equals("EXIT")) {
                break;
            }
            StringBuilder sb = new StringBuilder(uInput);
            uInput = sb.append("p").toString();
            String[] sp = uInput.split("\\s*[Ss]\\s*[Aa]\\s*");
            System.out.printf("There are %d occurrences.%n", sp.length - 1);
        }
    }
}
