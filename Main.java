import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Демонстрация метода write(int) класса FileOutputStream.
 * 
 * write(int) - записывает один байт (младшие 8 бит) в файл.
 */
public class Practice2_WriteExample {
    public static void main(String[] args) {
        
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            System.out.println("=== Запись в файл output.txt ===\n");
            
            // Записываем отдельные байты
            fos.write(72); // 'H'
            fos.write(101); // 'e'
            fos.write(108); // 'l'
            fos.write(108); // 'l'
            fos.write(111); // 'o'
            fos.write(33); // '!'
            
            System.out.println("Записано 6 байтов: Hello!");
            
            // Можно записывать массив байтов
            byte[] bytes = {32, 87, 111, 114, 108, 100}; // " World"
            fos.write(bytes);
            System.out.println("Записано ещё 6 байтов: World");
            
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
        
        // Проверяем результат
        try (java.io.FileInputStream fis = new java.io.FileInputStream("output.txt")) {
            int data;
            System.out.print("\nСодержимое файла: ");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
