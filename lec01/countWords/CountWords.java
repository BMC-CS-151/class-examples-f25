import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        String fname = args[0];
        System.out.println(fname);

        Scanner sc = new Scanner(new File(fname));
        int numWords = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            numWords += words.length;
        }

        System.out.println(numWords);

    }
}

