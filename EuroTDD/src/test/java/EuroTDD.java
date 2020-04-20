import com.End;
import com.Euro;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EuroTDD {
    @AfterAll
    static void afterAll() {
        new End();
    }

    @Test
    void testEuroObjectCreation() {
        new Euro(100.0D);
    }

    @Test
    void testEuroToString() {
        Euro twoEuros = new Euro(2.0D);
        Assertions.assertEquals("EUR 2.00", twoEuros.toString());
        twoEuros = new Euro(2.5D);
        Assertions.assertEquals("EUR 2.50", twoEuros.toString());
    }

    @Test
    void testEuroEquality() {
        Euro twoEuros = new Euro(2.0D);
        Euro twoEuros2 = new Euro(2.0D);
        Assertions.assertEquals(twoEuros, twoEuros2);
    }

    @Test
    void testEuroInequality() {
        Euro twoEuros = new Euro(3.0D);
        Euro sixEuros = new Euro(6.0D);
        Assertions.assertNotEquals(twoEuros, sixEuros);
    }

    @Test
    void testEuroEqualsDifferentObject() {
        Euro twoEuros = new Euro(200.0D);
        Double twoEuros2 = Double.valueOf(200.0D);
        Assertions.assertNotEquals(twoEuros, twoEuros2);
    }

    @Test
    void testSubtraction() {
        Euro twoEuros = new Euro(2.0D);
        Euro oneEuro = new Euro(1.0D);
        System.out.print(twoEuros.minus(oneEuro));
        Assertions.assertEquals(new Euro(100.0D), twoEuros.minus(oneEuro));
    }
}