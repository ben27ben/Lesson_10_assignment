import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Exercise {
    private static WebDriver driver;
    private static NgWebDriver ngWebDriver;

    @BeforeClass
    public static void before(){
        driver.get("https://dgotlieb.github.io/Selenium/synchronization.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test(priority = 1)
    public void Exercise1(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("checkbox")).isDisplayed();
        driver.findElement(By.id("btn")).click();
        driver.findElement(By.id("message")).isDisplayed();
    }

    @Test(priority = 2)
    public void Exercise() throws InterruptedException {
        driver.findElement(By.id("hidden")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("div[style=' ']")).isDisplayed();
    }
    @Test(priority = 3)
    public void Exercisestill1(){
        driver.findElement(By.id("rendered")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
        String output = driver.findElement(By.id("finish2")).getText();
        Assert.assertEquals(output, "This is a new element");
    }
    @Test(priority = 4)
    public void Exercise2(){
        driver.get("https://dgotlieb.github.io/AngularJS/main.html");
        ngWebDriver.waitForAngularRequestsToFinish();
        WebElement firstname = driver.findElement(ByAngular.model("firstname"));
        firstname.clear();
        firstname.sendKeys("Ben");
        Assert.assertEquals(driver.findElement(By.xpath("//input")).getAttribute("value"), "Ben");
    }
    ///Exercise 3///
    //This sets the time to wait for a page to load completely before throwing an error//

    @Test(priority = 5)
    public void Exercise4(){
    driver.get("https://dgotlieb.github.io/WebCalculator");
        System.out.println(driver.findElement(By.id(Constants.seven)).getSize());
        System.out.println(driver.findElement(By.id("six")).isDisplayed());
        calculator.press4(4);
        calculator.pressplus();
        calculator.press2();
        calculator.pressEqual();
        String result = "6";
        Assert.assertEquals(result, calculator.pressResult());
    }

    @AfterClass
    public void after(){
        driver.quit();
    }

}

