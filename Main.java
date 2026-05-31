/**
 * Доступ внутреннего класса к полям и методам внешнего.
 * 
 * Внутренний класс имеет доступ ко всем членам внешнего класса,
 * независимо от их спецификаторов доступа (даже к private).
 */
public class Practice2_InnerToOuterAccess {
    
    // Поля внешнего класса с разными спецификаторами
    private String privateField = "private поле";
    protected String protectedField = "protected поле";
    String defaultField = "default поле";
    public String publicField = "public поле";
    
    private void privateMethod() {
        System.out.println("Вызван private метод внешнего класса");
    }
    
    protected void protectedMethod() {
        System.out.println("Вызван protected метод внешнего класса");
    }
    
    void defaultMethod() {
        System.out.println("Вызван default метод внешнего класса");
    }
    
    public void publicMethod() {
        System.out.println("Вызван public метод внешнего класса");
    }
    
    // Внутренний класс
    public class InnerClass {
        
        public void accessOuterMembers() {            
            // Доступ к private полям внешнего класса
            System.out.println("privateField: " + privateField);
            
            // Доступ к protected, default, public
            System.out.println("protectedField: " + protectedField);
            System.out.println("defaultField: " + defaultField);
            System.out.println("publicField: " + publicField);
            
            // Доступ к private методам
            privateMethod();
            protectedMethod();
            defaultMethod();
            publicMethod();
        }
        
        public void modifyOuterFields() {
            // Внутренний класс может изменять поля внешнего
            privateField = "изменён из внутреннего класса";
            protectedField = "тоже изменён";
        }
    }
}
