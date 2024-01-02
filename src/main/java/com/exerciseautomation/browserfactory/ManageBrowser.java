package com.exerciseautomation.browserfactory;


import com.exerciseautomation.propertyreader.PropertyReader;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ManageBrowser {

    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    static int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));

    public ManageBrowser() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/propertiesfile/log4j2.properties");
    }

    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

            //ChromeOptions options = new ChromeOptions();
            //options.addArguments("load-extension=\"C:\\Users\\komal\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\"");
            //options.addArguments("load-extension=C:/Users/komal/AppData/Local/Google/Chrome/User Data/Default/Extensions/cfhdojbkjhnklbpkdaibdccddilifddb/3.21.1_0");
            //DesiredCapabilities capabilities = new DesiredCapabilities();
            //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            //options.setCapability(ChromeOptions.CAPABILITY, options);
            //options.addArguments("user-data-dir=C:/Users/komal/AppData/Local/Google/Chrome/User Data/");

            //driver = new ChromeDriver(capabilities);
            //driver = new ChromeDriver(options);




        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver!= null){
            driver.quit();
        }
    }
}
