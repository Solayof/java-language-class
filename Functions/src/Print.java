public class Print {
    static void printMessage() {
        System.out.println("Function called");
    }

    static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        int mul;
        mul = multiply(3, 4);
        System.out.println(mul);
    }
}
