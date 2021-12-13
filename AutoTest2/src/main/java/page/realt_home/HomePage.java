package page.realt_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.Base.BasePage;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
