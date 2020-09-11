public class ProjectL18B {
    public static void main(String[] args) {
        char[] ch = new char[26];
        for (int i = 0, ascii = 65; i <= 25; i++, ascii++) {
            ch[i] = (char) ascii;
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            if (i != ch.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
