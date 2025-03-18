public class Main {
    public static void main(String[] args) {
        int i = 10;
        switch (i) {
            case 10:
                System.out.println("Ten");
            break;
            case 20:
                System.out.println("Twenty");
            break;
            case 30:
                System.out.println("Thirty");
            break;

            default:
                System.out.println("Value not 10, 20 or 30");
        }
    }
}