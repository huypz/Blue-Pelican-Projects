public class ProjectL50B {
    public static void main(String args[]) {
        int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
        Integer iw[] = new Integer[14];
        for(int k = 0; k < 14; k++) {
            iw[k] = i[k]; //pre Java 5.0 iw[k] = new Integer(i[k]);
        }

        System.out.println(binarySearch(iw, 22)); //3
        //pre Java 5.0, System.out.println(binarySearch(iw, new Integer(22)));
        System.out.println(binarySearch(iw, 89)); //11
        System.out.println(binarySearch(iw, -100)); //-1
        System.out.println(binarySearch(iw, 72)); //-1
        System.out.println(binarySearch(iw, 102)); //-1
    }

    private static int binarySearch(Object[] a, Object srchVal) {
        if ((a[0] instanceof Comparable)) {
            System.out.print("Objects are not comparable! : ");
            return -1;
        }

        int lb = 0;
        int ub = a.length - 1;
        Comparable search = (Comparable) srchVal;

        while (lb <= ub) {
            int m = (ub + lb) / 2;
            Comparable temp = (Comparable) a[m];
            if (temp.equals(search)) {
                return m;
            }
            else if (temp.compareTo(search) < 0) {
                lb = m + 1;
            }
            else {
                ub = m - 1;
            }
        }
        return -1;
    }
}
