package MergeArrays;
import java.util.ArrayList;
import java.util.List;

public class MergingArrays {
  public static int[] mergeArrays(int[] first, int[] second) {

    List<Integer> lista = new ArrayList<>();

    for (int i : first) {
      lista.add(i);
    }

    for (int i : second) {
      lista.add(i);
    }

    int firstLength = first.length;
    int secondLength = second.length;

    int[] merged = new int[firstLength + secondLength];

    int firstPosition, secondPosition, mergedPosition;

    firstPosition = secondPosition = mergedPosition = 0;

    while(firstPosition < firstLength && secondPosition < secondLength) {
      if(first[firstPosition] < second[secondPosition]) {
        merged[mergedPosition++] = first[firstPosition++];
      } else {
        merged[mergedPosition++] = second[secondPosition++];
      }
    }

    while(firstPosition < firstLength) {
      merged[mergedPosition++] = first[firstPosition++];
    }
    
    while(secondPosition < secondLength) {
      merged[mergedPosition++] = second[secondPosition++];
    }
    
    System.out.println(merged);

		return merged;
	}
}
