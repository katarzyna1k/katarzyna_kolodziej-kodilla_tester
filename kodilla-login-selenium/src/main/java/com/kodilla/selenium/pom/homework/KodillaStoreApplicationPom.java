package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStoreApplicationPom {
    public static void main(String[] args) {
        System.setProperty("chromedriver.chrome.driver", "chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        KodillaStorePom kodillaStorePom = new KodillaStorePom(driver);
        int notebookListSize = kodillaStorePom.searchList("noteBook");
        int schoolListSize = kodillaStorePom.searchList("School");
        int brandListSize = kodillaStorePom.searchList("Brand");
        int businessListSize = kodillaStorePom.searchList("Business");
        int gamingListSize = kodillaStorePom.searchList("Gaming");
        int powerfulListSize = kodillaStorePom.searchList("Powerful");
        kodillaStorePom.quit();
        System.out.println("List of: notebooks: " + notebookListSize + ", school: " + schoolListSize + ", brand: " + brandListSize + ", business: " + businessListSize + ", gaming: " + gamingListSize + ", powerful: " + powerfulListSize);
    }
}
