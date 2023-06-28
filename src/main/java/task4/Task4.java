package task4;

public class Task4 {
    private final long a;
    private final int c;
    private final double m;
    private double seed;

    public Task4 seed(double seed) {
        this.seed = seed;
        return this;
    }

    public Task4(long a, int c, double m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public long next() {
        return (long) ((a * seed + c) % m);
    }
}
