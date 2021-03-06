package ru.appline.framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Arkadiy_Alaverdyan
 * Класс описывающий страничку выбора полиса
 */
public class TarifPage extends BasePage {

    @FindBy(xpath = "//h3[text()='Минимальная']")
    WebElement insuranceCoverageAmount;

    @FindBy(xpath = "//button[text()='Оформить']")
    WebElement checkoutButton;


    /**
     * Выбор тарифа страхования
     *
     * @return TarifPage - т.е. остаемся на этой странице
     */
    @Step("Выбираем тариф страхования 'Минимальный'")
    public TarifPage selectTarifMin() {
        scrollToElementJs(insuranceCoverageAmount);
        insuranceCoverageAmount.click();
        return this;
    }

    /**
     * Клик по кнопке "Оформить"
     *
     * @return RegistrationFormPage - т.е. переходим на страницу {@link ru.appline.framework.pages.RegistrationFormPage}
     */
    @Step("Кликаем по кнопке 'Оформить'")
    public RegistrationFormPage clickBtnOformit() {
        scrollToElementJs(checkoutButton);
        elementToBeClickable(checkoutButton).click();
        return app.getRegistrationFormPage();
    }


}
