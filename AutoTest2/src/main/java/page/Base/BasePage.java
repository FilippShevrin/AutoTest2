package page.Base;

import common.CommonActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import static common.CommonActions.createDriver;
import static constants.Constant.TimeOutVarriable.Explicitt_Wait;

public class BasePage {
    //   общая логика для всех !

    public static WebDriverWait wait;
    protected static WebDriver driver;
    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {
    }

    public static void open(String url)  {
           driver.get(url);

    }

    public WebElement waitElementIsVisible (WebElement element) {
        new WebDriverWait(driver, Explicitt_Wait).until(ExpectedConditions.visibilityOf(element));
        return element;
    }




}
