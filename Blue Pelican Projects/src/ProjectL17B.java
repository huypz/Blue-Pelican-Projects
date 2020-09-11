import java.util.Scanner;

public class ProjectL17B {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence that is to be encrypted: ");
        String sntnc = kbReader.nextLine();
        System.out.println("Original sentence = " + sntnc);

        Crypto myCryptObj = new Crypto();
        String encryptedSntnc = myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptedSntnc);

        String decryptedSntnc = myCryptObj.decrypt(encryptedSntnc);
        System.out.println("Decrypted sentence = " + decryptedSntnc);
    }
}

class Crypto {
    private static Scanner sc;
    public String encrypt(String sntnc) {
        sntnc = sntnc.replaceAll("[Bb]", "duh>?/");
        sntnc = sntnc.replaceAll("[Gg]", "jeb..w");
        sntnc = sntnc.replaceAll("[Mm]", "ssad");
        sntnc = sntnc.replaceAll("[Vv]", "ag',r");
        return sntnc;
    }

    public String decrypt(String sntnc) {
        sntnc = sntnc.replace("duh>?/", "b");
        sntnc = sntnc.replace("jeb..w", "g");
        sntnc = sntnc.replace("ssad", "m");
        sntnc = sntnc.replace("ag',r", "v");
        return sntnc;
    }
}
