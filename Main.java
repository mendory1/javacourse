/**
 * Перегруженные методы (overloading).
 * 
 * Перегрузка: одинаковое имя, разные параметры.
 * Тип возвращаемого значения не влияет на перегрузку.
 */
public class Practice1_Overloading {
    
    static class Calculator {
        
        // 1. Два целых числа
        int sum(int a, int b) {
            return a + b;
        }
        
        // 2. Перегрузка: три целых числа
        int sum(int a, int b, int c) {
            return a + b + c;
        }
        
        // 3. Перегрузка: два дробных числа
        double sum(double a, double b) {
            return a + b;
        }
        
        // 4. Перегрузка: другой порядок параметров
        String sum(String text, int number) {
            return text + number;
        }
        
        // Нельзя: перегрузка только по типу возврата
        // long sum(int a, int b) { return a + b; } - ошибка
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("sum(2, 3) = " + calc.sum(2, 3));
        System.out.println("sum(2, 3, 4) = " + calc.sum(2, 3, 4));
        System.out.println("sum(2.5, 3.5) = " + calc.sum(2.5, 3.5));
        System.out.println("sum(\"Результат: \", 10) = " + calc.sum("Результат: ", 10));
    }
}
