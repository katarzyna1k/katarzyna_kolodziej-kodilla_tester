package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EbayTestingAppWithCssSelectors {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https:/ebay.pl");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement mavicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='Wyszukaj']")));
        mavicElement.sendKeys("Mavic mini");

        WebElement elektronika = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("option[value*='625']")));
        elektronika.submit();

        WebElement szukaj = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Wyszukaj']")));
        szukaj.click();

        List<WebElement> searchElements = driver.findElements(By.cssSelector("li[id*='item']"));
        System.out.println(searchElements.get(1).getText());

    }
}
