package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page02 extends BasePage {
    public static String searchBox = "//*[@id=\"search\"]/input";
    public static String searchButton = "//*[@id=\"search\"]/span/button";
    public static String addToCartButton = "//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]";
    public static String textSucess = "//*[@id=\"product-search\"]/div[1]";

    public void SearchTextAndPress() throws InterruptedException{
        WebElement searchBoxText = getWebElement(By.xpath(searchBox));
        searchBoxText.clear();
        searchBoxText.sendKeys("Iphone");
        Thread.sleep(2000);
        searchBoxText.sendKeys(Keys.ENTER);

        WebElement clickSearchButton = getWebElement(By.xpath(searchButton));
        clickSearchButton.click();
    }

    public void addToCart() throws InterruptedException {
        WebElement addButton = getWebElement(By.xpath(addToCartButton));
        addButton.click();
    }

    public String verifyIfTextSucessed() {
        WebElement textAsert = getWebElement(By.xpath(textSucess));
        return textAsert.getText();
    }
}
