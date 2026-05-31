/**
 * Практика #1: Демонстрация 10 методов StringBuilder (аналогично для StringBuffer).
 * 
 * StringBuilder - не потокобезопасный, но быстрее.
 * StringBuffer - потокобезопасный, но медленнее.
 */
public class Practice1_StringBuilderMethods {
    public static void main(String[] args) {
        
        // Создаём StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        
        System.out.println("=== 10 методов StringBuilder ===\n");
        
        // 1. append() - добавляет строку в конец
        sb.append(" Programming");
        System.out.println("1. append(\" Programming\"): " + sb);
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, "Language ");
        System.out.println("2. insert(5, \"Language \"): " + sb);
        
        // 3. delete() - удаляет символы от start до end-1
        sb.delete(5, 13);
        System.out.println("3. delete(5, 13): " + sb);
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(4);
        System.out.println("4. deleteCharAt(4): " + sb);
        
        // 5. replace() - заменяет часть строки
        sb.replace(0, 4, "Python");
        System.out.println("5. replace(0, 4, \"Python\"): " + sb);
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse(): " + sb);
        
        // 7. length() - возвращает длину
        System.out.println("7. length(): " + sb.length());
        
        // 8. charAt() - возвращает символ по индексу
        System.out.println("8. charAt(3): " + sb.charAt(3));
        
        // 9. substring() - извлекает подстроку (не изменяет оригинал)
        String sub = sb.substring(0, 5);
        System.out.println("9. substring(0, 5): " + sub);
        
        // 10. setCharAt() - заменяет символ по индексу
        sb.setCharAt(0, 'G');
        System.out.println("10. setCharAt(0, 'G'): " + sb);
    }
}
