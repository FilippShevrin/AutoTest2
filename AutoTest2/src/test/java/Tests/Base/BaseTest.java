package Tests.Base;

import Tests.HelloyAndGoodBye.GoodByeSphere;
import Tests.HelloyAndGoodBye.HelloSphere;
import Tests.SearchForList.AdvancedSearchMainMenu;
import common.CommonActions;
import constants.Constant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import page.Base.BasePage;
import page.realt_home.HomePage;

import java.util.LinkedList;
import java.util.List;

import static Tests.HelloyAndGoodBye.Screenshots.Screenshot;
import static common.CommonActions.createDriver;
import static common.Config.Clear_cookies_and_storage;
import static common.Config.Hold_Browser_Open;
import static constants.Constant.TimeOutVarriable.Explicitt_Wait;
import static constants.Constant.TimeOutVarriable.SleepInMillis;
import static page.Base.BasePage.open;


public class BaseTest {
//    нести в себе общие методы для всех тест классов
    public static WebDriver driver = CommonActions.createDriver();
    protected static BasePage basePage = new BasePage(driver);
    protected static HomePage homePage = new HomePage(driver);
    protected static  HelloSphere helloSphere = new HelloSphere(driver);
    protected static AdvancedSearchMainMenu advancedSearchMainMenu = new AdvancedSearchMainMenu(driver);
    protected static GoodByeSphere goodByeSphere = new GoodByeSphere(driver);
    public static WebDriverWait wait;
    private static final Logger log = (Logger) LogManager.getRootLogger();
    public static List<String> reportGood = new LinkedList<String>();// временный вариант написания отчетов
    public static List<String> reportBad = new LinkedList<String>();


    public WebElement findElement(By xpath)  {
        try {
            wait = new WebDriverWait(driver, Explicitt_Wait, SleepInMillis);
            log.debug("Ищу элемент по локатору '{}'", xpath);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            ((JavascriptExecutor)driver).executeScript("arguments[0]['style']['backgroundColor']='darksalmon';", element);
            log.debug("Элемент по локатору '{}' найден.", xpath);
            return element;
        } catch (RuntimeException e){
            Screenshot();
            throw e;
        }
    }



    @AfterTest // после тестов закрывает
    public void clearCookiesAndLocalStarage() {
        if(Clear_cookies_and_storage){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear"); // очищаем историю где лазели
        }
    }
    @AfterSuite (alwaysRun = true)// драйвер освобождает ресурсы вконце
    public  void close () {
        if (Hold_Browser_Open) {
            driver.quit(); // освобождает ресурсы (close закрывает текущ вкладку)
        }
    }
}
