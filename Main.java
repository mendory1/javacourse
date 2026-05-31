/**
 * Интерфейс с default и static методами.
 * 
 * default метод - может быть переопределён в классе-реализации
 * static метод - вызывается только через имя интерфейса
 */
public class Practice1_InterfaceDefaultStatic {
    
    // Интерфейс с default и static методами
    interface Vehicle {
        
        // Абстрактный метод
        void start();
        
        // default метод
        default void stop() {
            System.out.println("Транспорт остановлен");
        }
        
        // static метод
        static void info() {
            System.out.println("Это интерфейс Vehicle");
        }
    }
    
    // Класс, реализующий интерфейс (без переопределения default метода)
    static class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Машина завелась");
        }
    }
    
    // Класс, реализующий интерфейс с переопределением default метода
    static class ElectricCar implements Vehicle {
        @Override
        public void start() {
            System.out.println("Электромобиль запущен");
        }
        
        @Override
        public void stop() {
            System.out.println("Электромобиль остановлен");
        }
    }
    
    public static void main(String[] args) {
        
        // 1. Вызов static метода через имя интерфейса
        System.out.println("1. Vehicle.info() - статический метод:");
        Vehicle.info();
        
        // 2. Вызов через объект класса Car
        System.out.println("\n2. Объект Car:");
        Car car = new Car();
        car.start(); // реализованный абстрактный метод
        car.stop(); // default метод (не переопределён)
        
        // 3. Вызов через объект ElectricCar
        System.out.println("\n3. Объект ElectricCar:");
        ElectricCar eCar = new ElectricCar();
        eCar.start(); // реализованный абстрактный метод
        eCar.stop(); // переопределённый default метод
        
        // 4. Полиморфный вызов
        System.out.println("\n4. Полиморфный вызов (Vehicle):");
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();
        
        v1.start();
        v1.stop();  // вызывается default из интерфейса
        
        v2.start();
        v2.stop();  // вызывается переопределённый метод ElectricCar
        
        //Нельзя вызвать static метод через объект
        // car.info(); - ошибка компиляции
    }
}
