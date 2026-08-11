import java.util.StringJoiner;

/**
 * Класс StringJoiner для объединения строк с разделителями.
 * 
 * StringJoiner удобен для сборки строк с разделителем, префиксом и суффиксом.
 */
public class Practice2_StringJoiner {
    public static void main(String[] args) {
        
        // 1. Простой StringJoiner с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Банан");
        sj1.add("Апельсин");
        System.out.println("1. Простой: " + sj1);
        
        // 2. StringJoiner с разделителем, префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный");
        sj2.add("Зелёный");
        sj2.add("Синий");
        System.out.println("2. С префиксом/суффиксом: " + sj2);
        
        // 3. Объединение двух StringJoiner
        StringJoiner sj3 = new StringJoiner(", ", "{", "}");
        sj3.add("один");
        sj3.add("два");
        
        StringJoiner sj4 = new StringJoiner(", ");
        sj4.add("три");
        sj4.add("четыре");
        
        sj3.merge(sj4);
        System.out.println("3. После merge: " + sj3);
        
        // 4. Обработка пустого значения
        StringJoiner sj5 = new StringJoiner(", ", "<", ">");
        System.out.println("4. Пустой: " + sj5);
        
        // 5. Установка значения для пустого через setEmptyValue
        sj5.setEmptyValue("(пусто)");
        System.out.println("   После setEmptyValue: " + sj5);
    }
}
