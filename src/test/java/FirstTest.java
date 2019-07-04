import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    static WebdriverFactory factory = new WebdriverFactory();

    @BeforeClass
    public static void setupBrowser (){
        factory.chooseBrowser(new ChromeDriver());
    }

    @Test
    public void firstTest(){
        factory.getDriver().navigate().to("https://www.facebook.com/");
        factory.getDriver().findElement(By.id("email")).sendKeys("jdfxkjhbjkfdbk");
        factory.getDriver().findElement(By.id("pass")).sendKeys("jhgfdsjgjhvfhvbjh");
        factory.getDriver().findElement(By.id("u_0_2")).click();
        factory.getDriver().quit();
    }
}
