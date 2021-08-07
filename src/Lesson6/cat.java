package Lesson6;

public class cat extends animal{

    private static final String thisTypeAnimal = "cat";

    public static int countDog = 0;

    public cat(String name, int maxSwim, int maxRun, int maxJump) {
        super(thisTypeAnimal, name, maxSwim, maxRun, maxJump);
        ++countDog;
    }
    @Override
    protected int swim(int distance) {
        return super.swim(distance);
    }
}
