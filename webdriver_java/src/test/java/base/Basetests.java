package base;

import org.openqa.selenium.chrome;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetests {
 private WebDriver driver;
 public Void setUp()
    {
     System.setProperty("webdriver.chrome.driver",resources/chromedriver.exe);
     driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");
     System.out.println(driver.getTitle());
     //driver.quit();



    }

    public static void main (String args[])
    {
        Basetests test= new Basetests();
        test.setUp();



    }

}
