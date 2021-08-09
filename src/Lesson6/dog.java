package Lesson6;

public class dog extends animal{

    private static final String thisTypeAnimal = "dog";

    public static int countDog = 0;

    public dog(String name, int maxSwim, int maxRun, int maxJump) {
        super(thisTypeAnimal, name, maxSwim, maxRun, maxJump);
        ++countDog;
    }
}
