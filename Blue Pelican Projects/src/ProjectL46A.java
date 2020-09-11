import java.text.*;
import java.util.*;

public class ProjectL46A {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);

        String name;
        int j;
        BankAccount ba;
        Map accounts = new HashMap();
        Scanner kbReader;
        for (j = 0; j < 4; j++) {
            kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ");
            name = kbReader.nextLine();

            System.out.print("Please enter the amount of the deposit. ");
            double amount = kbReader.nextDouble();
            System.out.println(); //gives an eye pleasing blank line between accounts

            ba = new BankAccount(name, amount);
            accounts.put(ba.accountID, ba);
        }

        Set accountsSet = accounts.keySet();
        Iterator iter = accountsSet.iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            BankAccount value = (BankAccount) accounts.get(key);
            System.out.println(value.accountID + ">>>" + value.name + ">>>" + value.balance);
        }
        System.out.println();
        kbReader = new Scanner(System.in);
        System.out.print("Please enter the ID for the account that you wish to view. ");
        int id = kbReader.nextInt();
        ba = (BankAccount) accounts.get(id);
        System.out.println(ba.accountID + ">>>" + ba.name + ">>>" + ba.balance);
    }
}
