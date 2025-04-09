import java.util.regex.*;
public class Usescase {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = p.matcher("HelloWorld");

        boolean matches = matcher.matches();
        System.out.println(matches);
        Pattern p1 = Pattern.compile("[0-9]{10}");
        Matcher matcher1 = p1.matcher("1234567890");
        System.out.println(matcher1.matches());
    }
}
