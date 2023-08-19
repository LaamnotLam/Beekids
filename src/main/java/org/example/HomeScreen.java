package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import sun.font.Decoration;

public class HomeScreen extends ClassPath implements ElementIDs {
    @Test
    public void TC_006() {
        verifyElementAttribute(CSS_SELECTORS.get("headerLogo"), "href", EXPECTED_VALUES.get("headerLogo"));
    }
    @Test
    public void TC_007() {
        WebElement headerVebeekids = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerVebeekids")));
        String href = headerVebeekids.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerVebeekids"));
    }

    @Test
    public void TC_008() {
        WebElement headerCuocthi = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerCuocthi")));
        String href = headerCuocthi.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerCuocthi"));
    }

    @Test
    public void TC_009() {
        WebElement headerCuahang = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerCuahang")));
        String href = headerCuahang.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerCuahang"));
    }

    @Test
    public void TC_0010() {
        WebElement headerGoibeexu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerGoibeexu")));
        String href = headerGoibeexu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerGoibeexu"));
    }

    @Test
    public void TC_0011() {
        WebElement headerCauhoithuonggap = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerCauhoithuonggap")));
        String href = headerCauhoithuonggap.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerCauhoithuonggap"));
    }

    @Test
    public void TC_0012() {
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerDaisu")));
        String href = headerDaisu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerDaisu"));
    }

    @Test
    public void TC_0013() {
        WebElement headerTrainghiemngay = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerTrainghiemngay")));
        String href = headerTrainghiemngay.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerTrainghiemngay"));
    }

    @Test
    public void TC_0014() {
        WebElement btnShowLogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin")));
        btnShowLogin.click();
        sleep(500);

        WebElement emailInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtemaillogin")));
        emailInput.sendKeys(INPUT_VALUE.get("emailInput"));
        WebElement passwordInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtpass")));
        passwordInput.sendKeys(INPUT_VALUE.get("passwordInput"));
        sleep(500);

        WebElement btnlogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogin")));
        btnlogin.click();
        sleep(500);

        boolean isBtnShowLoginDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin"))).isDisplayed();
        Assert.assertFalse(isBtnShowLoginDisplayed);
    }

    @Test
    public void TC_0015() {
        WebElement btnShowLogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin")));
        btnShowLogin.click();
        sleep(500);

        WebElement emailInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtemaillogin")));
        emailInput.sendKeys(INPUT_VALUE.get("emailInput"));
        WebElement passwordInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtpass")));
        passwordInput.sendKeys(INPUT_VALUE.get("passwordInput"));
        sleep(500);

        WebElement btnlogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogin")));
        btnlogin.click();
        sleep(500);

        WebElement userdropdown = chromeDriver.findElement(By.id(ElementIDs.ID.get("userdropdown")));
        userdropdown.click();
        sleep(500);

        WebElement btnlogout = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogout")));
        btnlogout.click();
        sleep(500);

        boolean isBtnShowLoginDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin"))).isDisplayed();
        Assert.assertTrue(isBtnShowLoginDisplayed);
    }

