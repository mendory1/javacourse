/**
 * Создание собственного класса исключения.
 */

// Собственное checked-исключение
class InvalidAgeException extends Exception {
    
    // Конструктор 1: без параметров
    public InvalidAgeException() {
        super("Недопустимый возраст");
    }
    
    // Конструктор 2: с сообщением
    public InvalidAgeException(String message) {
        super(message);
    }
    
    // Конструктор 3: с сообщением и причиной
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Собственное unchecked-исключение (наследуется от RuntimeException)
class InsufficientFundsException extends RuntimeException {
    
    private double deficit; // дополнительное поле
    
    public InsufficientFundsException() {
        super("Недостаточно средств");
    }
    
    public InsufficientFundsException(String message) {
        super(message);
    }
    
    public InsufficientFundsException(double amount, double needed) {
        super(String.format("Недостаточно средств: %.2f, необходимо %.2f", amount, needed));
        this.deficit = needed - amount;
    }
    
    public double getDeficit() {
        return deficit;
    }
}

// Класс для демонстрации
public class Practice1_CustomException {
    
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст " + age + " недопустим (допустимо 0-150)");
        }
        System.out.println("Возраст " + age + " принят");
    }
    
    static void withdrawMoney(double balance, double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        }
        System.out.println("Снято " + amount + " руб. Остаток: " + (balance - amount));
    }
    
    public static void main(String[] args) {
        
        // Демонстрация InvalidAgeException (checked)
        System.out.println("1. InvalidAgeException (checked):");
        try {
            checkAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("  Перехвачено: " + e.getMessage());
        }
        
        try {
            checkAge(25); // корректный возраст
        } catch (InvalidAgeException e) {
            System.out.println("  Ошибка: " + e.getMessage());
        }
        
        // Демонстрация InsufficientFundsException (unchecked)
        System.out.println("\n2. InsufficientFundsException (unchecked):");
        try {
            withdrawMoney(100, 500);
        } catch (InsufficientFundsException e) {
            System.out.println("Перехвачено: " + e.getMessage());
            System.out.println("Дефицит: " + e.getDeficit() + " руб.");
        }
    }
}
