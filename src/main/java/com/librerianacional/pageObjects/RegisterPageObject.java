package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.Base.url")
public class RegisterPageObject extends PageObject {

    public static final By BTN_MY_ACCOUNT = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    public static final By RECORD_LIST = By.xpath("(//a[@href='/usuario/registrarme'])[2]");
    public static final By TXT_EMAIL = By.id("email");
    public static final By TXT_NAME = By.id("nombres");
    public static final By TXT_LASTNAME = By.id("apellidos");
    public static final By LIST_DOCUMENT_TYPE = By.xpath("//select[@name='tipo_identificacion']");
    public static final By TXT_DOCUMENTNUMBER = By.id("identificacion");
    public static final By TXT_CELLPHONE = By.id("telefono_movil");
    public static final By TXT_LANDLINE = By.id("telefono");
    public static final By TXT_PASSWORD = By.id("contrasena");
    public static final By TXT_CONFIRMPASSWORD = By.id("repeatContrasena");
    public static final By BTN_TERMSCONDITIONS = By.xpath("//input[@id='terminosCondiciones']");
    public static final By BTN_REGISTER = By.xpath("//button[@type='submit']");
    public static final By LABEL_NAME = By.xpath("//div[contains(text(),'Bienvenido a tu cuenta')]");


    public void clicMyAccount() {
        getDriver().findElement(BTN_MY_ACCOUNT).click();
    }

    public void clicOnRegister() {
        getDriver().findElement(RECORD_LIST).click();
    }

    public void writeEmail(String email) {
        getDriver().findElement(TXT_EMAIL).sendKeys(email);
    }

    public void writeName(String name) {
        getDriver().findElement(TXT_NAME).sendKeys(name);
    }

    public void writeLastName(String lastName) {
        getDriver().findElement(TXT_LASTNAME).sendKeys(lastName);
    }

    public void selectDocumentType(String identityCard) {
        find(LIST_DOCUMENT_TYPE).selectByValue(identityCard);
    }

    public void writeDocumentNumber(String documentNumber) {
        getDriver().findElement(TXT_DOCUMENTNUMBER).sendKeys(documentNumber);
    }

    public void writeCellPhone(String cellPhone) {
        getDriver().findElement(TXT_CELLPHONE).sendKeys(cellPhone);
    }

    public void writeLandline(String landLine) {
        getDriver().findElement(TXT_LANDLINE).sendKeys(landLine);
    }

    public void writePassword(String password) {

        getDriver().findElement(TXT_PASSWORD).sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPassword) {
        getDriver().findElement(TXT_CONFIRMPASSWORD).sendKeys(confirmPassword);
    }

    public void clicTermsConditions() {

        getDriver().findElement(BTN_TERMSCONDITIONS).click();
    }

    public void clicRegisterButton() {
        getDriver().findElement(BTN_REGISTER).click();
    }

    public String getTextElement() {
        String message = getDriver().findElement(LABEL_NAME).getText();
        return message;
    }

}
