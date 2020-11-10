import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class ReadingFromFileAndCountWords {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "112345.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        }
        scanner.close();
    }
}
