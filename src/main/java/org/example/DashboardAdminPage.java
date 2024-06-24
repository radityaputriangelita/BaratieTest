package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardAdminPage {

    private By logoutbtn = new By.ByName("logoutbtn");
    WebDriver driver;
    public DashboardAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public String geturl(){
        return driver.getCurrentUrl();
    }

    public void logout(){
        driver.findElement(logoutbtn).click();
    }
}
