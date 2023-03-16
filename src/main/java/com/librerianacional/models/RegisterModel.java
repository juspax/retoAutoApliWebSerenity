package com.librerianacional.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegisterModel {

    private String email;
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String cellPhone;
    private String landLine;
    private String password;
    private String confirmPassword;

    public RegisterModel(String email, String password){
        this.email = email;
        this.password = password;
    }

    public RegisterModel(ArrayList<Map<String, String>> listRegister) {

        this.email = listRegister.get(0).get("email");
        this.name = listRegister.get(0).get("name");
        this.lastName = listRegister.get(0).get("lastName");
        this.documentType = listRegister.get(0).get("identityCard");
        this.documentNumber = listRegister.get(0).get("documentNumber");
        this.cellPhone = listRegister.get(0).get("mobilePhone");
        this.landLine = listRegister.get(0).get("landLine");
        this.password = listRegister.get(0).get("password");
        this.confirmPassword = listRegister.get(0).get("confirmPassword");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}




