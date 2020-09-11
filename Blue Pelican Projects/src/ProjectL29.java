import java.util.Random;

public class ProjectL29 {
    public static void main(String[] args) {
        MonteCarlo mcObj = new MonteCarlo(5, 3, 2); //center x, center y, radius
        int sqrCount = 0;
        int cirCount = 0;
        for (int i = 0; i < 100000000; i++) {
            double randomX = mcObj.nextRainDrop_x();
            double randomY = mcObj.nextRainDrop_y();
            if (mcObj.insideCircle(randomX, randomY)) {
                cirCount++;
            }
            sqrCount++;
        }

        //Approximate PI
        double sqrArea = Math.pow(MonteCarlo.side, 2);
        double pi = cirCount * Math.pow(MonteCarlo.side, 2) / (sqrCount * Math.pow(MonteCarlo.r, 2));
        System.out.println(pi);

    }
}

class MonteCarlo {
    public static double h, k, r;
    public static double side;
    private Random rndm;

    public MonteCarlo(double h, double k, double r) {
        this.h = h;
        this.k = k;
        this.r = r;
        this.side = 2*r;
        rndm = new Random();
    }

    public double nextRainDrop_x() {
        return 4 * rndm.nextDouble() + 3; //returns 3.0 <= x < 7.0
    }

    public double nextRainDrop_y() {
        return 4 * rndm.nextDouble() + 1; //returns 1.0 <= y < 5.0
    }

    public boolean insideCircle(double x, double y) {
        boolean isInside = Math.pow(x - h, 2) + Math.pow(y - k, 2) <= Math.pow(r, 2) ? true : false; // (x-h)^2 + (y-k)^2 <= r^2
        return isInside;
    }
}
