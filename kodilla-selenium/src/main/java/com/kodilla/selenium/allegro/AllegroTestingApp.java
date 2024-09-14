package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katar\\selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--remote-debugging-port=9222");
        //chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl");


        WebElement mavicMiniElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'czego')]"));
        mavicMiniElement.sendKeys("Mavic mini");

        WebElement allegroElement = driver.findElement(By.xpath("//*[@label='Kategorie']/option[3]"));
        Select elektronika = new Select(allegroElement);
        elektronika.selectByVisibleText("Elektronika");
    }
}
