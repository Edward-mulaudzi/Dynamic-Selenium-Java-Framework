package project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.util.concurrent.TimeUnit;
public class BaseClass extends PageObjectsRepository {
    public static WebDriver driver;

    public void LaunchApplication() throws Exception {
        try{
            String browser = PropertyFileOperations.getPropertyValueByKey("browser");
            String window = PropertyFileOperations.getPropertyValueByKey("window");
            String url = PropertyFileOperations.getPropertyValueByKey("url");
            if(browser.equalsIgnoreCase("Chrome")) {
                ChromeOptions option = new ChromeOptions();
                option.addArguments("incognito");
                if(window.equalsIgnoreCase("private")){
                    driver = new ChromeDriver(option);
                }else
                    driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("edge")) {
                EdgeOptions option = new EdgeOptions();
                option.addArguments("InPrivate");
                if(window.equalsIgnoreCase("private")){
                    driver = new EdgeDriver(option);
                }else
                    driver = new EdgeDriver();
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);
        }catch (Exception e){
            System.out.println("Unable to Launch The Browser");
        }
        //initialization of state of class objects

    }
//    @After

}