import java.util.Formatter;

/**
 * Использование спецификаторов форматирования.
 * 
 * Спецификаторы: %s, %d, %f, %b, %n, %%
 */
public class Practice1_FormatterSpecifiers {
    public static void main(String[] args) {
        
        // 1. %s - строковое представление
        String name = "Мария";
        System.out.printf("1. %%s -> Привет, %s!%n", name);
        
        // 2. %d - десятичное целое
        int age = 25;
        System.out.printf("2. %%d -> Возраст: %d лет%n", age);
        
        // 3. %f - число с плавающей точкой
        double price = 19.99;
        System.out.printf("3. %%f -> Цена: %.2f руб.%n", price);
        
        // 4. %b - логическое значение
        boolean isReady = true;
        System.out.printf("4. %%b -> Готовность: %b%n", isReady);
        
        // 5. %% - вставка знака процента
        double discount = 15.5;
        System.out.printf("5. %%%% -> Скидка: %.1f%%%n", discount);
    }
}
