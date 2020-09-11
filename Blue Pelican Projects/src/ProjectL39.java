import java.util.Scanner;

public class ProjectL39 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Generate which term number? : ");
        int k = kbReader.nextInt();

        System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));
        kbReader.close();
    }
}

class ModFib {
    public static int modFibonacci(int n) {
        if (n == 0) {
            return 3;
        }
        else if (n == 1) {
            return 5;
        }
        else if (n == 2) {
            return 8;
        }
        return modFibonacci(n-1) + modFibonacci(n-2) + modFibonacci(n-3);
    }
}