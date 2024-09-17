package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaPomApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        KodillaLoginPom kodillaLoginPom = new KodillaLoginPom(driver);
        driver.navigate().to("https://kodilla.com/pl/test/login");
        kodillaLoginPom.login("test@kodilla.com", "haslo");
//        kodillaLoginPom.quit();
    }
}
