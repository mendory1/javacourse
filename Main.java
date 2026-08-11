/**
 * Практика #1: Вложение класса в интерфейс.
 * 
 * Класс внутри интерфейса неявно является public static.
 * Это позволяет создавать вспомогательные классы, логически связанные с интерфейсом.
 */
public class Practice1_NestedClassInInterface {
    
    // Интерфейс со вложенным классом
    interface Calculator {
        
        // Метод интерфейса
        int calculate(int a, int b);
        
        // Вложенный класс (неявно public static)
        class Helper {
            
            // Вспомогательный метод
            public static void printResult(String operation, int result) {
                System.out.println("Результат " + operation + ": " + result);
            }
            
            // Ещё один вспомогательный метод
            public static int validate(int a, int b) {
                if (a < 0 || b < 0) {
                    System.out.println("Внимание: отрицательные числа!");
                }
                return a + b;
            }
        }
    }
    
    // Реализация интерфейса
    static class Sum implements Calculator {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    }
    
    public static void main(String[] args) {
        
        // 1. Вызов статического метода вложенного класса через интерфейс
        Calculator.Helper.printResult("сложения", 15 + 3);
        
        // 2. Использование другого статического метода
        int valid = Calculator.Helper.validate(5, 10);
        System.out.println("Валидация: " + valid);
        
        // 3. Создание объекта класса, реализующего интерфейс
        Sum sum = new Sum();
        int result = sum.calculate(7, 8);
        Calculator.Helper.printResult("сложения (из объекта)", result);
    }
}
