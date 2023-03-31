package com.librerianacional.steps;

import com.librerianacional.actions.LibraryBuyAction;
import com.librerianacional.models.BuyBookModel;
import com.librerianacional.models.RegisterModel;
import com.librerianacional.pageObjects.RegisterPageObject;
import com.librerianacional.utils.DataListExcel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;


public class BuyBookStep {


    private RegisterPageObject registerPageObject;

    LibraryBuyAction libraryBuyAction = new LibraryBuyAction();

    public static ArrayList<Map<String, String>> openExcelBuy = new ArrayList<>();

    @Step
    public void readExcel()throws IOException {
        openExcelBuy = DataListExcel.readExcel("retoLibreria.xlsx", "BuyBook");}

    @Step
    public void enterLogin(RegisterModel listBuyBook) {

        libraryBuyAction.clicMyAccount();
        libraryBuyAction.clicOnLogin();
        libraryBuyAction.enterEmailPassword();
        libraryBuyAction.writeEmail(listBuyBook.getEmail());
        libraryBuyAction.writePassword(listBuyBook.getPassword());
        libraryBuyAction.clicLogin();
    }

    @Step
    public void buyBook(BuyBookModel listBuyBook) {
        libraryBuyAction.writeBook(listBuyBook.getNameBook());
        libraryBuyAction.locatedBookCard();
        libraryBuyAction.clicAddCart();
        libraryBuyAction.waitTime();
        libraryBuyAction.clicClosingPopUp();
        libraryBuyAction.clicShoppingCart();
        libraryBuyAction.waitTime();
        libraryBuyAction.clicAddUnit();
        libraryBuyAction.waitTime();
        libraryBuyAction.clicContinueShopping();
        libraryBuyAction.waitTime();
        libraryBuyAction.clicAddNewAddress();
        libraryBuyAction.writeAddressName(listBuyBook.getAddressName());
        libraryBuyAction.selectHousingType(listBuyBook.getHousingType());
        libraryBuyAction.writeBuyerName(listBuyBook.getHomeBuyerName());
        libraryBuyAction.writeHomeBuyerSurname(listBuyBook.getHomeBuyerSurname());
        libraryBuyAction.writeAddressLandlinePhone(listBuyBook.getAddressLandlinePhone());
        libraryBuyAction.writeAddressCellPhone(listBuyBook.getAddressCellPhone());
        libraryBuyAction.writeAddress(listBuyBook.getAddress());
        libraryBuyAction.writeSiteAddress(listBuyBook.getSiteAddress());
        libraryBuyAction.writeAddressPostalCode(listBuyBook.getAddressPostalCode());
        libraryBuyAction.selectCountry(listBuyBook.getSelectCountry());
        libraryBuyAction.selectDepartment(listBuyBook.getSelectDepartment());
        libraryBuyAction.selectCity(listBuyBook.getSelectCity());
        libraryBuyAction.clicSaveAddress();
        libraryBuyAction.waitTime();
        libraryBuyAction.confirmSaveAddress();
    }

    @Step
    public void checkElement(BuyBookModel listBuy) {
        MatcherAssert.assertThat(libraryBuyAction.checkElementAmount(), containsString(listBuy.getQuantity()));
        MatcherAssert.assertThat(libraryBuyAction.checkTotalAmount().replace("$", "").replace(",", ""), containsString(listBuy.getAmount()));
    }

    public void closebrowser() {
        registerPageObject.getDriver().close();
    }


}
