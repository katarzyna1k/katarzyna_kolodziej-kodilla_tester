package com.kodilla.testcontainers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@ExtendWith(org.testcontainers.junit.jupiter.TestcontainersExtension.class)
@Testcontainers
public class MojaWizytowkaTest {

    public Network network = Network.newNetwork();
    public RemoteWebDriver driver;

    @Container
    public GenericContainer container = new GenericContainer(
            new ImageFromDockerfile()
                    .withDockerfile(new File("C:\\KodillaProjekt\\kodilla-course\\kodilla-testcontainers\\src\\test\\resources\\moja_wizytowka\\Dockerfile").toPath()))
            .withNetwork(network)
            .withNetworkAliases("my-app");

    @Container
    public BrowserWebDriverContainer chrome = new BrowserWebDriverContainer<>()
            .withNetwork(network)
            .withCapabilities(new ChromeOptions())
            .withRecordingMode(RECORD_ALL, new File("./build/"))
            .withRecordingFileFactory(new DefaultRecordingFileFactory());

    @BeforeEach
    public void setUpDriver() {
        driver = chrome.getWebDriver();
        driver.get("http://my-app/");
    }

    @AfterEach
    public void testQuit() {
        driver.quit();
    }

    @Test
    public void shouldLoadPicture() throws IOException {

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String imageValue = driver.findElement(By.xpath("//img[@title='Kochankowie']")).getAttribute("src");

        assertTrue(imageValue.contains("https://fastly.picsum.photos/id/1084/536/354.jpg?grayscale&hmac=Ux7nzg19e1q35mlUVZjhCLxqkR30cC-CarVg-nlIf60"));
    }

    @Test
    public void shouldReloadNewPage() throws IOException, InterruptedException {
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        WebElement hrefValue = driver.findElement(By.xpath("//li[a[contains(@href, 'jeja')]]"));
        hrefValue.click();

    }
}
