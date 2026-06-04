byte b = 10;
short s = 20;
int i = 5;
long l = 100L;
float f = 2.5f;
double d = 1.0;
char c = 'A';

// byte + short -> int
int res1 = b + s;    // тип int

// int + long -> long
long res2 = i + l;   // тип long

// long + float -> float
float res3 = l + f;  // тип float

// float + double -> double
double res4 = f + d; // тип double

// char + int -> int
int res5 = c + i;    // тип int
// результат операции имеет тип, который является «наибольшим» среди типов операндов согласно цепочке: byte -> short -> int -> long -> float -> double.
// byte, short, char перед операцией расширяются до int.
