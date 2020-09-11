import java.util.Scanner;

public class ProjectL20 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = sc.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = sc.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = sc.nextDouble();
        System.out.print("Enter the x coordinate of the point: ");
        a = sc.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        b = sc.nextDouble();
        System.out.printf("\nDistance from the point to the line is: %f", DistToLine.getDist(a, b));
    }
}

class DistToLine {
    public static double A, B, C;

    public static double getDist(double a, double b) {
        return Math.abs(A*a + B*b + C) / Math.sqrt(A*A + B*B);
    }
}
