public class Overload {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int result = add(a, b);
        System.out.println(result);

    }
}
