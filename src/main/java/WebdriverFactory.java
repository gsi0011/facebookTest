import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebdriverFactory {

    private WebDriver driver = null;

    public WebdriverFactory() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    public void chooseBrowser(WebDriver browser){
        this.driver = browser;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
