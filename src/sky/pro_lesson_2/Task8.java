package sky.pro_lesson_2;

public class Task8 {
    private int n;

    public Task8(int n) {
        this.n = n;
    }

    public void start() {
        System.out.println(mean());
    }

    private int mean() {
        return (n % 100 - n % 10) / 10;
    }
}
