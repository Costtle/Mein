import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class ReadingFromFileAndCountWords {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "112345.txt"; // можно сделать и полный путь к файлу, либо с сеператором
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        int countwords = 0; // создаем объект, с которого будет читать файл
        String line = scanner.nextLine(); // читает строку
        String[] words = line.split(" "); // в строке делим слова через пробел благодаря line.split
        //System.out.println(Arrays.toString(words)); // делаем вывод слов в массив.
        countwords = countwords + words.length;
        System.out.println("Количество слов в строчке: " + countwords);
        scanner.close();
        }
}
