package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Testing JetBrains Careers")
    void careersTest() {
        Selenide.confirm();
        step("Open 'https://www.jetbrains.com/careers/jobs/'", () -> {
            open("https://www.jetbrains.com/careers/jobs/");
        });
        step("Set role 'QA Engineer'", () -> {
            $$("._wt-select__label-wrapper_5tvmu8_75").findBy(text("Role")).click();
            $$("._wt-list-item__content_qhmb27_10").findBy(text("QA Engineer")).click();
        });
        step("Set location 'Remote'", () -> {
            $$("._wt-select__label-wrapper_5tvmu8_75").findBy(text("Location")).click(); //done
            $$("._wt-list-item__content_qhmb27_10").findBy(text("Remote")).click(); //done
        });
        step("Check search results 'QA Engineer'", () -> {
            $("#vacancies-list").$(".wt-h3").shouldHave(text("QA Engineer"));
        });
    }

    @Test
    @DisplayName("Testing plugin search")
    void pluginSearchTest() {
        Selenide.confirm();
        step("Open 'https://www.jetbrains.com/'", () -> {
            open("https://www.jetbrains.com/");
        });
        step("Select 'Developer Tools'", () -> {
            $$(".main-menu-item").findBy(text("Developer Tools")).click();
        });
        step("Select 'All Plugins'", () -> {
            $$(".main-submenu-item__title-part").findBy(text("All Plugins")).click();
        });
        step("Enter 'big data'", () -> {
            $("._wt-input__inner_qhzay_92").setValue("big data").pressEnter();
        });
        step("Check search results", () -> {
            $(byAttribute("data-testid", "plugin-card")).shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Testing solutions for QA and Test Automation")
    void solutionsSearchTest() {
        Selenide.confirm();
        step("Open 'https://www.jetbrains.com/'", () -> {
            open("https://www.jetbrains.com/");
        });
        step("Select 'Solutions'", () -> {
            $$(".main-menu-item").findBy(text("Solutions")).click();
        });
        step("Select 'Tools for QA and Test Automation'", () -> {
            $$(".main-submenu-item__title-part").findBy(text("Quality Assurance")).click();
        });
        step("Check results", () -> {
            $(".page__content").shouldHave(text("automated test"));
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        Selenide.confirm();
        step("Open url 'https://www.jetbrains.com/careers/jobs/'", () ->
            open("https://www.jetbrains.com/careers/jobs/"));
        step("Page title should have text 'Open Positions - JetBrains'", () -> {
            String expectedTitle = "Open Positions - JetBrains";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
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

