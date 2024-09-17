package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EbayTestingAppWithXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://ebay.pl");


        WebElement mavicMiniElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'Wyszukaj')]"));
        mavicMiniElement.sendKeys("Mavic mini");

        WebElement allegroElement = driver.findElement(By.xpath("//*[@id='gh-cat']"));
        Select elektronika = new Select(allegroElement);
        elektronika.selectByVisibleText("Fotografia i Kamery");
    }
}
