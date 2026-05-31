import java.io.FileInputStream;
import java.io.IOException;

/**
 * Демонстрация метода read() класса FileInputStream.
 * 
 * read() - читает один байт из файла и возвращает его как int (0-255).
 * При достижении конца файла возвращает -1.
 */
public class Practice1_ReadExample {
    public static void main(String[] args) {
        
        // Сначала создадим тестовый файл для чтения
        try (java.io.FileOutputStream fos = new java.io.FileOutputStream("test.txt")) {
            fos.write("Hello".getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
        }
        
        // Чтение файла с помощью FileInputStream
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            
            // Читаем байты до конца файла
            while ((data = fis.read()) != -1) {
                System.out.printf("Прочитан байт: %d (символ: %c)%n", data, (char) data);
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
