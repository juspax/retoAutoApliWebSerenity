package com.librerianacional.actions;

import static com.librerianacional.pageObjects.RegisterPageObject.*;
import net.serenitybdd.core.pages.PageObject;

public class LibraryRegisterAction extends PageObject {

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

    public void selectDocumentType(String identityCard) {find(LIST_DOCUMENT_TYPE).selectByValue(identityCard);
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
