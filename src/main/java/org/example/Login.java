package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
interface ElementIDs {
    Map<String, String> ID = new HashMap<String, String>() {
        {
            put("btnShowLogin", "btnShowLogin");
            put("txtemaillogin", "txtemaillogin");
            put("txtpass", "txtpass");
            put("btnlogin", "btnlogin");
            put("userdropdown", "userdropdown");
            put("btnlogout", "btnlogout");
            put("txtushoten", "txtushoten");
            put("lbfullname", "lbfullname");
            put("formlogin", "formlogin");
            put("tabsvideo1", "tabsvideo-1");
            put("showvideo1", "showvideo-1");
            put("tabsvideo2", "tabsvideo-2");
            put("tabsvideo3", "tabsvideo-3");
            put("tabsvideo4", "tabsvideo-4");
            put("collapse1", "collapse1");
            put("collapse3", "collapse3");
            put("collapse4", "collapse4");
            put("collapse5", "collapse5");
            put("txrContactFullname", "txrContactFullname");
            put("txrContactEmail", "txrContactEmail");
            put("txrContactPhone", "txrContactPhone");
            put("txrContactDesc", "txrContactDesc");
            put("btnSendContact", "btnSendContact");
        }
    };
}
