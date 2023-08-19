package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Main
{
    ChromeDriver chromeDriver;
    String websiteURL = "https://beekids.edu.vn/";
    @Test
    public void TC_008() {
        chromeDriver.get(websiteURL);

        List<WebElement> List_Header = chromeDriver.findElements(By.className("nav-link"));
        String List_Header_CuocThi = null;
        int i = 0;
        for (WebElement src : List_Header) {
            if (i == 1) {
                List_Header_CuocThi = src.getAttribute("href");
                break;
            }
            i++;
        }
        Assert.assertEquals(List_Header_CuocThi, "https://beekids.edu.vn/cuoc-thi");
    }
}