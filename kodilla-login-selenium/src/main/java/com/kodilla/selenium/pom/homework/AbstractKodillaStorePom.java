package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public abstract class AbstractKodillaStorePom {
    WebDriver driver;

    public AbstractKodillaStorePom(WebDriver driver) {
        this.driver = driver;
    }
}
