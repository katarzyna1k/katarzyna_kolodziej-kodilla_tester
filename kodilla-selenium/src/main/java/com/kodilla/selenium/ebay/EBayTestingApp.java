package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.pl");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchLaptop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gh-ac")));
        searchLaptop.sendKeys("Laptop");
        searchLaptop.submit();
        Thread.sleep(500);
        driver.quit();
    }
}
