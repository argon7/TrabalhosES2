package com.es2.multipleconditions;

import java.util.ArrayList;

public class ListUtils {
    public static int findName(ArrayList<String> list, String name) {
        int i = 0;
        for (String myStr : list) {
            i++;
            if (name.equals(myStr))
                return i;
        }
        return -1;
    }
}
