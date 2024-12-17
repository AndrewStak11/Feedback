package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Clickable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://new.skillfactory.ru/vyssheye-obrazovaniye?_gl=1*ntrgm4*_gcl_aw*R0NMLjE3MzQxNDM5MzYuQ2owS0NRaUEwLS02QmhDQkFSSXNBRFlxeUxfclYwYW1uaXM4RjMxOE8yRzdKNUpUWVhUcjZhekZ0SlZpalJFME9kdmxBR1dHNzVRSzB0VWFBcU11RUFMd193Y0I.*_gcl_au*NjM3Njc4ODgyLjE3MzM3ODIwNjI.*_ga*MTIzMTc1MzM5NC4xNzMzNzgyMDYz*_ga_X08SF39ELF*MTczNDM5NjU5NC4xNi4xLjE3MzQzOTgxNzYuMjQuMC4w");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#rec776846894 > div > div > div.t396__elem.tn-elem.slide.tn-elem__7768468941710757145602 > a")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}