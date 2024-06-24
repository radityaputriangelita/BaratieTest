package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAdminPage {

    private By usernameInput = new By.ByName("emailOrUsn");
    private By passwordInput = new By.ByName("password");
    private By submitBtn = new By.ByName("loginbtn");

    WebDriver driver;

    public LoginAdminPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void inputUsn(String query)
    {
        driver.findElement(usernameInput).sendKeys(query);
    }

    public void inputPass(String query)
    {
        driver.findElement(passwordInput).sendKeys(query);
    }

    public void click_login()
    {
        driver.findElement(submitBtn).submit();
    }

}
