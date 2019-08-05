import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Welcome {

    public static void main(String[] args) {


        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\TR_Store_Latest\\MyTest\\src\\main\\resources\\chromedriver3.exe");

        //Instantiating driver object and launching browser
        WebDriver driver=new ChromeDriver();

        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
      

        //Closing the browser


    }
}
