package com.librerianacional.steps;

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

public class RegisterStep {

    RegisterPageObject registerPagePOM = new RegisterPageObject();

    private BuyBookPageObject buyBookPageObject;

    public static ArrayList<Map<String, String>> writeExcel = new ArrayList<>();
    @Step
    public void openExcel() throws IOException {
        writeExcel = DataListExcel.readExcel("retoLibreria.xlsx", "InfoBasica");
    }
    @Step
    public void openApplication() {
        registerPagePOM.open();
    }

    @Step
    public void createRecord(RegisterModel registerUser) {

        registerPagePOM.clicMyAccount();
        registerPagePOM.clicOnRegister();
        registerPagePOM.writeEmail(registerUser.getEmail());
        registerPagePOM.writeName(registerUser.getName());
        registerPagePOM.writeLastName(registerUser.getLastName());
        registerPagePOM.selectDocumentType(registerUser.getDocumentType());
        registerPagePOM.writeDocumentNumber(registerUser.getDocumentNumber());
        registerPagePOM.writeCellPhone(registerUser.getCellPhone());
        registerPagePOM.writeLandline(registerUser.getLandLine());
        registerPagePOM.writePassword(registerUser.getPassword());
        registerPagePOM.writeConfirmPassword(registerUser.getConfirmPassword());
        registerPagePOM.clicTermsConditions();
        registerPagePOM.clicRegisterButton();
        buyBookPageObject.waitTime();

    }

    @Step
    public void verifyMessage(String message) {
        MatcherAssert.assertThat(registerPagePOM.getTextElement(), containsString(message));
    }


}
