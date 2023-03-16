package com.librerianacional.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BuyBookModel {

    private String nameBook;
    private String addressName;
    private String housingType;
    private String homeBuyerName;
    private String homeBuyerSurname;
    private String addressLandlinePhone;
    private String addressCellPhone;
    private String address;
    private String siteAddress;
    private String addressPostalCode;
    private String selectCountry;
    private String selectDepartment;
    private String selectCity;
    private String quantity;
    private String amount;


    public BuyBookModel(ArrayList<Map<String, String>> listBuyBook) {


        this.nameBook = listBuyBook.get(0).get("book");
        this.addressName = listBuyBook.get(0).get("addressName");
        this.housingType = listBuyBook.get(0).get("housingType");
        this.homeBuyerName = listBuyBook.get(0).get("homeBuyerName");
        this.homeBuyerSurname = listBuyBook.get(0).get("homeBuyerSurname");
        this.addressLandlinePhone = listBuyBook.get(0).get("addressLandlinePhone");
        this.addressCellPhone = listBuyBook.get(0).get("addressCellPhone");
        this.address = listBuyBook.get(0).get("address");
        this.siteAddress = listBuyBook.get(0).get("siteAddress");
        this.addressPostalCode = listBuyBook.get(0).get("addressPostalCode");
        this.selectCountry = listBuyBook.get(0).get("selectCountry");
        this.selectDepartment = listBuyBook.get(0).get("selectDepartment");
        this.selectCity = listBuyBook.get(0).get("selectCity");
        this.quantity =  listBuyBook.get(0).get("quantity");
        this.amount = listBuyBook.get(0).get("amount");
    }

    public  BuyBookModel(String quantity, String amount){
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public String getHomeBuyerName() {
        return homeBuyerName;
    }

    public void setHomeBuyerName(String homeBuyerName) {
        this.homeBuyerName = homeBuyerName;
    }

    public String getHomeBuyerSurname() {
        return homeBuyerSurname;
    }

    public void setHomeBuyerSurname(String homeBuyerSurname) {
        this.homeBuyerSurname = homeBuyerSurname;
    }

    public String getAddressLandlinePhone() {
        return addressLandlinePhone;
    }

    public void setAddressLandlinePhone(String addressLandlinePhone) {
        this.addressLandlinePhone = addressLandlinePhone;
    }

    public String getAddressCellPhone() {
        return addressCellPhone;
    }

    public void setAddressCellPhone(String addressCellPhone) {
        this.addressCellPhone = addressCellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public String getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(String selectCountry) {
        this.selectCountry = selectCountry;
    }

    public String getSelectDepartment() {
        return selectDepartment;
    }

    public void setSelectDepartment(String selectDepartment) {
        this.selectDepartment = selectDepartment;
    }

    public String getSelectCity() {
        return selectCity;
    }

    public void setSelectCity(String selectCity) {
        this.selectCity = selectCity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
