package lesson01;//int 4 bite
//byte 1 bite -128 127
//short 2 bite -32768 32767
//char 2 bite 2^32
//long 8 bite 2^64
//boolean bool
//float
//double > float
// Added F/L which string type
//Stack memory(cache) and Heap memory(global and only one)
//Конкатинация это когда к строке прибавляется число ввиде строки

//public private default-(Внутри данного пакета если не пишем никакой тип) protected

//статические переменные перезаписываются
//Статический метод вызываются через класс а не через объекты классы

public class Main {
    public static void main(String[] args) {
        int number = -1120;
        System.out.println(number);
        String str = "123";
        System.out.println(str);
        int test = Integer.parseInt(str);
        System.out.println(test + 12);
        int number1=2;
        int number2=3;
        System.out.println(sum(number1,number2));
    }

    public static int sum(int a, int b){
        return a+b;
    }
}