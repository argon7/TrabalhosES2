import com.decorator.Auth;
import com.decorator.AuthException;
import com.decorator.CommonWordsValidator;
import com.decorator.End;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDecorator {
    @AfterAll
    static void tearDown() {
        new End();
    }

    @Test
    public void auth_UsernameRightAndPasswordRight_NoException() {
        Auth auth = new Auth();
        assertDoesNotThrow(() -> auth.auth("admin", "admin"));
    }

    @Test
    public void auth_UsernameRightAndPasswordWrong_ThrowsException() {
        Auth auth = new Auth();
        assertThrows(AuthException.class, () -> auth.auth("admin", "falso"));
    }

    @Test
    public void auth_UsernameWrongAndPasswordRight_ThrowsException() {
        Auth auth = new Auth();
        assertThrows(AuthException.class, () -> auth.auth("falso", "admin"));
    }

    @Test
    public void auth_UsernameWrongAndPasswordWrong_ThrowsException() {
        Auth auth = new Auth();
        assertThrows(AuthException.class, () -> auth.auth("falso", "falso"));
    }

    @Test
    public void auth_ValidCommonWord_NoException() {
        CommonWordsValidator commonWordsValidator = new CommonWordsValidator(new Auth());
        assertDoesNotThrow(() -> commonWordsValidator.auth("admin", "admin"));
    }

    @Test
    public void auth_InvalidCommonWord_ThrowsException() {
        CommonWordsValidator commonWordsValidator = new CommonWordsValidator(new Auth());
        assertThrows(AuthException.class, () -> commonWordsValidator.auth("admin", "NO PASSWORD"));
    }
}
