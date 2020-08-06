import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HerokuAppTest {
    WebDriver browser;

    @Test
    public void sss (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        /*ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        browser = new ChromeDriver(options);*/
        browser = new ChromeDriver();
        browser.manage().window().maximize(); // !!!!!!!!!!!!!!!!!!!
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // !!!!!!!!!!!!
        browser.manage().window().setSize(new Dimension(122,232));
        browser.quit();




    }
}
