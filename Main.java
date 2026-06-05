// long -> int
long big = 12345678901L;
int small = (int) big; // потеря старших битов

// double -> int
double pi = 3.14159;
int intPi = (int) pi;  // 3, дробная часть отброшена

// int -> byte (выход за пределы диапазона -128..127)
int value = 300;
byte b = (byte) value; // 44 (300 - 256 = 44)

// char -> byte (потеря данных)
char ch = '\u03C0';    // символ 'π', код 960
byte b2 = (byte) ch;   // старший байт отброшен

// float -> short
float f = 1000.99f;
short s = (short) f;   // 1000, дробная часть потеряна
