/**
 * Конфликт одинаковых default методов в нескольких интерфейсах.
 * 
 * Если класс реализует два интерфейса с одинаковыми default методами,
 * возникает конфликт - компилятор не знает, какой метод выбрать.
 * Решение: класс обязан переопределить конфликтующий метод.
 */
public class Practice2_DefaultMethodConflict {
    
    // Первый интерфейс
    interface A {
        default void show() {
            System.out.println("Метод из интерфейса A");
        }
    }
    
    // Второй интерфейс с таким же методом
    interface B {
        default void show() {
            System.out.println("Метод из интерфейса B");
        }
    }
    
    // Такой код вызовет ошибку компиляции:
    // class MyClass implements A, B { }
    
    // Правильное решение: переопределить конфликтующий метод
    static class MyClass implements A, B {
        
        // Переопределяем конфликтующий метод
        @Override
        public void show() {
            System.out.println("Переопределённый метод в классе");
        }
        
        // Можно также выбрать конкретную реализацию через super
        public void showA() {
            A.super.show();  // вызов метода из интерфейса A
        }
        
        public void showB() {
            B.super.show();  // вызов метода из интерфейса B
        }
    }
    
    // Другой пример: интерфейс C наследует от A и B
    interface C extends A, B {
        // Тоже конфликт, нужно переопределить default метод
        @Override
        default void show() {
            System.out.println("Метод из интерфейса C (переопределён)");
        }
    }
    
    static class SimpleClass implements C {
        // show() уже определён в C, можно не переопределять
    }
}
