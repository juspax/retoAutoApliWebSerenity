package com.librerianacional.steps;

import com.librerianacional.models.BuyBookModel;
import com.librerianacional.models.RegisterModel;
import com.librerianacional.pageObjects.BuyBookPageObject;
import com.librerianacional.pageObjects.RegisterPageObject;
import com.librerianacional.utils.DataListExcel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;


public class BuyBookStep {


    private RegisterPageObject registerPageObject;
    BuyBookPageObject buyBookPOM = new BuyBookPageObject();

    public static ArrayList<Map<String, String>> openExcelBuy = new ArrayList<>();

    @Step
    public void readExcel()throws IOException {
        openExcelBuy = DataListExcel.readExcel("retoLibreria.xlsx", "BuyBook");}

    @Step
    public void enterLogin(RegisterModel listBuyBook) {

        buyBookPOM.clicMyAccount();
        buyBookPOM.clicOnLogin();
        buyBookPOM.enterEmailPassword();
        buyBookPOM.writeEmail(listBuyBook.getEmail());
        buyBookPOM.writePassword(listBuyBook.getPassword());
        buyBookPOM.clicLogin();
    }

    @Step
    public void buyBook(BuyBookModel listBuyBook) {
        buyBookPOM.writeBook(listBuyBook.getNameBook());
        buyBookPOM.locatedBookCard();
        buyBookPOM.clicAddCart();
        buyBookPOM.waitTime();
        buyBookPOM.clicClosingPopUp();
        buyBookPOM.clicShoppingCart();
        buyBookPOM.waitTime();
        buyBookPOM.clicAddUnit();
        buyBookPOM.waitTime();
        buyBookPOM.clicContinueShopping();
        buyBookPOM.waitTime();
        buyBookPOM.clicAddNewAddress();
        buyBookPOM.writeAddressName(listBuyBook.getAddressName());
        buyBookPOM.selectHousingType(listBuyBook.getHousingType());
        buyBookPOM.writeBuyerName(listBuyBook.getHomeBuyerName());
        buyBookPOM.writeHomeBuyerSurname(listBuyBook.getHomeBuyerSurname());
        buyBookPOM.writeAddressLandlinePhone(listBuyBook.getAddressLandlinePhone());
        buyBookPOM.writeAddressCellPhone(listBuyBook.getAddressCellPhone());
        buyBookPOM.writeAddress(listBuyBook.getAddress());
        buyBookPOM.writeSiteAddress(listBuyBook.getSiteAddress());
        buyBookPOM.writeAddressPostalCode(listBuyBook.getAddressPostalCode());
        buyBookPOM.selectCountry(listBuyBook.getSelectCountry());
        buyBookPOM.selectDepartment(listBuyBook.getSelectDepartment());
        buyBookPOM.selectCity(listBuyBook.getSelectCity());
        buyBookPOM.clicSaveAddress();
        buyBookPOM.waitTime();
        buyBookPOM.confirmSaveAddress();
    }

    @Step
    public void checkElement(BuyBookModel listBuy) {
        MatcherAssert.assertThat(buyBookPOM.checkElementAmount(), containsString(listBuy.getQuantity()));
        MatcherAssert.assertThat(buyBookPOM.checkTotalAmount().replace("$", "").replace(",", ""), containsString(listBuy.getAmount()));
    }

    public void closebrowser() {
        registerPageObject.getDriver().close();
    }


}
