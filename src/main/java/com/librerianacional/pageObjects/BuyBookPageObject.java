package com.librerianacional.pageObjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class BuyBookPageObject extends PageObject {

    public static final By BTN_MY_ACCOUNT = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    public static final By BTN_ON_LOGIN = By.xpath("(//a[@href='/usuario/ingresar'])[2]");
    public static final By BTN_EMAIL_PASSWORD = By.xpath("//a[@href='/usuario/iniciar-sesion']");
    public static final By TXT_EMAIL = By.xpath("//input[@ng-reflect-name='usuario']");
    public static final By TXT_PASSWORD = By.xpath("//input[@name='contrasena']");
    public static final By BTN_LOGIN = By.xpath("//button[contains(text(),'Iniciar')]");
    public static final By TXT_BOOK = By.xpath("(//input[@formcontrolname='buscar'])[2]");
    public static final By LETTER_BOOK = By.xpath("//a[@class='d-block w-100 h-100']");
    public static final By BTN_ADD_CART = By.xpath("//div[@class='col-4 col-sm-12 bg-white px-0 mb-2 mx-2'][1]");
    public static final By BTN_CLOSING_POP_UP = By.xpath("//div[@class='row mx-0 w-100']//descendant::a[@href='javascript:;']");
    public static final By BTN_SHOPPING_CART = By.xpath("//i[@class='icon-cart text--md text-white']");
    public static final By BTN_ADD_UNIT = By.xpath("//button[@data-dir='up']");
    public static final By BTN_CONTINUE_SHOPPING = By.xpath("//a[contains(text(),'Continuar con la compra')]");
    public static final By BTN_ADD_NEW_ADDRESS = By.xpath("//a[@href='/carrito/datos-envio/direccion/agregar']");
    public static final By TXT_ADDRESS_NAME = By.xpath("//input[@id='nombre-direccion']");
    public static final By TXT_HOUSING_TYPE = By.xpath("//select[@ng-reflect-name='tipo_direccion']");
    public static final By TXT_BUYER_NAME = By.xpath("//input[@placeholder='Nombres']");
    public static final By TXT_HOME_BUYER_SURNAME = By.xpath("//input[@placeholder='Apellidos']");
    public static final By TXT_ADDRESS_LANDLINE_PHONE = By.xpath(" //input[@ng-reflect-name='telefono_fijo']");
    public static final By TXT_ADDRESS_CELL_PHONE = By.xpath(" //input[@ng-reflect-name='telefono_celular']");
    public static final By TXT_ADDRESS = By.xpath("//input[@ng-reflect-name='direccion']");
    public static final By TXT_SITE_ADDRESS = By.xpath("//input[@ng-reflect-name='direccion_descripcion']");
    public static final By TXT_ADDRESS_POSTAL_CODE = By.xpath("//input[@id='codigo-postal']");
    public static final By TXT_COUNTRY = By.xpath("//select[@name='pais']");
    public static final By TXT_DEPARTMENT = By.xpath("//select[@name='departamento']");
    public static final By TXT_CITY = By.xpath("//select[@name='ciudad']");
    public static final By BTN_SAVE_ADDRESS = By.xpath("//button[contains(text(),'Guardar')]");
    public static final By BTN_CONFIRM_SAVE_ADDRESS = By.xpath("//button[@class='swal2-confirm swal2-styled']");
    public static final By CHECK_AMOUNT = By.xpath("//div[text()='Cantidad: ']");
    public static final By CHECK_TOTAL_AMOUNT = By.xpath("(//span[@class='text--blue text--sml text--extrabold'])[2]");



}
