public class Hello {
    public static void main(String[] args) {
        String string = "Hello World!";
        String string2 = "Hello Solayof!";
        System.out.println(string);
        System.out.println(string.length());

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.toCharArray());
        System.out.println(string.charAt(0));
        System.out.println(string.indexOf("World"));
        System.out.println(string.lastIndexOf("World"));
        System.out.println(string.substring(1, 4));

        System.out.printf("welcome, %s%n", string);



    }
}
