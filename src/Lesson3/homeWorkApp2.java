package Lesson3;
        import java.util.Arrays;
        import java.util.Random;
        /**Выполнен**/
//      1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        /**Выполнен**/
//      2. Задать пустой целочисленный массив длиной 100.
//      С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        /**Выполнен**/
//      3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//      и числа меньшие 6 умножить на 2;

        /**Выполнен**/
//      4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//      и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//      если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//      индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        /**Выполнен**/
//      5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//      и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        /**Выполнен**/
//      6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

//      7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//      метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        **Примеры:
//        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.



public class homeWorkApp2 {
    public static Random random = new Random();

    public static void main (String[] args){

        System.out.println("Старт программы:");
        br();

        System.out.println("Задание №1:  ");
        int[] arr1 = new int[10];
        System.out.println("it was: ");
        printArrayInConsole(arrRandomFill(arr1, 2));
        System.out.println("Became: ");
        printArrayInConsole(replacement(arr1));
        br();

        System.out.println("Задание №2:  ");
        int[] arr2 = new int[100];
        printArrayInConsole(fiLLTheArray(arr2));
        br();

        System.out.println("Задание №3:  ");
        int[] arr3 = new int[30];
        System.out.println("it was: ");
        printArrayInConsole(arrRandomFill(arr3, 10));
        System.out.println("Became: ");
        printArrayInConsole(multiplyBy(arr3, 2, 6));
        br();

        System.out.println("Задание №4:  ");
        int [][] doubleArr4 = new int[10][10];
        printDoubleArrayConsole(diagonalFilling(doubleArr4));
        br();

        System.out.println("Задание №5:  ");
        printArrayInConsole(retLenArr(20, 2));
        br();

        System.out.println("Задание №6:  ");
        int [] arr5 = new int[25];
        printArrayInConsole(minMaxValueArr(arrRandomFill(arr5, 100)));
        br();

        System.out.println("Задание №7:  ");
        int []  arr6 = {1, 2, 3, 1, 2, 3};
        int []  arr7 = {2, 2, 2, 1, 1, 1};
        printArrayInConsole(arr6);
        System.out.println(checkBalance(arr6));
        printArrayInConsole(arr7);
        System.out.println(checkBalance(arr7));
        br();

        System.out.println("Конец программы...");
    }

    /**Метод сравнивает суммы левой и правой стороны массива...**/
    public static boolean checkBalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }


    /**Метод позволяет найти максимальное и менимальное значение массива**/
    public static int[] minMaxValueArr(int[] inputArr) {
        int[] a = inputArr.clone();
        int max = a[0];
        int min = a[0];
        Arrays.sort(a);
        for (int i = 0; i != a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);
        return inputArr;
    }


    /**Метод заполняет двухмерный массив по диаганали**/
    public static int[][] diagonalFilling(int[][] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (i == j) {
                    inputArray[i][j] = 1;
                }
            }
        }
        return inputArray;
    }

    /**Метод выводит в консоль двухмерный массив**/
    public static void printDoubleArrayConsole(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + "\t");
            }
            br();
        }
    }

    /**Метод заполняет рандомными числами в диапазоне от 0 до -value-**/
    public static int[] arrRandomFill(int[] inputArray, int value){
        for (int i = 0; i < inputArray.length; i++) {
        inputArray[i] = (int) (Math.random() * value);
        }
        return inputArray;
    }

    /**Метод ракирует бинарные числа**/
    public static int[] replacement(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = (inputArray[i] + 1) % 2;
        }
        return inputArray;
    }

    /**Метод позволяет вывести массив в консоль**/
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        br();
    }

   /**Метод для переноса строки просто бесит писать S.O.PLn постоянно**/
    public static void br(){
        System.out.println();
    }

    /**Метод заполняет индексы пустого массива простыми числами**/
    public static int[] fiLLTheArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = i + 1;
        }
        return inputArray;
    }

    /**Метод позволяет сравнить числа со зн. -comparisonValue- и меньшие умножить на -multiplyValue-**/
    public static int[] multiplyBy(int[] inputArray, int multiplyValue, int comparisonValue){
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] < comparisonValue){
                inputArray[i] *= multiplyValue;
            }
        }
        return inputArray;
    }

    /**Метод возвращающий одномерный массив типа -int- длиной -len-, каждая ячейка которого равна -initialValue-**/
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
