package ru.yandex.praktikum.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageSamokat {
    //Ссылка на страницу сайта Яндекс.Самокат
    private static final String PAGE_URL="https://qa-scooter.praktikum-services.ru/";
    private final WebDriver driver;

    //Кнопка 1 вопроса из "Вопросы о важном"
    private final static By QUESTION_1_BUTTON = By.cssSelector("#accordion__heading-0");
    //Кнопка 2 вопроса из "Вопросы о важном"
    private final static By QUESTION_2_BUTTON = By.cssSelector("#accordion__heading-1");
    //Кнопка 3 вопроса из "Вопросы о важном"
    private final static By QUESTION_3_BUTTON = By.cssSelector("#accordion__heading-2");
    //Кнопка 4 вопроса из "Вопросы о важном"
    private final static By QUESTION_4_BUTTON = By.cssSelector("#accordion__heading-3");
    //Кнопка 5 вопроса из "Вопросы о важном"
    private final static By QUESTION_5_BUTTON = By.cssSelector("#accordion__heading-4");
    //Кнопка 6 вопроса из "Вопросы о важном"
    private final static By QUESTION_6_BUTTON = By.cssSelector("#accordion__heading-5");
    //Кнопка 7 вопроса из "Вопросы о важном"
    private final static By QUESTION_7_BUTTON = By.cssSelector("#accordion__heading-6");
    //Кнопка 8 вопроса из "Вопросы о важном"
    private final static By QUESTION_8_BUTTON = By.cssSelector("#accordion__heading-7");

    //Текст ответа на 1 вопрос из "Вопросы о важном"
    private final static By ANSWER_1 = By.cssSelector("#accordion__panel-0 > p");
    //Текст ответа на 2 вопрос из "Вопросы о важном"
    private final static By ANSWER_2 = By.cssSelector("#accordion__panel-1 > p");
    //Текст ответа на 3 вопрос из "Вопросы о важном"
    private final static By ANSWER_3 = By.cssSelector("#accordion__panel-2 > p");
    //Текст ответа на 4 вопрос из "Вопросы о важном"
    private final static By ANSWER_4 = By.cssSelector("#accordion__panel-3 > p");
    //Текст ответа на 5 вопрос из "Вопросы о важном"
    private final static By ANSWER_5 = By.cssSelector("#accordion__panel-4 > p");
    //Текст ответа на 6 вопрос из "Вопросы о важном"
    private final static By ANSWER_6 = By.cssSelector("#accordion__panel-5 > p");
    //Текст ответа на 7 вопрос из "Вопросы о важном"
    private final static By ANSWER_7 = By.cssSelector("#accordion__panel-6 > p");
    //Текст ответа на 8 вопрос из "Вопросы о важном"
    private final static By ANSWER_8 = By.cssSelector("#accordion__panel-7 > p");

    //Кнопка "Заказать" вверху страницы
    private final static By TOP_ORDER_BUTTON = By.xpath("//*[@id='root']/div/div/div[1]/div[2]/button[1]");
    //Кнопка "Заказать" по середине страницы
    private final static By MIDDLE_ORDER_BUTTON = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");

    public HomePageSamokat(WebDriver driver) {
        this.driver = driver;
    }
    //Открыть Ягдекс.Самокат
    public void open() {
        driver.get(PAGE_URL);
    }
    //Нажать на кнопку-стрелку 1 вопроса из "Вопросы о важном"
    public void clickQuestion1Button() {
        WebElement element = driver.findElement(QUESTION_1_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_1_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 2 вопроса из "Вопросы о важном"
    public void clickQuestion2Button() {
        WebElement element = driver.findElement(QUESTION_2_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_2_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 3 вопроса из "Вопросы о важном"
    public void clickQuestion3Button() {
        WebElement element = driver.findElement(QUESTION_3_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_3_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 4 вопроса из "Вопросы о важном"
    public void clickQuestion4Button() {
        WebElement element = driver.findElement(QUESTION_4_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_4_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 5 вопроса из "Вопросы о важном"
    public void clickQuestion5Button() {
        WebElement element = driver.findElement(QUESTION_5_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_5_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 6 вопроса из "Вопросы о важном"
    public void clickQuestion6Button() {
        WebElement element = driver.findElement(QUESTION_6_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_6_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 7 вопроса из "Вопросы о важном"
    public void clickQuestion7Button() {
        WebElement element = driver.findElement(QUESTION_7_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_7_BUTTON).click();
    }
    //Нажать на кнопку-стрелку 8 вопроса из "Вопросы о важном"
    public void clickQuestion8Button() {
        WebElement element = driver.findElement(QUESTION_8_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(QUESTION_8_BUTTON).click();
    }
    // Скроллить до появления текста ответа на вопрос
    public void scrollTOAnswerText(By Answer) {
        WebElement element = driver.findElement(Answer);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //Скроллить до появления middle-кнопки "Заказать"
    public void scrollToMiddleButton() {
        WebElement element = driver.findElement(MIDDLE_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    // Получить ответ на 1 вопрос из "Вопросы о важном"
    public String getAnswer1Text() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //WebElement element =(new WebDriverWait(driver, Duration.ofSeconds(10))
                //.until(ExpectedConditions.presenceOfElementLocated(ANSWER_1)));
        scrollTOAnswerText(ANSWER_1);
        return (driver.findElement(ANSWER_1).getText());
    }
    // Получить ответ на 2 вопрос из "Вопросы о важном"
    public String getAnswer2Text() {
        scrollTOAnswerText(ANSWER_2);
        return (driver.findElement(ANSWER_2).getText());
    }
    // Получить ответ на 3 вопрос из "Вопросы о важном"
    public String getAnswer3Text() {
        scrollTOAnswerText(ANSWER_3);
        return (driver.findElement(ANSWER_3).getText());
    }
    // Получить ответ на 4 вопрос из "Вопросы о важном"
    public String getAnswer4Text() {
        scrollTOAnswerText(ANSWER_4);
        return (driver.findElement(ANSWER_4).getText());
    }
    // Получить ответ на 5 вопрос из "Вопросы о важном"
    public String getAnswer5Text() {
        scrollTOAnswerText(ANSWER_5);
        return (driver.findElement(ANSWER_5).getText());
    }
    // Получить ответ на 6 вопрос из "Вопросы о важном"
    public String getAnswer6Text() {
        scrollTOAnswerText(ANSWER_6);
        return (driver.findElement(ANSWER_6).getText());
    }
    // Получить ответ на 7 вопрос из "Вопросы о важном"
    public String getAnswer7Text() {
        scrollTOAnswerText(ANSWER_7);
        return (driver.findElement(ANSWER_7).getText());
    }
    // Получить ответ на 8 вопрос из "Вопросы о важном"
    public String getAnswer8Text() {
        scrollTOAnswerText(ANSWER_8);
        return (driver.findElement(ANSWER_8).getText());
    }
    // Нажать верхнюю кнопку "Заказать"
    public void clickTopOrderButton() {
        driver.findElement(TOP_ORDER_BUTTON).click();
    }
    // Нажать кнопку "Заказать" в середине страницы
    public void clickMiddleOrderButton() {
        WebElement element = driver.findElement(MIDDLE_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(MIDDLE_ORDER_BUTTON).click();
    }
}
