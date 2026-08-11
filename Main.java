/**
 * Преобразование между StringBuilder и StringBuffer.
 * 
 * Методы преобразования:
 * - new StringBuilder(StringBuffer) - конструктор
 * - new StringBuffer(StringBuilder) - конструктор
 * - toString() + конструктор
 * - append() с другим типом
 */
public class Practice2_StringBuilderStringBufferConversion {
    public static void main(String[] args) {
        
        // 1. StringBuffer -> StringBuilder через конструктор
        StringBuffer buffer1 = new StringBuffer("Hello from StringBuffer");
        StringBuilder builder1 = new StringBuilder(buffer1);
        System.out.println("1. StringBuffer -> StringBuilder: " + builder1);
        
        StringBuilder builder2 = new StringBuilder("Hello from StringBuilder");
        StringBuffer buffer2 = new StringBuffer(builder2);
        System.out.println("2. StringBuilder -> StringBuffer: " + buffer2);
        
        // 2. Через toString()
        StringBuffer buffer3 = new StringBuffer("Buffer content");
        StringBuilder builder3 = new StringBuilder(buffer3.toString());
        System.out.println("3. Через toString(): " + builder3);
        
        // 3. Через append()
        StringBuilder builder4 = new StringBuilder("Builder");
        StringBuffer buffer4 = new StringBuffer();
        buffer4.append(builder4);
        System.out.println("4. Через append(): " + buffer4);
        
        StringBuffer buffer5 = new StringBuffer("Buffer");
        StringBuilder builder5 = new StringBuilder();
        builder5.append(buffer5);
        System.out.println("5. StringBuffer -> StringBuilder через append(): " + builder5);
        
        // 4. Работа с уже существующими объектами
        StringBuffer existingBuffer = new StringBuffer("Original Buffer");
        StringBuilder existingBuilder = new StringBuilder("Original Builder");
        
        // Можно добавить один в другой
        existingBuilder.append(existingBuffer);
        System.out.println("Builder + Buffer: " + existingBuilder);
        
        // И наоборот
        existingBuffer.append(existingBuilder);
        System.out.println("Buffer + Builder: " + existingBuffer);
    }
}
