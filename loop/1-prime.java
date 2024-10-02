public class Prime {
  public static void main(String[] args) {
    int i = 1, j;
    while (i <= 50) {
      j = 2;
      while (j < i ) {
        if ( i % j == 0) {
          break;
        }
        j++;
        //System.out.println("j = " +j);
      }
      //System.out.println("j = " +j);
      if (j == i && i != 1) {
        System.out.println(j);
      }
      i++;
    }
  }
}