package Lesson6;

public class cat extends animal {
    private static final String animalType = "cat";
    public cat(String name, int maxDistanceRun, int maxDistanceSwim, int maxDistanceJump) {
        super(name, animalType, maxDistanceRun, maxDistanceSwim, maxDistanceJump);
        ++countCat;
    }
    public static int countCat = 0;

    @Override
    protected int swim(int distance){
        return animal.SWIM_NONE;
    }

}
