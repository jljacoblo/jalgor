package jacoblo.dataStructure;

import jacoblo.data.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TreeTest {
  @Test
  void test1(String[] args) {
  //Integer[] array = { 10, 4, 2, 1, 3, 6, 5, 8, 20, 18, 15, 19, 30, 25, 40 };
  Integer[] array = { 7, 9, 6, 1, 4, 2, 3, 40 };
  Node<Integer> result = Node.<Integer>convertFromArrayToBSTPreorder(array);
  ArrayList<Integer> resultPostArray = Node.<Integer>convertFromBSTtoArrayPostorder(new ArrayList<>(), result);
  System.out.println(resultPostArray);
}

  public static String printArray(ArrayList<Integer> array) {
    if (array == null || array.size() <= 0) return "NO";
    String s = "";
    for (int i : array) {
      s += i + " ";
    }
    return s;
  }
}
