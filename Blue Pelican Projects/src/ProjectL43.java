import java.text.*;
import java.util.*;

public class ProjectL43 {
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);

        String name;
        ArrayList aryLst = new ArrayList();
        ListIterator iter = aryLst.listIterator();
        do {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine( );

            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble( );
                System.out.println(" "); //gives an eye pleasing blank line between accounts

                BankAccount theAccount = new BankAccount(name, amount);
                iter.add(theAccount);
            }
        } while(!name.equalsIgnoreCase("EXIT"));
        //Search aryLst and print out the name and amount of the largest bank account
        BankAccount ba = (BankAccount) iter.previous();
        double maxBalance = ba.balance; //set last account as winner so far
        String maxName = ba.name;
        while(iter.hasPrevious()) {
            BankAccount temp = (BankAccount) iter.previous();
            if (temp.balance > maxBalance) {
                maxBalance = temp.balance;
                maxName = temp.name;
            }
        }

        System.out.println();
        System.out.println("The account with the largest balance belongs to " + maxName + ".");
        System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
    }
}