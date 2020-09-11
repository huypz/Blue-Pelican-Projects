public class ProjectL14 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-20s%-10s%-10s%s%n", "Decimal", "Binary", "Octal", "Hex", "Character");
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%-15d%-20s%-10s%-10s%s%n", i, Integer.toBinaryString(i), Integer.toOctalString(i), Integer.toHexString(i), (char) i);
        }
    }
}
