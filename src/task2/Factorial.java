package task2;

public class Factorial {

    int n;

    public long factorial (long n) {

            if (n == 0) {
                return 1;
            }

            if (n == 1) {
                return 1;
            }

            n = n * factorial(n - 1);

        return n;
    }
}
