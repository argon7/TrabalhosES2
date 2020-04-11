package com.es2.multipleconditions;

public class DriveUtils {
    public static void assertConditionsToDrive(Person p) throws PersonCannotDriveException {
        if (p == null){
            throw new PersonCannotDriveException();

        }
        if (p.getAge() < 18) {
            throw new PersonCannotDriveException();
        }
    }
}
