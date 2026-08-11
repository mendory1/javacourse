/**
 * Переопределение метода equals() в классе Person.
 * 
 * Соглашения для метода equals() (из спецификации Java):
 * 1. Рефлексивность: x.equals(x) должно возвращать true
 * 2. Симметричность: x.equals(y) == y.equals(x)
 * 3. Транзитивность: если x.equals(y) true и y.equals(z) true, то x.equals(z) true
 * 4. Постоянство: многократный вызов должен возвращать одинаковый результат
 * 5. x.equals(null) всегда должно возвращать false
 */
public class Practice1_EqualsOverride {
    
    static class Person {
        private final String name;
        private final int age;
        private final String passportId;
        
        public Person(String name, int age, String passportId) {
            this.name = name;
            this.age = age;
            this.passportId = passportId;
        }
        
        /**
         * Переопределение метода equals().
         * Два человека считаются равными, если у них совпадают:
         * - passportId
         * - name и age
         */
        @Override
        public boolean equals(Object obj) {
            // 1. Проверка: ссылаемся ли на тот же объект
            if (this == obj) {
                return true;
            }
            
            // 2. Проверка: obj не должен быть null
            if (obj == null) {
                return false;
            }
            
            // 3. Проверка: должны быть одного класса
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            
            // 4. Приведение типа и сравнение полей
            Person other = (Person) obj;
            
            // Сравниваем паспортные данные
            if (passportId == null) {
                if (other.passportId != null) {
                    return false;
                }
            } else if (!passportId.equals(other.passportId)) {
                return false;
            }
            
            // Сравниваем имя и возраст
            if (name == null) {
                if (other.name != null) {
                    return false;
                }
            } else if (!name.equals(other.name)) {
                return false;
            }
            
            return age == other.age;
        }
      
         
        // hashCode всегда переопределяется вместе с equals
        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + (passportId != null ? passportId.hashCode() : 0);
            return result;
        }
        
        @Override
        public String toString() {
            return String.format("Person{name='%s', age=%d, passport='%s'}", name, age, passportId);
        }
    }
    
}
