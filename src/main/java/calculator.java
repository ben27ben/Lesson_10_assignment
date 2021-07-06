import org.openqa.selenium.By;

public class calculator {
    public static void press2() {
        Singleton_class.getDriverInstance().findElement(By.id("two")).click();
    }
    public static void press4(int number) {
        Singleton_class.getDriverInstance().findElement(By.id("four")).click();
    }
    public static void pressplus() {
        Singleton_class.getDriverInstance().findElement(By.id("add")).click();
    }
    public static void pressEqual() {
        Singleton_class.getDriverInstance().findElement(By.id("equal")).click();
    }
    public static String pressResult() {
      return Singleton_class.getDriverInstance().findElement(By.id("screen")).getText();
    }
}
