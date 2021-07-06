import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton_class {
    private static WebDriver driver;
    public static WebDriver getDriverInstance(){
        if(driver == null){
            driver = new ChromeDriver();
        }

        return driver;
    }
}
