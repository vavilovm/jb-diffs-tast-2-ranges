import java.util.ArrayList;
import java.util.List;

public class ToRanges {
    public static List<String> arrayToRanges(int[] array) {
        List<String> resultList = new ArrayList<>();

        for (int rightBorder = 0; rightBorder < array.length; rightBorder++) {
            int leftBorder = rightBorder;

            // move right border as far as possible
            while (rightBorder + 1 < array.length && array[rightBorder] + 1 == array[rightBorder + 1]) {
                rightBorder++;
            }

            // build resulting string
            StringBuilder rangeAsString = new StringBuilder();
            rangeAsString.append(array[leftBorder]);

            if (leftBorder < rightBorder) {
                rangeAsString.append("->");
                rangeAsString.append(array[rightBorder]);
            }

            resultList.add(rangeAsString.toString());
        }

        return resultList;
    }
}
