package sky.pro_lesson_2;

public class Task6 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public Task6(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public void start() {
        show();
    }

    private int result() {
        return a * (b + (c - d * e));
    }

    private int reversResult() {
        return -result();
    }

    private void show() {
        System.out.println(result());
        System.out.println(reversResult());
    }
}
