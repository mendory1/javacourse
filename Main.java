import java.io.*;

/**
 * Интерфейс AutoCloseable и try-with-resources.
 * 
 * AutoCloseable позволяет автоматически закрывать ресурсы при выходе из блока try-with-resources.
 */

// Собственный класс, реализующий AutoCloseable
class DatabaseConnection implements AutoCloseable {
    
    private String connectionName;
    
    public DatabaseConnection(String name) {
        this.connectionName = name;
        System.out.println("Подключение к БД '" + name + "' открыто");
    }
    
    public void query(String sql) {
        System.out.println("Выполняется запрос: " + sql);
    }
    
    @Override
    public void close() {
        System.out.println("Подключение к БД '" + connectionName + "' закрыто");
    }
}

public class Practice4_AutoCloseable {
    public static void main(String[] args) {
        
        // try-with-resources - ресурс закроется автоматически
        try (DatabaseConnection conn = new DatabaseConnection("MySQL")) {
            conn.query("SELECT * FROM users");
            conn.query("UPDATE users SET name = 'Мария'");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        System.out.println("\nРесурс уже закрыт, код продолжает работу");
    }
}
