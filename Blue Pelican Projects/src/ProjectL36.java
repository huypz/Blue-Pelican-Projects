import java.util.*;
import java.io.*;

public class ProjectL36 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String fileName;
        do {
            System.out.print("Enter a file directory: ");
            fileName = userInput.next();

            if (fileName.equalsIgnoreCase("exit")) {
                System.out.println("It did not work");
                break;
            }

            try {
                FileInput.readTheFile(fileName);
                System.out.println("It worked");
            }
            catch (IOException e){
                System.out.println("IO ERROR: " + e);
            }
        }
        while (true);
    }
}

class FileInput {
    public static void readTheFile(String fileName) throws IOException {
        Scanner sf = new Scanner(new File("C:\\Users\\hilic\\Documents\\IdeaProjects\\HpCodeWars\\" + fileName));

        int maxIndx = -1;
        String[] text = new String[1000];

        while (sf.hasNext()) {
            maxIndx++;
            text[maxIndx] = sf.nextLine();
        }
        sf.close();

        for (int j = 0; j <= maxIndx; j++) {
            System.out.println(text[j]);
        }
    }
}