import java.util.Arrays;

public class ProjectL19A {
    public static void main(String[] args) {
        String[] ss = new String[] {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
