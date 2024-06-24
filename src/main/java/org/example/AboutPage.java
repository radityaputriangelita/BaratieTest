package org.example;

import org.openqa.selenium.WebDriver;

public class AboutPage {

    WebDriver driver;

    public AboutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String geturl()
    {
        return driver.getCurrentUrl();
    }
}
