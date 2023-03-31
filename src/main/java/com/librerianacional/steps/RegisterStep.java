package com.librerianacional.steps;

import com.librerianacional.actions.LibraryBuyAction;
import com.librerianacional.actions.LibraryRegisterAction;
import com.librerianacional.models.RegisterModel;
import com.librerianacional.pageObjects.BuyBookPageObject;
import com.librerianacional.pageObjects.RegisterPageObject;
import com.librerianacional.utils.DataListExcel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;

public class RegisterStep {

    LibraryRegisterAction libraryRegisterAction = new LibraryRegisterAction();
    RegisterPageObject registerPageObject = new RegisterPageObject();

    LibraryBuyAction libraryBuyAction = new LibraryBuyAction();

    public static ArrayList<Map<String, String>> writeExcel = new ArrayList<>();
    @Step
    public void openExcel() throws IOException {
        writeExcel = DataListExcel.readExcel("retoLibreria.xlsx", "InfoBasica");
    }
    @Step
    public void openApplication() {
        registerPageObject.open();
    }

    @Step
    public void createRecord(RegisterModel registerUser) {

        libraryRegisterAction.clicMyAccount();
        libraryRegisterAction.clicOnRegister();
        libraryRegisterAction.writeEmail(registerUser.getEmail());
        libraryRegisterAction.writeName(registerUser.getName());
        libraryRegisterAction.writeLastName(registerUser.getLastName());
        libraryRegisterAction.selectDocumentType(registerUser.getDocumentType());
        libraryRegisterAction.writeDocumentNumber(registerUser.getDocumentNumber());
        libraryRegisterAction.writeCellPhone(registerUser.getCellPhone());
        libraryRegisterAction.writeLandline(registerUser.getLandLine());
        libraryRegisterAction.writePassword(registerUser.getPassword());
        libraryRegisterAction.writeConfirmPassword(registerUser.getConfirmPassword());
        libraryRegisterAction.clicTermsConditions();
        libraryRegisterAction.clicRegisterButton();
        libraryBuyAction.waitTime();

    }

    @Step
    public void verifyMessage(String message) {
        MatcherAssert.assertThat(libraryRegisterAction.getTextElement(), containsString(message));
    }


}
