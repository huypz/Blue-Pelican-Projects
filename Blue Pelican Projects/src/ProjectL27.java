import java.io.*;
import java.util.*;

public class ProjectL27
{
    public static void main(String[] args) throws IOException
    {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\ProjectL27.in"));

        while (sf.hasNextInt())
        {
            int n = sf.nextInt();
            String s = Integer.toBinaryString(n);

            StringBuilder sb = new StringBuilder(s);
            for (int i = sb.length(); i < 8; i++)
            {
                sb.insert(0, "0");
            }
            s = sb.reverse().toString();

            System.out.printf("Switch status for data value %d%n", n);

            Scanner sc = new Scanner(s);
            sc.useDelimiter("");

            int sw = 56;
            while (sc.hasNext())
            {
                String bin = sc.next();
                String status = bin.equals("1") ? "on" : "off";
                System.out.printf("  Switch sw%d is \"%s\"%n", sw, status);
                sw++;
            }
            System.out.println();

            sc.close();
        }
        sf.close();
    }
}