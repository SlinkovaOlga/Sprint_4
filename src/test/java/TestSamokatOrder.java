import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.PageObjects.HomePageSamokat;
import ru.yandex.praktikum.PageObjects.OrderPageSamokat;
import java.time.Duration;

@RunWith(Parameterized.class)
public class TestSamokatOrder {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String color;
    private final String comment;

    public TestSamokatOrder(String name, String surname, String address, String phone, String color, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.color = color;
        this.comment = comment;
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void startWebDriver() {
        driver = new ChromeDriver();
    }


    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {"Роман", "Суриков", "ул.Пушкина, д. 6", "89645130662", "black", "Без комментариев"},
                {"Ирина", "Сурикова", "ул.Пушкина, д. 7", "+79645130662", "grey", "Позвонить"}
        };
    }
    @Test
    public void checkSamokatOrderWithTopOrderButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickTopOrderButton();
        OrderPageSamokat orderPage = new OrderPageSamokat(driver);
        orderPage.fillNameInputField(name);
        orderPage.fillSurnameInputField(surname);
        orderPage.fillAddressInputField(address);
        orderPage.fillMetroSelectField();
        orderPage.fillPhoneInputField(phone);
        orderPage.clickGoNextButton();
        orderPage.fillDateSelectionField();
        orderPage.fillOrderDurationSelectionField();
        orderPage.fillColorSelectionField(color);
        orderPage.fillCommentInputField(comment);
        orderPage.clickOrderButton();
        orderPage.clickСonfirmationYesButton();
        String getOrderStatusText = orderPage.getOrderStatusText();
        Assert.assertTrue("Expected Status of Order", orderPage.isOrderStatusPresent(getOrderStatusText));

    }
    @Test
    public void checkSamokatOrderWithMiddleOrderButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.scrollToMiddleButton();
        homePage.clickMiddleOrderButton();
        OrderPageSamokat orderPage = new OrderPageSamokat(driver);
        orderPage.fillNameInputField(name);
        orderPage.fillSurnameInputField(surname);
        orderPage.fillAddressInputField(address);
        orderPage.fillMetroSelectField();
        orderPage.fillPhoneInputField(phone);
        orderPage.clickGoNextButton();
        orderPage.fillDateSelectionField();
        orderPage.fillOrderDurationSelectionField();
        orderPage.fillColorSelectionField(color);
        orderPage.fillCommentInputField(comment);
        orderPage.clickOrderButton();
        orderPage.clickСonfirmationYesButton();
        String getOrderStatusText = orderPage.getOrderStatusText();
        Assert.assertTrue("Expected Status of Order", orderPage.isOrderStatusPresent(getOrderStatusText));

    }
   @After
    public void cleanUp() {
        driver.quit();
    }
}
