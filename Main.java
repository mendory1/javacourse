/**
 * Обработка нескольких исключений.
 * 
 * Ситуации:
 * 1. Несколько исключений обрабатываются одинаково (multi-catch)
 * 2. Исключения образуют иерархию (порядок важен)
 */
public class Practice1_MultiCatch {
    
    // 1. несколько исключений обрабатываются одинаково
    static void multiCatchExample(int choice) {
        try {
            if (choice == 1) {
                int[] arr = new int[3];
                arr[5] = 10; // ArrayIndexOutOfBoundsException
            } else if (choice == 2) {
                String str = null;
                str.length(); // NullPointerException
            } else if (choice == 3) {
                Object obj = "строка";
                Integer num = (Integer) obj; // ClassCastException
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ClassCastException e) {
            // Все три исключения обрабатываются одинаково
            System.out.println("  Перехвачено исключение: " + e.getClass().getSimpleName());
            System.out.println("  Сообщение: " + e.getMessage());
        }
    }
    
    // 2. исключения образуют иерархию
    static void hierarchyExample(int level) {
        try {
            if (level == 1) {
                throw new ArithmeticException("Деление на ноль");
            } else if (level == 2) {
                throw new RuntimeException("Runtime исключение");
            } else if (level == 3) {
                throw new Exception("Обычное исключение");
            }
        } catch (ArithmeticException e) {
            // Самый конкретный (подкласс) - должен быть первым
            System.out.println("  ArithmeticException (подкласс RuntimeException): " + e.getMessage());
        } catch (RuntimeException e) {
            // Более общий (суперкласс)
            System.out.println("  RuntimeException: " + e.getMessage());
        } catch (Exception e) {
            // Самый общий - должен быть последним
            System.out.println("  Exception: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("choice = 1 (ArrayIndexOutOfBoundsException):");
        multiCatchExample(1);
        
        System.out.println("\nchoice = 2 (NullPointerException):");
        multiCatchExample(2);
        
        System.out.println("\nchoice = 3 (ClassCastException):");
        multiCatchExample(3);
        
        System.out.println("level = 1 (ArithmeticException):");
        hierarchyExample(1);
        
        System.out.println("\nlevel = 2 (RuntimeException):");
        hierarchyExample(2);
        
        System.out.println("\nlevel = 3 (Exception):");
        hierarchyExample(3);
    }
}
