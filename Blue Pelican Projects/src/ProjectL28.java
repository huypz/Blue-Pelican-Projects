public class ProjectL28 {
    public static void main(String[] args) {
        int p = 386, q = 581, n = 0;

        System.out.println("Start");
        long timeStart1 = System.currentTimeMillis();
        for (int j=0; j<2000000000; j++) {
            for(int k = 0; k < 1000; k++) //Use this extra loop for faster computers
                n = ((p * 2) + q) / 2;
            //n = p + (q >> 1);
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println(n);
        long timeElapsed1 = timeEnd1 - timeStart1;
        System.out.printf("%.3f%n", timeElapsed1/1000.0);
        //begin timing the second loop.
        n = 0;
        long timeStart2 = System.currentTimeMillis();
        for (int j=0; j<2000000000; j++) {
            for(int k = 0; k < 1000; k++)
            //n = ((p * 2) + q) / 2;
                n = p + (q >> 1);
        }
        long timeEnd2 = System.currentTimeMillis();
        System.out.println(n);
        long timeElapsed2 = timeEnd2 - timeStart2;
        System.out.printf("%.3f%n", timeElapsed2/1000.0);
    }
}
