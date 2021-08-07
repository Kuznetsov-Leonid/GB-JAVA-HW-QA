package Lesson6;

public class animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private int maxSwim;
    private int maxRun;
    private int maxJump;

    public static int countAnimal = 0;


    public animal(String type, String name, int maxSwim, int maxRun, int maxJump) {
        this.type = type;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
        ++countAnimal;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    protected boolean run(int distance){ return (distance <= maxRun); }

    protected boolean jump(int height){
        return (height <= maxJump);
    }

    protected int swim(int distance){
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL; //Не совсем пониамаю что означает эта конструкция,
    }                                                       //сравнение или операция?
}
