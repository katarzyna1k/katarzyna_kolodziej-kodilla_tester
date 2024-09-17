package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class KodillaStorePom extends AbstractKodillaStorePom {

    @FindBy(css = "input[ id='searchField']")
    WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String storeItem) {
        searchField.sendKeys(storeItem);
    }

    public int searchList(String storeItem) {
        search(storeItem);
        List<WebElement> productList = driver.findElements(By.cssSelector("div.element"));
        driver.navigate().to("https://kodilla.com/pl/test/store");
        return productList.size();
    }

    public void quit() {
        driver.quit();
    }
}
