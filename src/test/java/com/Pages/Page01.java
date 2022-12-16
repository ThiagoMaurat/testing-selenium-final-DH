package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page01 extends BasePage {
    public static final String firstName = "//*[@id=\"input-firstname\"]";
    public static final String lastName = "//*[@id=\"input-lastname\"]";
    public static final String email = "//*[@id=\"input-email\"]";
    public static final String telephone = "//*[@id=\"input-telephone\"]";
    public static final String myAccount = "//*[@id=\"top-links\"]/ul/li[2]/a/i";
    public static final String registerOption = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a";
    public static final String password = "//*[@id=\"input-password\"]";
    public static final String passwordConfirmation= "//*[@id=\"input-confirm\"]";
    public static final String noForNewsLetter = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input";
    public static final String checkBoxPrivacy = "//*[@id=\"content\"]/form/div/div/input[1]";
    public static final String clickAndConfirmRegister = "//*[@id=\"content\"]/form/div/div/input[2]";
    public static final String verifyMessage = "//*[@id=\"content\"]/p[1]";

    public void insertIntoField(String field, String value) {
        WebElement fieldPersonal = getWebElement(By.xpath(field));
        fieldPersonal.clear();
        fieldPersonal.sendKeys(value);
    }

    public void getInRegisterPag() throws InterruptedException  {
        WebElement myAccountButton = getWebElement(By.xpath(myAccount));
        myAccountButton.click();
        Thread.sleep(2000);

        WebElement registerOptionButton = getWebElement(By.xpath(registerOption));
        registerOptionButton.click();
    }

    public void insertIntoPersonalDetailsSection() throws InterruptedException  {
        insertIntoField(firstName, "Thiago");
        insertIntoField(lastName, "Maurat");
        insertIntoField(email, "test-0a37vixu5@srv1.mail-tester.com");
        insertIntoField(telephone, "(11) 11111-1111");
    }

    public void insertIntoPasswordsSection() throws InterruptedException  {
        insertIntoField(password, "teste");
        insertIntoField(passwordConfirmation, "teste");
    }

    public void setNoForNewsLetterAgreePrivacyAndConfirm() {
        WebElement setNoForNewsLetter = getWebElement(By.xpath(noForNewsLetter));
        setNoForNewsLetter.click();

        WebElement checkBoxPrivacyMark = getWebElement(By.xpath(checkBoxPrivacy));
        checkBoxPrivacyMark.click();

        WebElement clickConfirm = getWebElement(By.xpath(clickAndConfirmRegister));
        clickConfirm.click();

    }

    public String verifyIfSucessed() {
        WebElement verifyMessageSucess = getWebElement(By.xpath(verifyMessage));
        System.out.println(verifyMessageSucess.getText());
        return verifyMessageSucess.getText();

    }
}
