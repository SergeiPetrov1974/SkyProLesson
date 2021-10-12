package sky.pro_lesson_2;

public class Task7 {
    private int boxA;
    private int boxB;

    public Task7(int boxA, int boxB) {
        this.boxA = boxA;
        this.boxB = boxB;
    }

    public void start() {
        changeValue();

    }

    private void changeValue() {
        boxB = boxA + boxB;
        boxA = boxB - boxA;
        boxB = boxB - boxA;
        System.out.println(boxA + " " + boxB);
    }
}
