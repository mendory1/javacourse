/**
 * Генерация и обработка основных исключений.
 * 
 * Исключения:
 * - ArithmeticException - арифметическая ошибка (деление на ноль)
 * - ArrayIndexOutOfBoundsException - выход за границы массива
 * - IllegalArgumentException - недопустимый аргумент метода
 * - ClassCastException - неверное приведение типов
 * - NullPointerException - обращение к null-ссылке
 */
public class Practice2_ExceptionExamples {
    
    // 1. ArithmeticException - деление на ноль
    static void demonstrateArithmeticException() {
        try {
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Обработано ArithmeticException: " + e.getMessage());
        }
    }
    
    // 2. ArrayIndexOutOfBoundsException - выход за границы массива
    static void demonstrateArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // индекс 5 не существует
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
    // 3. IllegalArgumentException - недопустимый аргумент
    static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть от 0 до 150, получено: " + age);
        }
        System.out.println("Возраст установлен: " + age);
    }
    
    static void demonstrateIllegalArgumentException() {
        try {
            setAge(200); // недопустимый возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Обработано IllegalArgumentException: " + e.getMessage());
        }
    }
    
    // 4. ClassCastException - неверное приведение типов
    static void demonstrateClassCastException() {
        try {
            Object obj = "Это строка";
            Integer num = (Integer) obj; // нельзя String привести к Integer
            System.out.println("Число: " + num);
        } catch (ClassCastException e) {
            System.out.println("Обработано ClassCastException: " + e.getMessage());
        }
    }
    
    // 5. NullPointerException - обращение к null
    static void demonstrateNullPointerException() {
        try {
            String str = null;
            int length = str.length(); // вызов метода на null
            System.out.println("Длина строки: " + length);
        } catch (NullPointerException e) {
            System.out.println("Обработано NullPointerException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("1. ArithmeticException (деление на ноль):");
        demonstrateArithmeticException();
        
        System.out.println("\n2. ArrayIndexOutOfBoundsException (выход за границы):");
        demonstrateArrayIndexOutOfBoundsException();
        
        System.out.println("\n3. IllegalArgumentException (недопустимый аргумент):");
        demonstrateIllegalArgumentException();
        
        System.out.println("\n4. ClassCastException (неверное приведение):");
        demonstrateClassCastException();
        
        System.out.println("\n5. NullPointerException (обращение к null):");
        demonstrateNullPointerException();
    }
}
