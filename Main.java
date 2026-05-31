/**
 * Демонстрация 10 методов класса String.
 */
public class Practice1_StringMethods {
    public static void main(String[] args) {
        
        String str = "  Java Programming Language  ";
        
        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());
        
        // 2. trim() - удаляет пробелы в начале и конце
        String trimmed = str.trim();
        System.out.println("2. trim(): '" + trimmed + "'");
        
        // 3. toLowerCase() / toUpperCase() - преобразование регистра
        System.out.println("3. toLowerCase(): " + trimmed.toLowerCase());
        System.out.println("   toUpperCase(): " + trimmed.toUpperCase());
        
        // 4. charAt() - возвращает символ по индексу
        System.out.println("4. charAt(5): " + trimmed.charAt(5));
        
        // 5. substring() - извлекает подстроку
        System.out.println("5. substring(5, 12): " + trimmed.substring(5, 12));
        
        // 6. indexOf() - ищет индекс первого вхождения
        System.out.println("6. indexOf('a'): " + trimmed.indexOf('a'));
        System.out.println("   indexOf(\"Programming\"): " + trimmed.indexOf("Programming"));
        
        // 7. lastIndexOf() - ищет индекс последнего вхождения
        System.out.println("7. lastIndexOf('a'): " + trimmed.lastIndexOf('a'));
        
        // 8. replace() - заменяет символы или подстроки
        System.out.println("8. replace('a', 'o'): " + trimmed.replace('a', 'o'));
        System.out.println("   replace(\"Java\", \"Python\"): " + trimmed.replace("Java", "Python"));
        
        // 9. split() - разбивает строку на массив по разделителю
        String[] words = trimmed.split(" ");
        System.out.print("9. split(\" \"): ");
        for (String w : words) {
            System.out.print("[" + w + "] ");
        }
        System.out.println();
        
        // 10. startsWith() / endsWith() - проверка начала/конца строки
        System.out.println("10. startsWith(\"Java\"): " + trimmed.startsWith("Java"));
        System.out.println("    endsWith(\"ge\"): " + trimmed.endsWith("ge"));
    }
}
