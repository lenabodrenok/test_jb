package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Test JB")
    void generatedTest() {
        step("Open 'https://www.jetbrains.com/careers/jobs/'", () -> {
            step("// todo: just add selenium action");
        });

        step("Set role 'QA Engineer'", () -> {
            step("// todo: just add selenium action");
        });

        step("Set location 'Remote'", () -> {
            step("// todo: just add selenium action");
        });

        step("Check the search results 'QA Engineer'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.jetbrains.com/careers/jobs/'", () ->
            open("https://www.jetbrains.com/careers/jobs/"));

        step("Page title should have text 'Open Positions - JetBrains'", () -> {
            String expectedTitle = "Open Positions - JetBrains";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        //step("Open url '/careers/jobs/'", () ->
           // open("/careers/jobs/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}

