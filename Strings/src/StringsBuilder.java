public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.append(" World!");
        sBuilder.insert(5, " solayof");

        System.out.println(sBuilder);
        sBuilder.delete(5, 11);
        String s = sBuilder.toString();
        System.out.println(s);
    }
}
