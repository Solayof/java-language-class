public class ArrayMethod {
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }

    }

    static int[] getArray() {
        return new int[] {11, 82, 83, 24, 75};
    }
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       printArray(arr);
       printArray(new int[]{19, 26, 3, 14, 35});

       int[] arr2 = getArray();
       printArray(arr2);
    }
}
