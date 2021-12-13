package Tests.SearchForList;

import Tests.Base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static constants.Constant.AdvancedSearchMainMenu1.*;


public class AdvancedSearchMainMenu extends BaseTest {

    public AdvancedSearchMainMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


//    public String getUserName() { WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'account__name_hasAccentLetter')]")));
//        String userName = userMenu.getText(); return userName; }

    private static Logger log = (Logger) LogManager.getRootLogger();


    //  С главного меню в Расширенный поиск
    public void MainMenuTabMethod() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findElement(By.xpath("//*/li[@title=\"Расширенный поиск\"]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  Область Категорий

// Расширенный поиск Категории Криминал кнопка
    public void сategotyTrackingModeCriminalsOffMethod() {
        findElement(By.xpath(сategotyTrackingModeCriminalsOffMethod1)).click();
    }
    // Расширенный поиск Категории  болельщики кнопка
    public void сategotyTrackingModeFansOffMethod() {
        findElement(By.xpath(сategotyTrackingModeFansOffMethod1)).click();
    }
    // Расширенный поиск Категории разработка кнопка
    public void сategotyTrackingModeDevelopmentOffMethod() {
        findElement(By.xpath(сategotyTrackingModeDevelopmentOffMethod1)).click();
    }
    // Расширенный поиск Категории Vip кнопка
    public void сategotyTrackingModeVipOffMethod() {
        findElement(By.xpath(сategotyTrackingModeVipOffMethod1)).click();
    }
    // Расширенный поиск Категории административщики кнопка
    public void сategotyTrackingModeAdministrativeViolationsOffMethod() {
        findElement(By.xpath(сategotyTrackingModeAdministrativeViolationsOffMethod1)).click();
    }
    // Расширенный поиск Категории мероприятия кнопка
    public void сategotyTrackingModeActivityOffMethod() {
        findElement(By.xpath(сategotyTrackingModeActivityOffMethod1)).click();
    }

    // Временная область
    //За час
    public void сategotyTrackingInAnHourMethod() {
        findElement(By.xpath(сategotyTrackingInAnHourMethod1)).click();
    }

    //За сегодня
    public void сategotyTrackingForTodayMethod() {
        findElement(By.xpath(сategotyTrackingForTodayMethod1)).click();
    }

    //За сутки
    public void сategotyTrackingPerDayMethod() {
        findElement(By.xpath(сategotyTrackingPerDayMethod1)).click();
    }

    // За неделю
    public void сategotyTrackingDuringTheWeekMethod() {
        findElement(By.xpath(сategotyTrackingDuringTheWeekMethod1)).click();
    }

    // За месяц
    public void сategotyTrackingPerMonthMethod() {
        findElement(By.xpath(сategotyTrackingPerMonthMethod1)).click();
    }

    // За год
    public void сategotyTrackingInAYearMethod() {
        findElement(By.xpath(сategotyTrackingInAYearMethod1)).click();
    }

    // Область реагирования

    // вижу
    public void сategotyTrackingSeeMethod() {
        findElement(By.xpath(сategotyTrackingSeeMethod1)).click();
    }

    // Потерял
    public void сategotyTrackingLostMethod() {
        findElement(By.xpath(сategotyTrackingLostMethod1)).click();
    }

    // Пропустил
    public void сategotyTrackingMissedMethod() {
        findElement(By.xpath(сategotyTrackingMissedMethod1)).click();
    }

    // Взял
    public void сategotyTrackingTookMethod() {
        findElement(By.xpath(сategotyTrackingTookMethod1)).click();
    }

    // Задержан
    public void сategotyTrackingDetainedMethod() {
        findElement(By.xpath(сategotyTrackingDetainedMethod1)).click();
    }

    // Иное лицо
    public void сategotyTrackingAnotherPersonMethod() {
        findElement(By.xpath(сategotyTrackingAnotherPersonMethod1)).click();
    }

    // Без статуса
    public void сategotyTrackingWithoutStatusMethod() {
        findElement(By.xpath(сategotyTrackingWithoutStatusMethod1)).click();
    }

    // Среди последних (AmongTheLatter)
    public void сategotyTrackingAmongTheLatterMethod() {
        findElement(By.xpath(сategotyTrackingAmongTheLatterMethod1)).click();
    }

    // Область поиск по полям (4 поля)
    // нажимаем на 1 поле для выбора из перечня SearchByFields
    public void сategotyTrackingSearchByFieldsMethod() {
        findElement(By.xpath(сategotyTrackingSearchByFieldsMethod1)).click();
    }

    // по дате прохода
    public void сategotyTrackingByDateOfPassageMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingByDateOfPassageMethod1)).click();
    }

    //    по времени прохода

    public void сategotyTrackingTimesMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingTimesMethod1)).click();
    }
