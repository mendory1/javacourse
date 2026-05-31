/**
 * Аннотация @Override помогает найти ошибки переопределения.
 * 
 * @Override заставляет компилятор проверить, что метод действительно
 * переопределяет метод суперкласса. Если нет - ошибка компиляции.
 */
public class Practice3_OverrideAnnotation {
    
    static class Parent {
        void processData(String name) {
            System.out.println("Parent: " + name);
        }
        
        void calculate(int x) {
            System.out.println("Parent calculate: " + x);
        }
    }
    
    static class Child extends Parent {
        
        // Ошибка: опечатка в имени метода
        @Override
        void processDate(String name) {
            System.out.println("Child: " + name);
        }
        
        // Ошибка: другой тип параметра
        @Override
        void processData(int name) {
            System.out.println("Child: " + name);
        }
        
        // Ошибка: другой порядок параметров
        @Override
        void processData(String name, int extra) {
            System.out.println("Child: " + name);
        }
        
        // Ошибка: другой тип возврата
        double calculate(int x) { return x * 2.0; }
    }
}
