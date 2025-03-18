public class Multidimensional {
    public static void main(String[] args) {
        int[][] a = {{51, 12, 33}, {74, 55, 16}, {7, 8, 9}};
        int[] b = new int[] {51, 12, 33};
        int[] copyinto = new int[b.length];
        System.arraycopy(b, 0, copyinto, 0, b.length);
        for (int j : copyinto) {
            System.out.println(j);
        }
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
