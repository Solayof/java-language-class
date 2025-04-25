public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setContent(124);
        System.out.println(box.getContent());
    }
}
