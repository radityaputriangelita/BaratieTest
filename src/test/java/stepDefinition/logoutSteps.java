package stepDefinition;

import org.example.DashboardAdminPage;
import org.example.LoginAdminPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class logoutSteps {
    WebDriver driver;

    @Given("admin is on the login page")
    public void admin_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/admin/index");
    }

    @When("admin enters username {string} and password {string}")
    public void admin_enters_username_and_password(String username, String password)
    {
        LoginAdminPage loginAdminPage = new LoginAdminPage(driver);
        loginAdminPage.inputUsn("admin");
        loginAdminPage.inputPass("rahasia123");
        loginAdminPage.click_login();
    }

    @Then("admin must be directed to the admin dashboard")
    public void admin_must_be_directed_to_the_admin_dashboard() {
        DashboardAdminPage dashboardAdminPage = new DashboardAdminPage(driver);
        dashboardAdminPage.geturl();
        String expectedurl = "http://127.0.0.1:8000/admin/sertificate";
        Assertions.assertEquals(expectedurl, driver.getCurrentUrl());
    }

    @Given("admin logged in as admin")
    public  void admin_logged_in_as_admin(){
        DashboardAdminPage dashboardAdminPage = new DashboardAdminPage(driver);
        dashboardAdminPage.geturl();
        String expectedurl = "http://127.0.0.1:8000/admin/sertificate";
        Assertions.assertEquals(expectedurl, driver.getCurrentUrl());
    }

    public void admin_click_the_logout_button{
        DashboardAdminPage dashboardAdminPage = new DashboardAdminPage(driver);
        dashboardAdminPage.logout();
    }

    @Then()
}
