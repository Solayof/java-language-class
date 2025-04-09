public class StringsBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello,");
        sb.insert(6, "world ");
        sb.append("world");
        sb.delete(11, 15);
        sb.replace(4,7,"love");
        System.out.println(sb);

    }
}
