import java.util.Arrays;

public class ProjectL19B {
    public static void main(String[] args) {
        String[] ss = new String[] {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.printf("%-10s%-10s%n%n", "Ascend", "Descend");
        for (int i = 0; i < ss.length; i++) {
            System.out.printf("%-10s%-10s%n", ss[i], ss[ss.length - 1 - i]);
        }
    }
}
