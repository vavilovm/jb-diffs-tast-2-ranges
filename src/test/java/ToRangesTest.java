import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class ToRangesTest {
    @Test
    void testCase0() {
        int[] array = {};
        List<String> expected = Collections.emptyList();
        Assertions.assertEquals(expected, ToRanges.arrayToRanges(array));
    }


    @Test
    void testCase1() {
        int[] array = {0, 1, 5, 9};
        List<String> expected = Arrays.asList("0->1", "5", "9");
        Assertions.assertEquals(expected, ToRanges.arrayToRanges(array));
    }


    @Test
    void testCase2() {
        int[] array = {0, 1, 2, 3, 5, 6, 7, 9};
        List<String> expected = Arrays.asList("0->3", "5->7", "9");
        Assertions.assertEquals(expected, ToRanges.arrayToRanges(array));
    }

    @Test
    void testCase3() {
        int[] array = {1};
        List<String> expected = Collections.singletonList("1");
        Assertions.assertEquals(expected, ToRanges.arrayToRanges(array));
    }

    @Test
    void testCase4() {
        int[] array = {1, 2, 3, 4, 5};
        List<String> expected = Collections.singletonList("1->5");
        Assertions.assertEquals(expected, ToRanges.arrayToRanges(array));
    }
}