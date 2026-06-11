/**
 * Спецификаторы доступа для внутренних классов.
 * 
 * Внутренние классы могут иметь любые спецификаторы:
 * public, protected, default (пакетный), private
 */
public class Practice1_InnerClassAccess {
    
    // 1. public - доступен везде
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner доступен из любого места");
        }
    }
    
    // 2. protected - доступен в пакете + подклассах
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner доступен в пакете и подклассах");
        }
    }
    
    // 3. default (пакетный) - доступен только в пакете
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner доступен только в пакете");
        }
    }
    
    // 4. private - доступен только внутри внешнего класса
    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner доступен только внутри ClassA");
        }
    }
    
    // Демонстрация доступа из внутри внешнего класса
    public void testAccessFromOuter() {
        System.out.println("\n=== Доступ из внешнего класса ===");
        
        PublicInner pi = new PublicInner(); // доступен
        ProtectedInner proi = new ProtectedInner(); // доступен
        DefaultInner di = new DefaultInner(); // доступен
        PrivateInner pri = new PrivateInner(); // доступен
        
        pi.show();
        proi.show();
        di.show();
        pri.show();
    }
    
    public static void main(String[] args) {
        Practice1_InnerClassAccess outer = new Practice1_InnerClassAccess();
        outer.testAccessFromOuter();
        
        System.out.println("\n=== Доступ извне (main) ===");
        
        // public - доступен
        PublicInner pi = outer.new PublicInner();
        pi.show();
        
        // protected - доступен (тот же пакет)
        ProtectedInner proi = outer.new ProtectedInner();
        proi.show();
        
        // default - доступен (тот же пакет)
        DefaultInner di = outer.new DefaultInner();
        di.show();
        
        // private - не доступен извне
        PrivateInner pri = outer.new PrivateInner(); // Ошибка
    }
}
