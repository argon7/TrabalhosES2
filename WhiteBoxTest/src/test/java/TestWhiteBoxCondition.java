import com.whiteboxconditions.End;
import com.whiteboxconditions.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class TestWhiteBoxCondition {

    @Test
    void testEvaluateScoreTemperature() {
        Rating rat = new Rating();
        Assertions.assertEquals(rat.evaluateScoreTemperature(11, 36), "It's hot out, and so am I");
    }

    @Test
    void testEvaluateScoreTemperature2() {
        Rating rat = new Rating();
        Assertions.assertEquals(rat.evaluateScoreTemperature(4, 19), "I'm in a bad mood");
    }

    @Test
    void testEvaluateScoreTemperature3() {
        Rating rat = new Rating();
        Assertions.assertEquals(rat.evaluateScoreTemperature(6, 21), "I'm balanced");
    }

    @Test
    void testEvaluateIfCouldBeAcceptedAtDisco() {
        Rating rat = new Rating();
        Assertions.assertEquals(rat.evaluateIfCouldBeAcceptedAtDisco(8, 5), "Accepted");
    }

    @Test
    void testEvaluateIfCouldBeAcceptedAtDisco2() {
        Rating rat = new Rating();
        Assertions.assertEquals(rat.evaluateIfCouldBeAcceptedAtDisco(1, 1), "Not Accepted");
    }

    @AfterAll
    static void afterAll() {
        new End();
    }
}