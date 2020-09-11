import java.io.*;
import java.util.*;
import java.text.*;

public class ProjectL44A {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);

        String name;
        int j;
        BankAccount[] ba = new BankAccount[5];
        for (j = 0; j < ba.length; j++) {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine();

            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble();
            System.out.println();

            ba[j] = new BankAccount(name, Double.parseDouble(formatter.format(amount)));
        }

        Comparator comp = new BankAccountComparator();
        Arrays.sort(ba, comp);
        for (BankAccount baObj : ba) {
            System.out.println(baObj);
        }
    }
}
