package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    private By nav_about = new By.ById("aboutus-page");

    WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }



    public void changePageToAbout(){
        driver.findElement(nav_about).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
