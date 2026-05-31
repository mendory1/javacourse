/**
 * Доступ внешнего класса к полям и методам внутреннего.
 * 
 * Внешний класс имеет доступ ко всем членам внутреннего класса,
 * но для этого нужен объект внутреннего класса.
 */
public class Practice3_OuterToInnerAccess {
    
    // Внутренний класс с разными спецификаторами
    public class InnerClass {
        private String privateField = "private поле inner";
        protected String protectedField = "protected поле inner";
        String defaultField = "default поле inner";
        public String publicField = "public поле inner";
        
        private void privateMethod() {
            System.out.println("Вызван private метод inner");
        }
        
        protected void protectedMethod() {
            System.out.println("Вызван protected метод inner");
        }
        
        void defaultMethod() {
            System.out.println("Вызван default метод inner");
        }
        
        public void publicMethod() {
            System.out.println("Вызван public метод inner");
        }
    }
    
    // Метод внешнего класса, демонстрирующий доступ к inner
    public void accessInnerMembers() {
        // Сначала нужно создать объект внутреннего класса
        InnerClass inner = new InnerClass();
        
        // Доступ к private полям внутреннего класса
        System.out.println("privateField: " + inner.privateField);
        
        // Доступ к protected, default, public
        System.out.println("protectedField: " + inner.protectedField);
        System.out.println("defaultField: " + inner.defaultField);
        System.out.println("publicField: " + inner.publicField);
        
        // Доступ к private методам
        inner.privateMethod();
        inner.protectedMethod();
        inner.defaultMethod();
        inner.publicMethod();
    }
    
    public void modifyInnerFields() {
        InnerClass inner = new InnerClass();
        
        // Внешний класс может изменять поля внутреннего
        inner.privateField = "изменено внешним";
        System.out.println("\nПосле изменения: " + inner.privateField);
    }
}
