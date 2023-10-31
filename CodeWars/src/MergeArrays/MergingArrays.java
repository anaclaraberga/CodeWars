package MergeArrays;
import java.util.ArrayList;
import java.util.List;

public class MergingArrays {
  public static int[] mergeArrays(int[] first, int[] second) {
    int primeiroArray = first.length;
    System.out.println(primeiroArray);

    List<Integer> lista = new ArrayList<>();

    for (int i : first) {
      lista.add(i);
    }

    for (int i : second) {
      lista.add(i);
    }

    System.out.println(lista);

		return first;
	}
}
