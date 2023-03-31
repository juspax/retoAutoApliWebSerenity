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

}
