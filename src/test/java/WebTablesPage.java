import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage {
    private SelenideElement addButton = $("#addNewRecordButton");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement emailInput = $("#userEmail");
    private SelenideElement ageInput = $("#age");
    private SelenideElement salaryInput = $("#salary");
    private SelenideElement departmentInput = $("#department");
    private SelenideElement submitButton = $("#submit");
    private SelenideElement editButton = $("span[title='Edit']");
    private SelenideElement editedFirstName = $("div[role='row'] div:nth-child(1)");

    public void openPage() {
        open("https://demoqa.com/webtables");
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void fillForm(String firstName, String lastName, String email, String age, String salary, String department) {
        firstNameInput.setValue(firstName);
        lastNameInput.setValue(lastName);
        emailInput.setValue(email);
        ageInput.setValue(age);
        salaryInput.setValue(salary);
        departmentInput.setValue(department);
        submitButton.click();
    }

    public void clickEditButton() {
        editButton.click();
    }

    public String getEditedFirstName() {
        return editedFirstName.getText();
    }
}