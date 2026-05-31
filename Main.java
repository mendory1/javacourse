import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Чтение данных из текстового файла с помощью Scanner.
 */
public class Practice1_ScannerFile {
    public static void main(String[] args) {
        
        // Создаём тестовый файл
        try (java.io.FileWriter writer = new java.io.FileWriter("data.txt")) {
            writer.write("Полина 18\nМария 20\Ольга 23");
        } catch (java.io.IOException e) {
            System.out.println("Ошибка создания файла");
        }
        
        // Чтение файла с помощью Scanner
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            while (scanner.hasNext()) {
                String name = scanner.next();
                int age = scanner.nextInt();
                System.out.println("Имя: " + name + ", Возраст: " + age);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
