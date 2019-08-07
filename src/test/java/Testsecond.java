import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsecond {

    @Test(priority = 1)

    public void Welcome() {
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\TR_Store_Latest\\MyTest\\src\\main\\resources\\chromedriver3.exe");
    }

    @Test(priority = 2)
    public void Driver() {
        //Instantiating driver object and launching browser
        WebDriver driver = new ChromeDriver();
        //Using get() method to open a webpage
        driver.get("http://indigo.com");


        //Closing the browser
        driver.close();

    }
}
