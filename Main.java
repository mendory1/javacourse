/**
 * Перехваченное и неперехваченное исключения.
 * 
 * Перехваченное исключение - обрабатывается в try-catch.
 * Неперехваченное исключение - приводит к аварийной остановке программы.
 */
public class Practice1_CaughtVsUncaught {
    
    // Метод, который генерирует ArithmeticException (будет перехвачен)
    static void divide(int a, int b) {
        System.out.println("Вызов divide(" + a + ", " + b + ")");
        int result = a / b; // если b = 0, то ArithmeticException
        System.out.println("Результат деления: " + result);
    }
    
    // Метод, который генерирует ArrayIndexOutOfBoundsException (не будет перехвачен)
    static void accessArray(int index) {
        System.out.println("Вызов accessArray(" + index + ")");
        int[] arr = {1, 2, 3};
        int value = arr[index]; // если index >= 3, то ArrayIndexOutOfBoundsException
        System.out.println("Значение: " + value);
    }
    
    public static void main(String[] args) {
        
        // Перехваченное исключение (обрабатывается через try-catch)
        try {
            divide(10, 0); // генерирует ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехваченно: " + e);
            System.out.println("Программа продолжает работу...");
        }
        
        // Неперехваченное исключение (вызовет аварийную остановку)
        // Следующий код вызовет исключение, и программа упадёт
        accessArray(10);  // ArrayIndexOutOfBoundsException - не перехвачено!
        
        // Этот код НЕ выполнится из-за аварийной остановки
        System.out.println("\nЭта строка не будет выведена");
    }
}
