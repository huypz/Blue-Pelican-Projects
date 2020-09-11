import java.io.*;
import java.util.*;

public class ProjectL37 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        System.out.print("What is the slope of your line? : ");
        double slope = kbReader.nextDouble();

        System.out.print("What is the y-intercept of your line? : ");
        double yIntc = kbReader.nextDouble();

        LinearFunction line = new LinearFunction(slope, yIntc);

        System.out.println("\nSlope of this line is: " + line.getSlope());
        System.out.println("Y-intercept of this line is: " + line.getYIntercept());
        System.out.println("Root of this line is: " + line.getRoot( ));

        System.out.print("\nWhat is an x value for which you wish to solve for y? ");
        double x = kbReader.nextDouble( );
        double yValue = line.getYValue(x);
        System.out.println("The y value corresponding to x = " + x + " is " + yValue);

        System.out.print("\nWhat is a y value for which you wish to solve for x? ");
        double y = kbReader.nextDouble( );
        double xValue = line.getXValue(y);
        System.out.println("The x value corresponding to y = " + y + " is " + xValue);
    }
}

interface LinearFunctionMethods {
    double getSlope();
    double getYIntercept();
    double getRoot();

    double getYValue(double x);
    double getXValue(double y);
}

class LinearFunction {
    private double slope;
    private double yIntc;

    public LinearFunction(double slope, double yIntc) {
        this.slope = slope;
        this.yIntc = yIntc;
    }

    public double getSlope() { return slope; }
    public double getYIntercept() { return yIntc; }
    public double getRoot() { return -yIntc / slope; }

    public double getYValue(double x) {
        // y = mx + b
        return (slope * x) + yIntc;
    }

    public double getXValue(double y) {
        // y = mx + b   =>   (y-b)/m = x
        return (y - yIntc) / slope;
    }
}