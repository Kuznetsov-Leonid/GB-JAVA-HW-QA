package Lesson1;
//        Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
//        Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//        _Orange
//        _ Banana
//        _ Apple

//        Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
//        Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//        то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
//
//        Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//        Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//        если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//        если больше 100 (100 исключительно) - “Зеленый”;
//
//        Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
//        и инициализируйте их любыми значениями, которыми захотите.
//        Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
//
//        Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
//        Создать pull ссылку на работу
public class homeWorkApp {
    public static void main(String[] args){
        printTreeWords();
        checkSumSing();
        printColor();
        compereNumbers();
    }
    public static void printTreeWords(){
        String i = "Ornge\nBanan\nApple";
        System.out.println(i);
    }
    public static void checkSumSing(){
        int a = 5;
        int b = 6;
        int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 300;
        if (value <= 100) {
            System.out.println("Red");
        } else if (value <= 200){
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    public static void compereNumbers(){
        int a = 1;
        int b = 1;
        if (a >= b){
            System.out.println("a >= 1");
        } else {
            System.out.println("a < b");
        }
    }
}
