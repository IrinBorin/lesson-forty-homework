import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final String expectedLogin = "born";
    private final String expectedPassword = "1234";
    private final String expectedEmail = "irina@gmail.com";

    @Test
    public void getLogin_withProvidedValue_returnsIt() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
       String actualValue = user.getLogin();
       assertEquals (expectedLogin, actualValue);
    }

    @Test
    public void getPassword_withProvidedValue_returnsIt() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        String actualValue = user.getPassword();
        assertEquals (expectedPassword, actualValue);
    }
    @Test
    public void getPassword_withProvidedValue_doenstReturnIt() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        String actualValue = user.getPassword();
        assertNotEquals("gorn", actualValue);
    }
    @Test
    public void getPassword_withProvidedValue_true() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        String actualValue = user.getPassword();
        assertTrue (expectedPassword.equals(actualValue));
    }
    @Test
    public void getPassword_withProvidedValue_false() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        String actualValue = user.getPassword();
        assertFalse(!expectedPassword.equals(actualValue));
    }
    @Test
    public void getEmail() {
    }

    @Test
    public void setLogin_validLogin_success() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        final String validLogin = "ztr";
        user.setLogin(validLogin);
        String result = user.getLogin();
        assertEquals(validLogin, result);

    }
    @Test
    public void setLogin_invalidLogin_failure() {
        final User user = new User(expectedLogin, expectedPassword, expectedEmail);
        final String invalidLogin = "zt";
        //String result = user.getLogin();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            user.setLogin(invalidLogin);
        } );
        String isSaid = "Логин должен быть не менее 3 символов!";
        assertEquals (isSaid, exception.getMessage() );
    }
    @Test
    public void setLogin_(){

    }
    @Test
    public void setPassword() {
    }

    @Test
    public void setEmail() {
    }

    @Test
    public void isValidPassword() {
    }
}