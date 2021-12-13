package Tests.HelloyAndGoodBye;

import Tests.Base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Screenshots extends BaseTest {
    public Screenshots (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public static void Screenshot () throws  RuntimeException{
        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String newFileName = String.format(
                    "%s\\screenshots\\%s.png", System.getProperty("user.dir"), LocalDateTime.now().toString().replace(":", "-"));
            File destination = new File(newFileName);
            reportBad.add("Тест провал");

            try {
                FileUtils.copyFile(source, destination);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            driver.quit();
        }
        catch (NullPointerException e){
                e.printStackTrace();
            }
    }


}
