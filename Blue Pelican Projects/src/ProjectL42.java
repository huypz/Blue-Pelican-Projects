import java.text.*;
import java.util.*;

public class ProjectL42 {
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        //Instantiate an ArrayList object here called aryList
        List<BankAccount> aryList = new ArrayList<>();
        do {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine();

            if(!name.equalsIgnoreCase("EXIT") ) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(); //gives an eye-pleasing blank line
                aryList.add(new BankAccount(name, amount)); // Create a BankAccount object and Add it to the ArrayList object
            }
        } while(!name.equalsIgnoreCase("EXIT"));

        //Search aryList and print out the name and amount of the largest bank account
        BankAccount ba = aryList.get(0); //get first account in the list
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for(int j = 1; j < aryList.size( ); j++) {
            if (aryList.get(j).balance > maxBalance) {
                maxBalance = aryList.get(j).balance;
                maxName = aryList.get(j).name;
            }
        }
        System.out.printf("The account with the largest balance belongs to %s.%nThe amount is $%.2f", maxName, maxBalance);
    }
}