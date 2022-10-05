package ru.yandex.praktikum.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class OrderPageSamokat {
    private static final String PAGE_URL="https://qa-scooter.praktikum-services.ru/order";
    private final WebDriver driver;
    //Кнопка "Далее"
    private final static By GO_NEXT_BUTTON = By.xpath("//*[@id='root']/div/div[2]/div[3]/button");
    //Кнопка "Заказать"
    private final static By ORDER_BUTTON = By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]");
    // Кнопка "Да", подтверждающая оформление заказа
    private final static By YES_ORDER_BUTTON = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");

    //Поле для обязательного ввода "Имя"
    private final static By NAME_INPUT_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(1) > input");
    //Поле для обязательного ввода "Фамилия"
    private final static By SURNAME_INPUT_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(2) > input");
    //Поле для обязательного ввода "Адрес: куда привезти заказ"
    private final static By ADDRESS_INPUT_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(3) > input");
    //Поле для обязательного выбора "Станция метро"
    private final static By METRO_SELECTION_FIELD = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input");
    //Поле для обязательного ввода "Телефон: на него позвонит курьер"
    private final static By PHONE_INPUT_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(5) > input");
    //Поле для обязательного выбора "Когда привезти самокат"
    private final static By DATE_SELECTION_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Order_MixedDatePicker__3qiay > div.react-datepicker-wrapper > div > input");
    //Поле для обязательного выбора "Срок аренды"
    private final static By ORDER_DURATION_SELECTION_FIELD = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[2]/span");
    //Кнопка выбора "сутки"
    private final static By ORDER_DURATION_1DAY = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    //Кнопка для выбора "Цвет самоката" - "чёрный жемчуг"
    private final static By BLACK_COLOR_SELECTION_FIELD = By.cssSelector("#black");
    //Кнопка для выбора "Цвет самоката" - "серая безысходность"
    private final static By GREY_COLOR_SELECTION_FIELD = By.cssSelector("#grey");
    //Поле для ввода "Комментарий для курьера"
    private final static By COMMENT_INPUT_FIELD = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Input_InputContainer__3NykH > input");
    //Поле статуса заказа "Заказ оформлен" в всплывающем окне
    private final static By ORDER_COMPLETE = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]");

    public OrderPageSamokat(WebDriver driver) {
        this.driver = driver;
    }
    //Заполнить поле "Имя"
    public void fillNameInputField(String name) {
        driver.findElement(NAME_INPUT_FIELD).sendKeys(name);
    }
    //Заполнить поле "Фамилия"
    public void fillSurnameInputField(String surname) {
        driver.findElement(SURNAME_INPUT_FIELD).sendKeys(surname);
    }
    //Заполнить поле "Адрес"
    public void fillAddressInputField(String address) {
        driver.findElement(ADDRESS_INPUT_FIELD).sendKeys(address);
    }
    //Заполнить поле "Метро"
    public void fillMetroSelectField() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(METRO_SELECTION_FIELD)).click();
        driver.findElement(METRO_SELECTION_FIELD).sendKeys(Keys.DOWN);
        driver.findElement(METRO_SELECTION_FIELD).sendKeys(Keys.ENTER);
    }
    //Заполнить поле "Телефон"
    public void fillPhoneInputField(String phone) {
        driver.findElement(PHONE_INPUT_FIELD).sendKeys(phone);
    }
    //Нажать на кнопку "Далее
    public void clickGoNextButton() {
        driver.findElement(GO_NEXT_BUTTON).click();
    }
    //Выбрать дату
    public void fillDateSelectionField() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // готовим нужный форматтер
        String date = LocalDate.now().plusDays(2).format(formatter); // получаем текущую дату, прибавляем к ней 2 дня и форматируем
        driver.findElement(DATE_SELECTION_FIELD).sendKeys(date);
    }
    //Выбрать длительность аренды
    public void fillOrderDurationSelectionField() {
        driver.findElement(ORDER_DURATION_SELECTION_FIELD).click();
        driver.findElement(ORDER_DURATION_1DAY).click();
    }
    //Выбрать цвет
    public void fillColorSelectionField(String color) {
        if (color == "black") {
            driver.findElement(BLACK_COLOR_SELECTION_FIELD).click();
        } else if (color == "grey"){
            driver.findElement(GREY_COLOR_SELECTION_FIELD).click();
        }
    }
    //Заполнить поле "Комментарии"
    public void fillCommentInputField(String comments) {
        driver.findElement(COMMENT_INPUT_FIELD).sendKeys(comments);
    }
    //Нажать на кнопку "Заказать"
    public void clickOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }
    //Нажать на кнопку "Да" в подтверждении заказа
    public void clickСonfirmationYesButton() {
        driver.findElement(YES_ORDER_BUTTON).click();
    }
    //Получить текст заказа "Заказ оформлен"
    public String getOrderStatusText() {
        return driver.findElement(ORDER_COMPLETE).getText();
    }
    //Отображается ли статус заказа "Заказ оформлен"
    public boolean isOrderStatusPresent(String getOrderStatusText) {
        return getOrderStatusText == "Заказ оформлен";
    }

}
