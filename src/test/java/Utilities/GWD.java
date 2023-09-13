package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {
    private static WebDriver driver;

    public static  WebDriver getDriver () {

        if (driver == null) {
            driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
            driver.manage().window().maximize(); // Ekranı max yapıyor.
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        }
        return driver;// 20 sn mühlet: elementi bulma mühleti
    }
  public static void quitDriver() {
      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      if (driver == null) {
          driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
          driver.quit();
          driver = null;
      }
  }
}