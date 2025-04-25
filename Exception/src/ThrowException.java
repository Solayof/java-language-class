import java.io.IOException;

public class ThrowException {
    public static void func() throws IOException {
        throw new IOException("This is a test");
    }
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("can not divide by zero");
        }
        System.out.println(a / b);
    }
    public static void main(String[] args) throws IOException {
        divide(1, 2);
        divide(8, 4);

        func();
    }
}
