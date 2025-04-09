public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle.printDetail();

        Shape square = new Square();
        square.draw();
        square.printDetail();
    }
}
