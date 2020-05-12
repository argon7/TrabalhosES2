import com.es2.blackboxpartitioning.ArrayUtils;
import com.es2.blackboxpartitioning.End;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestBlackBoxPartitioning {
    @AfterAll
    static void afterAll() {
        new End();
    }

    @Test
    void findMin() {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Assertions.assertEquals(0, ArrayUtils.findMin(list));
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.findMin(null));
        int[] list2 = new int[0];
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.findMin(list2));
    }

    @Test
    void goodResize() {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Assertions.assertEquals(1, (ArrayUtils.goodResize(list, 1)).length);
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.goodResize(list, -3));
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.goodResize(null, 1));
    }

    @Test
    void bubbleSort() {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayUtils.bubblesort(list);
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.bubblesort(null));
    }

    @Test
    void isAscending() {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayUtils.isAscending(list);
        Assertions.assertThrows(AssertionError.class, () -> ArrayUtils.bubblesort(null));
    }
}
