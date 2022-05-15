package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Test JetBrains Careers")
    void generatedTest() {
        step("Open 'https://www.jetbrains.com/careers/jobs/'", () -> {
            open("https://www.jetbrains.com/careers/jobs/");
        });

       // step("Set role 'QA Engineer'", () -> {
      //      $("._wt-select__label-wrapper_5tvmu8_75").$(byText("Role")).click();
      //      $(byText("QA Engineer")).click();
     //   }); $("").sibling(1)

        step("Set location 'Remote'", () -> {
            $("._wt-select__label-wrapper_5tvmu8_75", 1).$(byText("Location")).$("._wt-list-item__content_qhmb27_10").$(byText("Remote"));
        }); //done

       // step("Check the search results 'QA Engineer'", () -> {
            //$("#vacancies-list").$("div", 2).shouldHave(text("QA Engineer"));
       // });
    }

    @Test //done
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

    @Test //done
    @DisplayName("Main page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.jetbrains.com/'", () ->
            open("https://www.jetbrains.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}

