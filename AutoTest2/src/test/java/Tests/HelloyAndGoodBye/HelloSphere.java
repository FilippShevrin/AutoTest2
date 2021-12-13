package Tests.HelloyAndGoodBye;

import Tests.Base.BaseTest;
import common.CommonActions;
import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static Tests.HelloyAndGoodBye.Screenshots.Screenshot;
import static constants.Constant.HelloSphere1.ForPassword;

public class HelloSphere extends BaseTest {
    public final WebDriver driver;
    public HelloSphere (WebDriver driver) {
            this.driver = driver;

}

    public void inputlogin(String login) {
        findElement(By.xpath(Constant.HelloSphere1.Forlogin)).sendKeys(login);
    }

    public void inputPassword(String password) {
        findElement(By.xpath(ForPassword)).sendKeys(password);
    }

    public void clickLogin() {
        findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/div/div/button")).click();
    }

    public void homePageMethod() {
        findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/ul/li[1]")).click();
    }


    public void loginPassw ()   {
        try {
            inputlogin(("Shevrin2"));
            inputPassword(("Qwerty2020"));
            clickLogin();
            reportBad.add("№1 тест выполнен");
            Thread.sleep(5000);
        }
        catch (RuntimeException e ) {
            Screenshot();
            reportBad.add("1 тест упал ");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

