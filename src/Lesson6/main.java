package Lesson6;

public class main {
    public static void main(String[] args){

        String tempWinEvent = " this can ";
        String tempLosEvent = " this can't ";
        String eventName;
        String eventResult;

        cat cat1 = new cat("Barsik", 0,200,2);
        cat cat2 = new cat("Baton", 2, 100, 1);
        dog dog1 = new dog("Darhan", 3, 400,1);
        dog dog2 = new dog("Kashtanka", 2, 10,1);
        horse horse1 = new horse("Gera", 20, 500, 1);
        horse horse2 = new horse("Sivka", 20,10,2);

        animal[] animals = {cat1,cat1,dog1, dog2, horse1, horse2};

        int jumpLength = 3;
        int runLength = 400;
        int swimLength = 10;

        for (int i = 0; i < animals.length; i++){
            String nameString = animals[i].getMaxJump() + " " + animals[i].getName() + " can ";

            eventName = "jump on " + animals[i].getMaxJump() + "m. Try jump on ";
            eventResult = (animals[i].jump(jumpLength)) ? tempWinEvent : tempLosEvent;
            result(nameString, eventName, jumpLength, eventResult);

            eventName = "run on " + animals[i].getMaxRun() + "m. Try run on ";
            eventResult = (animals[i].run(runLength)) ? tempWinEvent : tempLosEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = " swim on " + animals[i].getMaxSwim() + "m. Make try a swim on ";
            eventResult = (swimResult == animal.SWIM_OK) ? tempWinEvent : tempLosEvent;

            if(swimResult == animal.SWIM_NONE)
                eventResult = "this not make because cat cant swim ";
            result(nameString, eventName, swimLength, eventResult);
        }
    }
    private static void result(String nameAnimal, String event, float eventLength, String resultEvent){
        System.out.println(nameAnimal + event + eventLength + " " + resultEvent);
    }

}
