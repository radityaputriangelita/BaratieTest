package stepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AboutPage;
import org.example.DashboardPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashboardSteps {

    WebDriver driver;

    @Given("user in dashboard page")
    public void user_in_dashboard_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8000/");
    }
    @When("page successfully load")
    public void page_successfully_load() {
        DashboardPage dashboardPage =new DashboardPage(driver);
        String urlnow = dashboardPage.getCurrentUrl();
        String expectedurl = "http://127.0.0.1:8000/";
        Assertions.assertEquals(expectedurl, urlnow);
        dashboardPage.changePageToAbout();
    }
    @Then("user directed to the aboutus page")
    public void user_directed_to_the_aboutus_page() {
        AboutPage resultPage = new AboutPage(driver);
        String expectedurl = "http://127.0.0.1:8000/aboutus";
        Assertions.assertEquals(expectedurl, resultPage.geturl());
        driver.quit();
    }
}
