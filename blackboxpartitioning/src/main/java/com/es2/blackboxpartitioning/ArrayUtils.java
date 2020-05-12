package com.es2.blackboxpartitioning;

public class ArrayUtils {
    public static int findMin(int[] list) {
        if (list == null || list.length <= 0)
            throw new AssertionError("failed precondition");
        int indexOfMin = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[indexOfMin])
                indexOfMin = i;
        }
        return indexOfMin;
    }

    public static void badResize(int[] list, int newSize) {
        if (list == null || newSize < 0)
            throw new AssertionError("failed precondition");
        int[] temp = new int[newSize];
        int limit = Math.min(list.length, newSize);
        System.arraycopy(list, 0, temp, 0, limit);
        list = temp;
    }

    public static int[] goodResize(int[] list, int newSize) {
        if (list == null || newSize < 0)
            throw new AssertionError("failed precondition");
        int[] result = new int[newSize];
        int limit = Math.min(list.length, newSize);
        System.arraycopy(list, 0, result, 0, limit);
        return result;
    }

    public static void findAndPrintPairs(int[] list, int target) {
        if (list == null || target <= 0)
            throw new AssertionError("failed precondition");
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] + list[j] == target)
                    System.out.println("The two elements at indices " + i + " and " + j + " are " + list[i] + " and " + list[j] + " add up to " + target);
            }
        }
    }

    public static void bubblesort(int[] list) {
        if (list == null)
            throw new AssertionError("failed precondition");
        boolean changed = true;
        for (int i = 0; i < list.length && changed; i++) {
            changed = false;
            for (int j = 0; j < list.length - i - 1; j++) {
                assert j + 1 < list.length : "loop counter j " + j + "is out of bounds.";
                if (list[j] > list[j + 1]) {
                    changed = true;
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        if (!isAscending(list))
            throw new AssertionError();
    }

    public static void showList(int[] list) {
        for (int value : list)
            System.out.print("" + value + " ");
    }

    public static boolean isAscending(int[] list) {
        boolean ascending = true;
        int index = 1;
        while (ascending && index < list.length) {
            assert index >= 0;
            ascending = (list[index - 1] <= list[index]);
            index++;
        }
        return ascending;
    }
}

