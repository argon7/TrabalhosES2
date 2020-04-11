package com.es2.multipleconditions;

public class CourseUtils {
    public static boolean approved(Marks record) {
        return record.getAttendance() > 0.66 && record.getWork() >= 10
            && record.getWrittenTest() >= 9.5;
    }
}
