package common;

import constants.Constant;
import org.apache.logging.log4j.core.util.Assert;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.Base.BasePage;

import java.util.concurrent.TimeUnit;

import static common.Config.Platform_And_Browser;
import static common.Config.driverNow;
import static constants.Constant.TimeOutVarriable.*;

// логика драйвера
public class CommonActions {
    public static  WebDriver createDriver(){
        WebDriver driver = null;
            switch (Platform_And_Browser) {
                case ("win_chrome"):
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.04.exe");
                    driver = new ChromeDriver();
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("excludeSwiches", new String[]{"enable-automation"});// убираем надпись что работает машина
                    //определение пути до драйвера и его настройка
                    break;
                case ("ubunty_chrome"):
                    System.setProperty("webdriver.chrome.driver", driverNow);
                    driver = new ChromeDriver();
                    ChromeOptions options1 = new ChromeOptions();
                    options1.setExperimentalOption("excludeSwiches", new String[]{"enable-automation"});
                    break;
                default:
//                Assert.fail("Не корректная работа браузера: " + Platform_And_Browser );
//                ошибка не подтягивает org.testing.assert;

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Implocitt_wait, TimeUnit.SECONDS);

        return driver;
    }
}
