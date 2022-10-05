import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.praktikum.PageObjects.HomePageSamokat;
import java.time.Duration;

// Класс содержит проверки, что для каждого вопроса из "Вопросы о важном", когда нажимаешь на стрелку, открывается соответствующий текст.
public class TestQuestions {
    private WebDriver driver;
    private final int DURATION_OF_START = 10;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void startWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void checkAnswerInQuestion_1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion1Button();
        String answerText = homePage.getAnswer1Text();

        Assert.assertEquals("Expected another answer", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_2(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion2Button();
        String answerText = homePage.getAnswer2Text();

        Assert.assertEquals("Expected another answer", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_3(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion3Button();
        String answerText = homePage.getAnswer3Text();

        Assert.assertEquals("Expected another answer", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_4(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion4Button();
        String answerText = homePage.getAnswer4Text();

        Assert.assertEquals("Expected another answer", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_5(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion5Button();
        String answerText = homePage.getAnswer5Text();

        Assert.assertEquals("Expected another answer", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_6(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion6Button();
        String answerText = homePage.getAnswer6Text();

        Assert.assertEquals("Expected another answer", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_7(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion7Button();
        String answerText = homePage.getAnswer7Text();

        Assert.assertEquals("Expected another answer", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", answerText);

    }
    @Test
    public void checkAnswerInQuestion_8(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DURATION_OF_START));
        HomePageSamokat homePage = new HomePageSamokat(driver);
        homePage.open();
        homePage.clickQuestion8Button();
        String answerText = homePage.getAnswer8Text();

        Assert.assertEquals("Expected another answer", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", answerText);

    }
//Закрыть браузер
  @After
    public void cleanUp() {
        driver.quit();
    }
}
