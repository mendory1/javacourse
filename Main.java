/**
 * Переопределённый метод (overriding).
 * 
 * Переопределение: подкласс изменяет реализацию метода суперкласса.
 * Сигнатура метода (имя + параметры) должна полностью совпадать.
 */
public class Practice2_Overriding {
    
    static class Animal {
        String makeSound() {
            return "Животное издаёт звук";
        }
    }
    
    static class Dog extends Animal {
        // Переопределение: та же сигнатура, новая реализация
        @Override
        String makeSound() {
            return "Собака гавкает: Гав-гав";
        }
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog(); // полиморфная ссылка
        
        System.out.println("animal.makeSound() -> " + animal.makeSound());
        System.out.println("dog.makeSound() -> " + dog.makeSound()); // вызывается метод Dog
    }
}
