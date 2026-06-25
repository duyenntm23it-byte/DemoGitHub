
public class FibonacciImpl2 implements Fibonacci {
    @Override
    public long calculate(int n, boolean flag) {
        if (!flag) {
            return tinhFor(n);
        }
        return 0;
    }
    private long tinhFor(int n) {
        if (n <= 1) return n;
        long f0 = 0, f1 = 1, fn = 1;
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}