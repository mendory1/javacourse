public class Calculator {    
    /**
     * Складывает два целых числа.
     * 
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Вычитает одно число из другого.
     * 
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Умножает два целых числа.
     * 
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Делит одно число на другое.
     * 
     * @param dividend делимое
     * @param divisor делитель
     * @return результат деления
     * @throws ArithmeticException если делитель равен нулю
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль"); // Проверка на ноль
        }
        return dividend / divisor;
    }
}
