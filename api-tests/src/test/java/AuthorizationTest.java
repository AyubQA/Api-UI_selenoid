import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AuthorizationTest {

    @Test
    @DisplayName("Registration test")
    public void registrationTest() {
        FolderApi.executePostRequest(Urls.register, RandomData.BodyForRegistration, 201);
    }

    @Test
    @DisplayName("Login test")
    public void testLogin() {
        FolderApi.executePostRequest(Urls.loginURL, new User(Authorization.testUserLogin, Authorization.testUserPassword), 200);
    }
}
