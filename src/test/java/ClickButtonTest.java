import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClickButtonTest {

    Buton buttonsPage = new Buton();

    @BeforeAll
    public static void setup() {
        Configuration.browserSize = String.valueOf(true); // Tarayıcıyı tam ekran başlat
    }

    @Test
    public void clickButtonTest() {
        buttonsPage.openPage();
        buttonsPage.clickButtonsMenu();
        buttonsPage.clickClickMeButton();

        String expectedMessage = "You have done a dynamic click";
        assertEquals(expectedMessage, buttonsPage.getSuccessMessage(), "Success message should match");
    }
}