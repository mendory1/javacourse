/**
 * Встроенные аннотации @Override, @Deprecated, @SuppressWarnings.
 * 
 * @Override - проверяет, что метод действительно переопределяет метод суперкласса
 * @Deprecated - помечает элемент как устаревший (выдаёт предупреждение при использовании)
 * @SuppressWarnings - подавляет предупреждения компилятора
 */
public class Practice1_BuiltinAnnotations {
    
    // 1. @Override
    static class Parent {
        void sayHello() {
            System.out.println("Hello from Parent");
        }
    }
    
    static class Child extends Parent {
        
        @Override
        void sayHello() {
            System.out.println("Hello from Child");
        }
    }
    
    // 2. @Deprecated
    static class OldLibrary {
        
        @Deprecated
        public void oldMethod() {
            System.out.println("Старый метод");
        }
    }
    
    // 3. @SuppressWarnings
    static class WarningSuppressor {
        
        @SuppressWarnings("unchecked")  // подавляет предупреждение о непроверенном приведении
        public void useRawList() {
            // Предупреждение: List без generic
            java.util.List list = new java.util.ArrayList();
            list.add("строка");
        }
        
        @SuppressWarnings({"unchecked", "deprecation"})  // несколько предупреждений
        public void multipleWarnings() {
            OldLibrary lib = new OldLibrary();
            lib.oldMethod();  // warning о deprecated - подавлен
            
            java.util.List list = new java.util.ArrayList();  // warning о unchecked - подавлен
            list.add(123);
        }
        
        @SuppressWarnings("all")  // подавляет все предупреждения
        public void suppressAll() {
            OldLibrary lib = new OldLibrary();
            lib.oldMethod();
            
            java.util.List list = new java.util.ArrayList();
            list.add("тест");
        }
    }
}
