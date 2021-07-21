package Lesson2;

//        1. Написать метод, принимающий на вход два целых числа и проверяющий,
//        что их сумма лежит в пределах от 10 до 20 (включительно),
//        если да – вернуть true, в противном случае – false.

//        2. Написать метод, которому в качестве параметра передается целое число,
//        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//        Замечание: ноль считаем положительным числом.

//        3. Написать метод, которому в качестве параметра передается целое число.
//        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

//        4. Написать метод, которому в качестве аргументов передается строка и число,
//        метод должен отпечатать в консоль указанную строку, указанное количество раз;

//        5. * Написать метод, который определяет, является ли год високосным,
//        и возвращает boolean (високосный - true, не високосный - false).
//        Каждый 4-й год является високосным, кроме каждого 100-го,
//        при этом каждый 400-й – високосный.

public class homeWorkApp1 {
    public static void main (String[] args){
        checking(2,10);
        checking(1,2);
        degrees(0);
        degrees(-10);
        positiveOrNegativeValue(10);
        positiveOrNegativeValue(-10);
        counter("name",3);
        highAxiality(2021);
        highAxiality(2020);
    }
    public static void checking(int a, int b){
        int result = a + b;
        if (result >= 10 && result <= 20){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void degrees(int value){
        if(value > -1){
            System.out.println("положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    //В этом методе я так понял, что должен был вызвать предыдущий метод
    //т.к. degrees уже умеет распознавать отр. и пол. числа, но у меня не получается это сделать так, \
    //чтобы это работало по человечески... Пришлось написать так...
    public static void positiveOrNegativeValue(int parameter){
        if(parameter > -1){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
    public static void counter(String word, int count){
        for (int i = 0; i < count ;i++){
            System.out.println(word);
        }
    }
    public static void highAxiality(int year){
        if ((year%4==0) && year % 100 !=0){
            System.out.println(true);
        }else if ((year % 4==0) && (year % 100==0) && (year % 400==0)){
                System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
