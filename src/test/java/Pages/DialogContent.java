package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent {
    public DialogContent () {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN'")
    public WebElement loginButton;
    public void click(WebElement element){
//        bir butona tıklatacağın zaman hangi aşamalar lazım
//        wait clickable
//        scrollunu yap
//        click
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //scroll yap
        element.click();
    }

    public void sendKeys(WebElement element, String yazi){
//        bir textbox ın sağlıklı çalışması için hangi aşamalar lazım
//        visible olana kadar bekle
//        scrollunu yap
//        clear yap
//        yazıyı gönder

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        //scroll yap
        element.clear();
        element.sendKeys(yazi);

}}
