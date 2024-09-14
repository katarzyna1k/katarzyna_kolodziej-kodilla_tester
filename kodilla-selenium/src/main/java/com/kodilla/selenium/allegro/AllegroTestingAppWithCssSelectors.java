package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppWithCssSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https:/allegro.pl");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement mavicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='czego']")));
        mavicElement.sendKeys("Mavic mini");

        WebElement elektronika = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("option[value*='elektronika']")));
        elektronika.submit();

        WebElement szukaj = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form[data-role='search-form'] button :last-child")));
        szukaj.click();

        List<WebElement> searchElements = driver.findElements(By.cssSelector("section>article"));
        searchElements.get(0).getText();

    }
}
