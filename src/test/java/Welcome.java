import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Welcome {

   @Test

public void Welcome(){
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\TR_Store_Latest\\MyTest\\src\\main\\resources\\chromedriver3.exe");

        //Instantiating driver object and launching browser
        WebDriver driver=new ChromeDriver();

        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
        System.out.println("Welcome to selenium");

        //Closing the browser
        driver.close();

    }
}
