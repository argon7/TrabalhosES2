import com.es2.multipleconditions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class TestWhiteBoxMultipleConditions {

    @AfterAll
    static void afterAll() {
        new End();
    }

    @Test
    void approved() {
        Assertions.assertTrue(CourseUtils.approved(new Marks(10, 1, 10)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(10, 1, 0)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(10, 0, 10)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(10, 0, 0)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(0, 1, 10)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(0, 1, 0)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(0, 0, 10)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(0, 0, 0)));
    }

    @Test
    void assertConditionsToDrive() {

        Assertions.assertThrows(PersonCannotDriveException.class,
                () -> DriveUtils.assertConditionsToDrive(new Person("Joao", 1)));

        Assertions
                .assertDoesNotThrow(() -> DriveUtils.assertConditionsToDrive(new Person("Joao", 19)));

    }

    @Test
    void assertPersonGetName() {
        Assertions.assertEquals("Joao", new Person("Joao", 1).getName());
    }

    @Test
    void assertFindName() {
        ArrayList<String> arrayList =
                new ArrayList<>(Arrays.asList("Joao", "Joao0", "Joao1", "Joao2"));
        Assertions.assertTrue(ListUtils.findName(arrayList, "Joao") != -1);
        Assertions.assertEquals(ListUtils.findName(arrayList, "Name not in the array"), -1);

    }

    @Test
    public void testDriveNullPointer() {
        Assertions.assertThrows(PersonCannotDriveException.class, () -> DriveUtils.assertConditionsToDrive(null));
    }
}
