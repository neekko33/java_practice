public class BubbleSort {
  public static int[] sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = new int[] { 1, 3, 5, 2, 4, 6 };
    array = sort(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}