//and contains(text(), 'Next')
    //    по индетификатору
    public void сategotyTrackingIdentifierMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingIdentifierMethod1)).click();
    }

    //    Выбор фамилии

    public void сategotyTrackingSurnameTestMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingSurnameTestMethod1)).click();
    }

    // выбор по имени
    public void сategotyTrackingNameMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingNameMethod1)).click();
    }

    // выбор по отчеству
    public void сategotyTrackingMiddleNameMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingMiddleNameMethod1)).click();
    }

    // выбор по дате рождения
    public void сategotyTrackingDateOfBirthMethod() {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingDateOfBirthMethod1)).click();
    }

    // ввод по цифр
    public void сategotyTrackingIntMethod1 (String Name) {
        сategotyTrackingSearchByFieldsMethod();
        findElement(By.xpath(сategotyTrackingIntAndStringMethod)).sendKeys(Name);
    }

    // ввод Строка
    public void сategotyTrackingStringMethod1(String surname) {
        // выбор фамилии в перечне и проверка что выбралась фамилия
        findElement(By.xpath(сategotyTrackingIntAndStringMethod)).sendKeys(surname);
    }

    // Поиск
    public void сategotyTrackingSeachMethod() {
        findElement(By.xpath(сategotyTrackingSeachMethod1)).click();
    }


// Методы

    public void testMenuCategory() {//Тест на проверку Категорий
        try {
            MainMenuTabMethod();
            сategotyTrackingModeCriminalsOffMethod();
            сategotyTrackingModeFansOffMethod();
            сategotyTrackingModeDevelopmentOffMethod();
            сategotyTrackingModeVipOffMethod();
            сategotyTrackingModeAdministrativeViolationsOffMethod();
            сategotyTrackingModeActivityOffMethod();
            reportGood.add("2 тест выполнен");
        } catch (RuntimeException e) {
            e.printStackTrace();

            reportBad.add("2 тест упал ");
            e.printStackTrace();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException r) {
                r.printStackTrace();
                reportBad.add("2 тест упал ");
            }
        }
    }

    // Тест по фамилии
    public void testSurname() {
        MainMenuTabMethod();// открываем расширенный поиск
        сategotyTrackingPerMonthMethod();// выбираем за месяц
        сategotyTrackingSearchByFieldsMethod();// выбираем нажимаем на перечень в поиске по полям

        сategotyTrackingStringMethod1("ЯКИМОВА"); // выбираем Фамилию в поиске по поля вводим данные фимилии чел. котор. ищем

        сategotyTrackingSeachMethod();
        try {
            Thread.sleep(5000);
            String warb = String.valueOf(driver.getClass());
            Assert.assertEquals("Список проходов", warb);
//            setSearchField("ЯКИМОВА");
        } catch (InterruptedException e) {
            e.printStackTrace();
            reportGood.add("Якимова найдена и добавлена");
        } catch (RuntimeException e) {
            e.printStackTrace();
            reportBad.add("4 тест упал ");
            reportBad.add("ЯКИМОВА не найдена ");
            e.printStackTrace();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException r) {
                r.printStackTrace();
                reportBad.add("4 тест упал ");
            }
        }

    }
}


// @Test
//    void testYandexSearch() {
//        StartPage startPage = new StartPage();
//
//        startPage.open();
//        startPage.checkMenuItemsPresent(Arrays.asList(Service.values()));
//        startPage.setSearchField("porsche 356B 1:18 model");
//        startPage.clickSearchButton();
//
//        SearchResultPage searchResultPage = new SearchResultPage();
//
//        searchResultPage.checkPageHasResultItems(2);
//        searchResultPage.checkResultPagesCount(3);
//        searchResultPage.clickSearchResultPage(3);
//        searchResultPage.checkPage();
//        String targetUrl = searchResultPage.clickSearchResult(2);
//
//        TargetPage targetPage = new TargetPage(targetUrl);
//        targetPage.checkPage();
//    }


//    public WebElement findElement(By xpath) {
//        try {
//            log.debug("Ищу элемент по локатору '{}'", xpath);
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
//            ((JavascriptExecutor)driver).executeScript("arguments[0]['style']['backgroundColor']='darksalmon';", element);
//            log.debug("Элемент по локатору '{}' найден.", xpath);
//            return element;
//        } catch (RuntimeException e){
//            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            String newFileName = String.format(
//                    "%s\\screenshots\\%s.png", System.getProperty("user.dir"), LocalDateTime.now().toString().replace(":", "-"));
//            File destination = new File(newFileName);
//
//            try {
//                FileUtils.copyFile(source, destination);
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//            driver.quit();
//            throw e;
//        }
//    }
//
//    public List<WebElement> findElements(By xpath) {
//        log.debug("Ищу элемент по локатору '{}'", xpath);
//        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(xpath));
//        log.debug("Элемент по локатору '{}' найден.", xpath);
//        return elements;
