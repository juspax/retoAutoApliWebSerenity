package com.librerianacional.actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static com.librerianacional.pageObjects.BuyBookPageObject.*;

public class LibraryBuyAction extends PageObject {

    public void clicMyAccount() {
        getDriver().findElement(BTN_MY_ACCOUNT).click();
    }

    public void clicOnLogin() {
        getDriver().findElement(BTN_ON_LOGIN).click();
    }

    public void enterEmailPassword() {
        getDriver().findElement(BTN_EMAIL_PASSWORD).click();
    }

    public void writeEmail(String email) {
        getDriver().findElement(TXT_EMAIL).sendKeys(email);
    }

    public void writePassword(String password) {
        getDriver().findElement(TXT_PASSWORD).sendKeys(password);
    }

    public void clicLogin() {
        getDriver().findElement(BTN_LOGIN).click();
    }

    public void writeBook(String book) {
        find(TXT_BOOK).typeAndEnter(book);
    }

    public void locatedBookCard() {
        JavascriptExecutor jse = (JavascriptExecutor) Serenity.getWebdriverManager().getWebdriver();
        jse.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 4);",
                find(LETTER_BOOK));

        Actions actions = new Actions(Serenity.getWebdriverManager().getWebdriver());
        actions.moveToElement(find(LETTER_BOOK)).build().perform();
    }

    public void clicAddCart() {
        getDriver().findElement(BTN_ADD_CART).click();
    }


    public void waitTime() {
        waitFor(8).seconds();
    }

    public void clicClosingPopUp() {
        getDriver().findElement(BTN_CLOSING_POP_UP).click();
    }

    public void clicShoppingCart() {
        getDriver().findElement(BTN_SHOPPING_CART).click();

    }

    public void clicAddUnit() {
        getDriver().findElement(BTN_ADD_UNIT).click();
    }

    public void clicContinueShopping() {
        getDriver().findElement(BTN_CONTINUE_SHOPPING).click();
    }
    public void clicAddNewAddress() {
        getDriver().findElement(BTN_ADD_NEW_ADDRESS).click();
    }
    public void writeAddressName(String addressName) {
        getDriver().findElement(TXT_ADDRESS_NAME).sendKeys(addressName);
    }

    public void selectHousingType(String housingType) {
        find(TXT_HOUSING_TYPE).selectByValue(housingType);

    }

    public void writeBuyerName(String homeBuyerName) {
        getDriver().findElement(TXT_BUYER_NAME).sendKeys(homeBuyerName);
    }

    public void writeHomeBuyerSurname(String homeBuyerSurname) {
        getDriver().findElement(TXT_HOME_BUYER_SURNAME).sendKeys(homeBuyerSurname);
    }

    public void writeAddressLandlinePhone(String addressLandlinePhone) {
        getDriver().findElement(TXT_ADDRESS_LANDLINE_PHONE).sendKeys(addressLandlinePhone);
    }

    public void writeAddressCellPhone(String addressCellPhone) {
        getDriver().findElement(TXT_ADDRESS_CELL_PHONE).sendKeys(addressCellPhone);
    }

    public void writeAddress(String address) {
        getDriver().findElement(TXT_ADDRESS).sendKeys(address);
    }

    public void writeSiteAddress(String siteAddress) {
        getDriver().findElement(TXT_SITE_ADDRESS).sendKeys(siteAddress);
    }

    public void writeAddressPostalCode(String addressPostalCode) {
        getDriver().findElement(TXT_ADDRESS_POSTAL_CODE).sendKeys(addressPostalCode);
    }

    public void selectCountry(String selectCountry) {

        find(TXT_COUNTRY).selectByVisibleText(selectCountry);
    }

    public void selectDepartment(String selectDepartment) {

        find(TXT_DEPARTMENT).selectByVisibleText(selectDepartment);
    }

    public void selectCity(String selectCity) {

        find(TXT_CITY).selectByVisibleText(selectCity);
    }

    public void clicSaveAddress() {
        getDriver().findElement(BTN_SAVE_ADDRESS).click();
    }

    public void confirmSaveAddress() {
        getDriver().findElement(BTN_CONFIRM_SAVE_ADDRESS).click();
    }

    public String checkElementAmount() {
        return find(CHECK_AMOUNT).getTextContent();
    }

    public String checkTotalAmount() {
        return find(CHECK_TOTAL_AMOUNT).getTextContent();
    }


}
