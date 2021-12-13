package Tests.HelloyAndGoodBye;

import Tests.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static constants.Constant.GoodByeSphere1.*;

public class GoodByeSphere extends BaseTest {

    public GoodByeSphere (WebDriver driver) {
        this.driver = driver;
    }

//    public GoodByeSphere (WebDriver driver) {
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }
    //    ProfilePage
    //(Выход из сферы и проверка что мы на главной странице)
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */


    public void clickTrackingModeMethod() {
        findElement(By.xpath(clickTrackingModeMethod1)).click();
    }

    public void clickTrackingModeUserMethod() {
        findElement(By.xpath(clickTrackingModeUserMethod1)).click();
    }

    public void clickTrackingModeExitMethod() {
        findElement(By.xpath(clickTrackingModeExitMethod1)).click();
    }

    public void clickTrackingModeExitYesMethod() {
        findElement(By.xpath(clickTrackingModeExitYesMethod1)).click();
    }

    public void goOut()  {
        clickTrackingModeMethod();
        clickTrackingModeUserMethod();
        clickTrackingModeExitMethod();
        clickTrackingModeExitYesMethod();
    }


}
