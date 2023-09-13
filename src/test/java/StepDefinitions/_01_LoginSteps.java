package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
      //  System.out.println("Site Acildi");
       GWD.getDriver().get("https://test.mersys.io/");

    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
       // System.out.println("User ve Pssword Girildi");
       // GWD.getDriver().findElement(By.id("username")).sendKeys("turkeyts");
        //GWD.getDriver().findElement(By.id("password")).sendKeys("TechnoStudy123");
     //   WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.visibilityOf(dc.username));
       // dc.username.sendKeys("turkeyts");
       // dc.password.sendKeys("TechnoStudy123");
      //  dc.loginButton.click();
        //        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(dc.username));
//
//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
        // dc.loginButton.click();

        dc.sendKeys(dc.username,"turkeyts");
        dc.sendKeys(dc.password,"TechnoStudy123");
        dc.click(dc.loginButton);

    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Girildigi test edildi");

    }
}
