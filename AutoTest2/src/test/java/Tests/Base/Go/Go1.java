package Tests.Base.Go;

import Tests.Base.BaseTest;
import Tests.HelloyAndGoodBye.GoodByeSphere;
import Tests.HelloyAndGoodBye.HelloSphere;
import Tests.SearchForList.AdvancedSearchMainMenu;
import constants.Constant;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import static Tests.HelloyAndGoodBye.Screenshots.Screenshot;
import static common.CommonActions.createDriver;
import static page.Base.BasePage.open;


public class Go1 extends BaseTest {



//    protected static HelloSphere helloSphere = new HelloSphere(driver);
//    protected static GoodByeSphere goodByeSphere = new GoodByeSphere(driver);
//    protected static AdvancedSearchMainMenu advancedSearchMainMenu = new AdvancedSearchMainMenu(driver);


    @Test
    @DisplayName(("Тест №1 Вход"))
    public void oneTest () {
        open(Constant.Urls.HomePage);
            helloSphere.loginPassw();
    }

    @Test
    @DisplayName("Тест №2 проверка настроек")
    public void twoTest () {
            advancedSearchMainMenu.testMenuCategory();

    }

    @Test
    @DisplayName(("Тест №1 Выход"))
    public void lastTest () {
        try {
            goodByeSphere.goOut();
        }
        catch ( NullPointerException e) {
            e.printStackTrace();
        }
    }

}
//
//Assert.assertEquals(«Google», driver.getTitle());Assert.assertEquals(«Google», driver.getTitle());