    @Test
    public void TC_0016() {
        WebElement btnShowLogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin")));
        btnShowLogin.click();
        sleep(2000);

        WebElement emailInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtemaillogin")));
        emailInput.sendKeys(INPUT_VALUE.get("emailInput"));
        WebElement passwordInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtpass")));
        passwordInput.sendKeys(INPUT_VALUE.get("passwordInput"));
        sleep(2000);

        WebElement btnlogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogin")));
        btnlogin.click();
        sleep(2000);

        WebElement userdropdown = chromeDriver.findElement(By.id(ElementIDs.ID.get("userdropdown")));
        userdropdown.click();
        sleep(2000);

        WebElement headerThongtintaikhoan = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerThongtintaikhoan")));
        headerThongtintaikhoan.click();
        sleep(2000);

        scrollDown(700);
        sleep(2000);
        WebElement txtushoten = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtushoten")));
        txtushoten.clear();
        String randomUsername = randomUsername();
        txtushoten.sendKeys(randomUsername);
        sleep(2000);

        WebElement btnUpdate = chromeDriver.findElement(By.id("btnUpdate"));
        btnUpdate.click();
        sleep(2000);

        WebElement popupThanhcong = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("popupThanhcong")));
        popupThanhcong.click();
        sleep(2000);

        chromeDriver.navigate().refresh();
        sleep(2000);

        String lbfullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("lbfullname"))).getText();
        sleep(2000);

        Assert.assertEquals(lbfullname, randomUsername);
    }

    @Test
    public void TC_0017() {
        WebElement btnShowLogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin")));
        btnShowLogin.click();
        sleep(500);

        WebElement emailInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtemaillogin")));
        emailInput.sendKeys(INPUT_VALUE.get("emailInput"));
        WebElement passwordInput = chromeDriver.findElement(By.id(ElementIDs.ID.get("txtpass")));
        passwordInput.sendKeys(INPUT_VALUE.get("passwordInput"));
        sleep(500);

        WebElement btnlogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogin")));
        btnlogin.click();
        sleep(500);

        WebElement userdropdown = chromeDriver.findElement(By.id(ElementIDs.ID.get("userdropdown")));
        userdropdown.click();
        sleep(500);

        WebElement btnlogout = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnlogout")));
        btnlogout.click();
        sleep(500);

        boolean userdropdown1 = chromeDriver.findElement(By.id(ElementIDs.ID.get("userdropdown"))).isDisplayed();
        Assert.assertFalse(userdropdown1);
    }

    @Test
    public void TC_0018() {
        WebElement btnShowLogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnShowLogin")));
        btnShowLogin.click();
        sleep(500);

        boolean formlogin = chromeDriver.findElement(By.id(ElementIDs.ID.get("formlogin"))).isDisplayed();
        Assert.assertTrue(formlogin);
    }

    @Test
    public void TC_0019() {
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("headerGiohang")));
        String href = headerDaisu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("headerGiohang"));
    }

    @Test
    public void TC_0020() {
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("blockBannertopChplay")));
        String href = headerDaisu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("blockBannertopChplay"));
    }

    @Test
    public void TC_0021() {
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("blockBannertopAppstore")));
        String href = headerDaisu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("blockBannertopAppstore"));
    }

    @Test
    public void TC_0022() {
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("blockBannertopBkidsApp")));
        String href = headerDaisu.getAttribute("href");
        Assert.assertEquals(href, EXPECTED_VALUES.get("blockBannertopBkidsApp"));
    }

    @Test
    public void TC_0023() {
        sleep(1000);
        WebElement headerDaisu = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("blockBannertopVideo")));
        String href = headerDaisu.getAttribute("data-video");
        System.out.println(href);
        Assert.assertEquals(href, EXPECTED_VALUES.get("blockBannertopVideo"));
    }

    @Test
    public void TC_0024() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo1")));
        anchorElement.click();
        sleep(1000);
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo1"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo1"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("sectionVideo1Text"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0025() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo1")));
        anchorElement.click();
        sleep(1000);
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("showvideo1"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Video = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo1Video"))).getAttribute("src");
            Assert.assertEquals(sectionVideo1Video, EXPECTED_VALUES.get("sectionVideo1Video"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0026() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo2")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo2"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo2"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("sectionVideo2Text"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0027() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo2")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo2"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo2Video = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo2Img"))).getAttribute("src");
            Assert.assertEquals(sectionVideo2Video, EXPECTED_VALUES.get("sectionVideo2Img"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0028() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo3")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo3"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo3"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("sectionVideo3Text"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0029() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo3")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo3"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo2Video = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo3Video"))).getAttribute("src");
            Assert.assertEquals(sectionVideo2Video, EXPECTED_VALUES.get("sectionVideo3Video"));
        }
    }

    @Test
    public void TC_0030() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo4")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo4"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo4"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("sectionVideo4Text"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0031() {
        scrollDown(1800);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo4")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("tabsvideo4"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo2Video = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionVideo4Img"))).getAttribute("src");
            Assert.assertEquals(sectionVideo2Video, EXPECTED_VALUES.get("sectionVideo4Img"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0032() {
        scrollDown(3400);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("section2Button1")));
        anchorElement.click();
        sleep(1000);
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse1"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse1"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("section2Text1"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0033() {
        scrollDown(3400);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("section2Button2")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse3"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse3"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("section2Text2"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0034() {
        scrollDown(3400);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("section2Button3")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse4"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse4"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("section2Text3"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0035() {
        scrollDown(3400);
        sleep(1000);

        WebElement anchorElement = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("section2Button4")));
        anchorElement.click();
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse5"))).getCssValue("display");
        if (isAnchorElementDisplayed.equals("block")) {
            String sectionVideo1Text = chromeDriver.findElement(By.id(ElementIDs.ID.get("collapse5"))).getText();
            Assert.assertEquals(sectionVideo1Text, EXPECTED_VALUES.get("section2Text4"));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void TC_0036() {
        scrollDown(3400);
        sleep(1000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("section2Video"))).getAttribute("src");
        Assert.assertEquals(isAnchorElementDisplayed, EXPECTED_VALUES.get("section2Video"));
    }

    @Test
    public void TC_0037() {
        scrollDown(5300);
        sleep(3000);

        String isAnchorElementDisplayed = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionCommentsVideo"))).getAttribute("src");
        Assert.assertEquals(isAnchorElementDisplayed, EXPECTED_VALUES.get("sectionCommentsVideo"));
    }

    @Test
    public void TC_0038() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifyCopy"));
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "a");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "c");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        String expectedValue = INPUT_VALUE.get("verifyCopy") + INPUT_VALUE.get("verifyCopy");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0039() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifySpace"));
        sleep(500);

        String expectedValue = INPUT_VALUE.get("verifySpace");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0040() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname"))).getCssValue("text-transform");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textTransformNone"));
    }

    @Test
    public void TC_0041() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname"))).getCssValue("text-align");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textAlignStart"));
    }

    @Test
    public void TC_0042() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname"))).getCssValue("text-indent");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textIndent0px"));
    }

    @Test
    public void TC_0043() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname"))).getCssValue("cursor");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("cursorText"));
    }

    @Test
    public void TC_0044() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname"))).getCssValue("text-shadow");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textShadow"));
    }

    @Test
    public void TC_0045() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifyCopy"));
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "a");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "c");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        String expectedValue = INPUT_VALUE.get("verifyCopy") + INPUT_VALUE.get("verifyCopy");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0046() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifySpace"));
        sleep(500);

        String expectedValue = INPUT_VALUE.get("verifySpace");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0047() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail"))).getCssValue("text-transform");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textTransformNone"));
    }

    @Test
    public void TC_0048() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail"))).getCssValue("text-align");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textAlignStart"));
    }

    @Test
    public void TC_0049() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail"))).getCssValue("text-indent");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textIndent0px"));
    }

    @Test
    public void TC_0050() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail"))).getCssValue("cursor");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("cursorText"));
    }

    @Test
    public void TC_0051() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail"))).getCssValue("text-shadow");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textShadow"));
    }

    @Test
    public void TC_0052() {
        scrollDown(6100);
        sleep(3000);

        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        sleep(500);
        txrContactPhone.sendKeys(INPUT_VALUE.get("verifyNumber"));
        sleep(500);
        String txrContactPhone1 = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone"))).getAttribute("value");
        Assert.assertEquals(txrContactPhone1, EXPECTED_VALUES.get("verifyNumber"));
    }

    @Test
    public void TC_0053() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifyCopy"));
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "a");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "c");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        String expectedValue = INPUT_VALUE.get("verifyCopy") + INPUT_VALUE.get("verifyCopy");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0054() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifySpace"));
        sleep(500);

        String expectedValue = INPUT_VALUE.get("verifySpace");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0055() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone"))).getCssValue("text-transform");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textTransformNone"));
    }

    @Test
    public void TC_0056() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone"))).getCssValue("text-align");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textAlignStart"));
    }

    @Test
    public void TC_0057() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone"))).getCssValue("text-indent");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textIndent0px"));
    }

    @Test
    public void TC_0058() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone"))).getCssValue("cursor");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("cursorText"));
    }

    @Test
    public void TC_0059() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("text-shadow");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textShadow"));
    }

    @Test
    public void TC_0060() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifyCopy"));
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "a");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "c");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        txrContactFullname.sendKeys(Keys.CONTROL + "v");
        sleep(500);
        String expectedValue = INPUT_VALUE.get("verifyCopy") + INPUT_VALUE.get("verifyCopy");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0061() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("verifySpace"));
        sleep(500);

        String expectedValue = INPUT_VALUE.get("verifySpace");
        String actualValue = txrContactFullname.getAttribute("value");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void TC_0062() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("text-transform");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textTransformNone"));
    }

    @Test
    public void TC_0063() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("text-align");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textAlignStart"));
    }

    @Test
    public void TC_0064() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("text-indent");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textIndent0px"));
    }

    @Test
    public void TC_0065() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("cursor");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("cursorText"));
    }

    @Test
    public void TC_0066() {
        scrollDown(6200);
        sleep(3000);

        String txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc"))).getCssValue("text-shadow");
        sleep(500);
        Assert.assertEquals(txrContactFullname, EXPECTED_VALUES.get("textShadow"));
    }

    @Test
    public void TC_0067() {
        scrollDown(5800);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconSuccess"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteSuccess"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextSuccess"));
    }

    @Test
    public void TC_0068() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenBlank"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarning"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningFullname"));
    }

    @Test
    public void TC_0069() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenInvalid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarningData"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningData"));
    }

    @Test
    public void TC_0070() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailInvalid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarning"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningEmail"));
    }

    @Test
    public void TC_0071() {
        scrollDown(6200);
        sleep(5000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailBlank"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(5000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(5000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarning"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningEmailBlank"));
        sleep(5000);
    }

    @Test
    public void TC_0072() {
        scrollDown(6200);
        sleep(5000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiInvalid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarningData"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningPhoneBlank"));
    }

    @Test
    public void TC_0073() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiBlank"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungValid"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarning"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningPhoneBlank"));
    }

    @Test
    public void TC_0074() {
        scrollDown(6200);
        sleep(3000);

        WebElement txrContactFullname = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactFullname")));
        txrContactFullname.sendKeys(INPUT_VALUE.get("contactHoTenValid"));
        WebElement txrContactEmail = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactEmail")));
        txrContactEmail.sendKeys(INPUT_VALUE.get("contactEmailValid"));
        WebElement txrContactPhone = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactPhone")));
        txrContactPhone.sendKeys(INPUT_VALUE.get("contactSodienthoaiValid"));
        WebElement txrContactDesc = chromeDriver.findElement(By.id(ElementIDs.ID.get("txrContactDesc")));
        txrContactDesc.sendKeys(INPUT_VALUE.get("contactNoidungBlank"));
        sleep(2000);

        WebElement btnSendContact = chromeDriver.findElement(By.id(ElementIDs.ID.get("btnSendContact")));
        btnSendContact.click();
        sleep(2000);

        boolean contactIconSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactIconWarning"))).isDisplayed();
        Assert.assertTrue(contactIconSuccess);
        String contactTiteSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactTite"))).getText();
        Assert.assertEquals(contactTiteSuccess, EXPECTED_VALUES.get("contactTiteWarning"));
        String contactTextSuccess = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("contactText"))).getText();
        Assert.assertEquals(contactTextSuccess, EXPECTED_VALUES.get("contactTextWarningDescBlank"));
    }

    @Test
    public void TC_0075() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionappButton"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("sectionappButton"));
    }

    @Test
    public void TC_0076() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionappChPlay"))).getAttribute("src");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("sectionappChPlay"));
    }

    @Test
    public void TC_0077() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionappAppStore"))).getAttribute("src");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("sectionappAppStore"));
    }

    @Test
    public void TC_0078() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("sectionappWebsite"))).getAttribute("src");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("sectionappWebsite"));
    }

    @Test
    public void TC_0079() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerFacebookBlackIcon"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerFacebookBlackIcon"));
    }

    @Test
    public void TC_0080() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerLinkedinBlackIcon"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerLinkedinBlackIcon"));
    }

    @Test
    public void TC_0081() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerYoutubeBlackIcon"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerYoutubeBlackIcon"));
    }

    @Test
    public void TC_0082() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerTiktokBlackIcon"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerTiktokBlackIcon"));
    }

    @Test
    public void TC_0083() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerFacebookGreenIcon"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerFacebookGreenIcon"));
    }

    @Test
    public void TC_0084() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerAppStore"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerAppStore"));
    }

    @Test
    public void TC_0085() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerGooglePlay"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerGooglePlay"));
    }

    @Test
    public void TC_0086() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerWebsite"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerWebsite"));
    }

    @Test
    public void TC_0087() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerPhuongPhap"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerPhuongPhap"));
    }

    @Test
    public void TC_0088() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerCauhoi"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerCauhoi"));
    }

    @Test
    public void TC_0089() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerChinhSach"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerChinhSach"));
    }

    @Test
    public void TC_0090() {
        scrollDown(7000);
        sleep(3000);

        String sectionappButton = chromeDriver.findElement(By.cssSelector(CSS_SELECTORS.get("footerDieuKhoan"))).getAttribute("href");
        Assert.assertEquals(sectionappButton, EXPECTED_VALUES.get("footerDieuKhoan"));
    }

    @AfterMethod
    public void CleanUp() {
        System.out.println("Kết_Thúc");
        chromeDriver.quit();
    }

}
