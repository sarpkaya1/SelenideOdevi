import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddRecordTest {

    WebTablesPage webTablesPage = new WebTablesPage();

    @BeforeAll
    public static void setup() {
        Configuration.browserSize = true; // Tarayıcıyı tam ekran başlat
    }

    @Test
    public void addAndEditRecordTest() {
        webTablesPage.openPage();
        webTablesPage.clickAddButton();

        String firstName = "Melis";
        String lastName = "Doğan";
        String email = "m_dogan@example.com";
        String age = "30";
        String salary = "50000";
        String department = "IT";

        webTablesPage.fillForm(firstName, lastName, email, age, salary, department);

        webTablesPage.clickEditButton();
        String editedName = "Jane";
        webTablesPage.fillForm(editedName, lastName, email, age, salary, department);

        assertEquals(editedName, webTablesPage.getEditedFirstName(), "Edited first name should match");
    }
}