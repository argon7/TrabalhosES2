import com.es2.multipleconditions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class TestWhiteBoxMultipleConditions {

    @AfterAll static void afterAll() {
        new End();
    }

    @Test void approved() {
        Assertions.assertTrue(CourseUtils.approved(new Marks(10,1,10)));
        Assertions.assertFalse(CourseUtils.approved(new Marks(0,0,0)));
    }

    @Test void assertConditionsToDrive() {
        Assertions.assertThrows(PersonCannotDriveException.class, ()->{
            DriveUtils.assertConditionsToDrive(new Person("Rui",1));
        });

        Assertions.assertDoesNotThrow(()->DriveUtils.assertConditionsToDrive(new Person("Rui",19)));
    }

    @Test void assertPersonGetName() {
        Assertions.assertEquals("Rui", new Person("Rui", 1).getName());
    }
}
