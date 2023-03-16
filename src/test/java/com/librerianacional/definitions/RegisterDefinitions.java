package com.librerianacional.definitions;

import com.librerianacional.models.BuyBookModel;
import com.librerianacional.models.RegisterModel;
import com.librerianacional.steps.BuyBookStep;
import com.librerianacional.steps.RegisterStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;

import static com.librerianacional.steps.BuyBookStep.openExcelBuy;
import static com.librerianacional.steps.RegisterStep.writeExcel;

public class RegisterDefinitions {

    @Steps
    RegisterStep registerStep;

    @Steps
    BuyBookStep buyBookStep;


    @Given("I access the initial platform to register")
    public void iAccessTheInitialPlatformToRegister()throws IOException {
        registerStep.openApplication();
        registerStep.openExcel();
        buyBookStep.readExcel();
    }


    @When("register on the platform")
    public void registerOnThePlatform() {
        RegisterModel registerUser = new RegisterModel(writeExcel);
        registerStep.createRecord(registerUser);


    }

    @Then("Verify correct user registration {string}")
    public void verifyCorrectUserRegistration(String message) {
        registerStep.verifyMessage(message);

    }


    @When("validate the buy a book")
    public void validateTheBuyABook() {
        BuyBookModel registerBuyBook = new BuyBookModel(openExcelBuy);
        RegisterModel registerUser = new RegisterModel(openExcelBuy.get(0).get("email"),openExcelBuy.get(0).get("password"));
        buyBookStep.enterLogin(registerUser);
        buyBookStep.buyBook(registerBuyBook);
    }

    @Then("verify the books and the amount of the purchase")
    public void verifyTheBooksAndTheAmountOfThePurchase() {
        BuyBookModel registerBuyBook = new BuyBookModel(openExcelBuy.get(0).get("quantity"),openExcelBuy.get(0).get("amount"));
        buyBookStep.checkElement(registerBuyBook);
    }

    @After
    public void closebrowser() {
        buyBookStep.closebrowser();
    }

}

