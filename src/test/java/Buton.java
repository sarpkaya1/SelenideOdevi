import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class Buton {
    private SelenideElement buttonsMenu = $x("//span[text()='Buttons']");
    private SelenideElement clickMeButton = $x("//button[text()='Click Me']");
    private SelenideElement successMessage = $x("//p[@id='dynamicClickMessage']");

    public void openPage() {
        open("https://demoqa.com/elements");
    }

    public void clickButtonsMenu() {
        buttonsMenu.click();
    }

    public void clickClickMeButton() {
        clickMeButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}