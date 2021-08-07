package Lesson6;

public class horse extends animal{
    public static int countHorse = 0;
    private static final String thisTypeAnimal = "horse";

    public horse( String name, int maxSwim, int maxRun, int maxJump) {
        super(thisTypeAnimal , name, maxSwim, maxRun, maxJump);
        ++countHorse;
    }
}
