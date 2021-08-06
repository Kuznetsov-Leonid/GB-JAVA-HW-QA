package Lesson6;

public class dog extends animal{
    private static final String animalType = "dog";
    public dog(String name, int maxDistanceRun, int maxDistanceSwim, int maxDistanceJump) {
        super(name, animalType, maxDistanceRun, maxDistanceSwim, maxDistanceJump);
        ++countDog;
    }

    public static String getAnimalType() {
        return animalType;
    }

    public static int countDog = 0;
}
