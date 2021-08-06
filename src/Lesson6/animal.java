package Lesson6;

public class animal {
    private String name;
    private String type;
    private int maxDistanceRun;
    private int maxDistanceSwim;
    private int maxDistanceJump;
    public static int countAnimal = 0; //Счётчик кол-ва животных

    public animal(String name, String type, int maxDistanceRun, int maxDistanceSwim, int maxDistanceJump) {
        this.name = name;
        this.type = type;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxDistanceJump = maxDistanceJump;
        ++countAnimal; //При создании животного в конструкторе сраб. метод щётчика
    }

    static final int SWIM_FAIL = 0;
    static final int SWIM_ALLOWED = 1;
    static final int SWIM_NONE = -1;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxDistanceJump() {
        return maxDistanceJump;
    }

    public int getMaxDistanceRun() {
        return maxDistanceRun;
    }

    public int getMaxDistanceSwim() {
        return maxDistanceSwim;
    }
    protected boolean run(int distance){
        return (distance <= maxDistanceRun);
    }
    protected int swim(int distance){
        return (distance <= maxDistanceSwim) ? SWIM_ALLOWED : SWIM_FAIL;
    }
    protected boolean jump (float height){
        return (height <= maxDistanceJump);
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}

