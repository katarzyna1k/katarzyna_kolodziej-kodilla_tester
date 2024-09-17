package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    KodillaStorePom kodillaStorePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaStorePom = new KodillaStorePom(driver);
    }

    @Test
    void shouldReturnCorrectNumberOftSearchResult() {
        int searchOfNoteBook = kodillaStorePom.searchList("NoteBook");
        int searchSchool = kodillaStorePom.searchList("School");
        int searchBrand = kodillaStorePom.searchList("Brand");
        int searchBusiness = kodillaStorePom.searchList("Business");
        int searchGaming = kodillaStorePom.searchList("Gaming");
        int searchPowerful = kodillaStorePom.searchList("Powerful");
        assertEquals(2, searchOfNoteBook);
        assertEquals(1, searchSchool);
        assertEquals(1, searchBrand);
        assertEquals(0, searchBusiness);
        assertEquals(1, searchGaming);
        assertEquals(0, searchPowerful);
    }

    @ParameterizedTest
    @ValueSource(strings = {"NoteBook", "notebook", "Notebook", "NoTeBoOk", "NOTEBOOK"})
    void testSearch_shouldIgnoreLetterSize(String item) {
        int searchNoteBook = kodillaStorePom.searchList(item);
        assertEquals(2, searchNoteBook);
    }

    @AfterEach
    public void testDown() {
        kodillaStorePom.quit();
    }


}