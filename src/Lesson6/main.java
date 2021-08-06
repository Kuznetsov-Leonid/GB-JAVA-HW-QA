package Lesson6;

public class main {
    public static void main(String[] args){
        String tempWinEvent = "Получилось";
        String tempLosEvent = "Не получилось";
        String eventName;
        String eventResult;

        cat cat1 = new cat("Батон", 200, 1,1);
        cat cat2 = new cat("Шаня", 500, 0,2);
        dog dog1 = new dog("Дархан", 300,5,2);
        dog dog2 = new dog("Роки",600,10,3);

        animal[] animals = {cat1, cat2, dog1, dog2};
        int jumpLength = 2;
        int swimLength = 9;
        int runLength = 300;

        for (int i = 0; i < animals.length; i++){
            String nameString = animals[i].getMaxDistanceJump() + " can ";
            eventName = "jump on " + animals[i].getMaxDistanceJump() + "m. Try jump on";
            eventResult = (animals[i].jump(jumpLength)) ? tempWinEvent : tempLosEvent;
            result(nameString, eventName, jumpLength, eventResult);

            eventName = "run on " + animals[i].getMaxDistanceRun() + "m. Try run on ";

            /**Я не совсем понимаю как работает следующая конструкция кода на 31 строчке
             * " : " работает как сравнение или просто выстраивает вариативность результата,
             * я не совсем пониамаю где в коде условие выполнения этой конструкции**/
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLosEvent;

            result(nameString, eventName, jumpLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "swim on " + animals[i].getMaxDistanceSwim() + "m. Try swimming on ";
            eventResult = (swimResult == animal.SWIM_ALLOWED) ? tempWinEvent : tempLosEvent;

            if (swimResult == animal.SWIM_NONE){
                eventResult = "cat cant swim";
                result(nameString, eventName, jumpLength, eventResult);
            }

            System.out.println("All animals " + animal.countAnimal + " > cat count = " + cat.countCat + " > dog cunt =  " + dog.countDog);

        }

    }
    private static void result(String nameAnimal, String event, int eventLength, String resultEvent){
        System.out.println(nameAnimal + event + event + "m and" + resultEvent);
    }
}