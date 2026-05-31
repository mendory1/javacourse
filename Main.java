import java.util.Date;

/**
 * Форматирование времени и даты.
 * 
 * Спецификаторы: %tH, %tM, %tS, %tY, %tB
 */
public class Practice3_DateTimeFormatting {
    public static void main(String[] args) {
        
        Date now = new Date();
        
        // 1. %tH - час (00-23)
        System.out.printf("1. %%tH -> Час (24-часовой): %tH%n", now);
        
        // 2. %tM - минуты (00-59)
        System.out.printf("2. %%tM -> Минуты: %tM%n", now);
        
        // 3. %tS - секунды (00-59)
        System.out.printf("3. %%tS -> Секунды: %tS%n", now);
        
        // 4. %tY - год (4-значный)
        System.out.printf("4. %%tY -> Год: %tY%n", now);
        
        // 5. %tB - полное название месяца
        System.out.printf("5. %%tB -> Месяц: %tB%n", now);
    }
}
