package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ClassPath {
    ChromeDriver chromeDriver;
    public static final String websiteURL = "https://beekids.edu.vn/";

    @BeforeMethod
    public void Setup() {
        System.out.println("Bắt_Đầu");
        // Set up data
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.get(websiteURL);
        chromeDriver.manage().window().maximize();
        sleep(3000);
    }
    public static final Map<String, String> CSS_SELECTORS = new HashMap<>();

    static {
        CSS_SELECTORS.put("headerLogo", "#ctl01 > header > div > nav > a");
        CSS_SELECTORS.put("headerVebeekids", "#menu-main > ul > li.nav-item.menu-check.notdrop.active > a");
        CSS_SELECTORS.put("headerCuocthi", "#menu-main > ul > li:nth-child(2) > a");
        CSS_SELECTORS.put("headerCuahang", "#menu-main > ul > li:nth-child(3) > a");
        CSS_SELECTORS.put("headerGoibeexu", "#menu-main > ul > li:nth-child(4) > a");
        CSS_SELECTORS.put("headerCauhoithuonggap", "#menu-main > ul > li:nth-child(5) > a");
        CSS_SELECTORS.put("headerDaisu", "#menu-main > ul > li:nth-child(6) > a");
        CSS_SELECTORS.put("headerTrainghiemngay", "#menu-main > ul > li:nth-child(7) > a");
        CSS_SELECTORS.put("headerGiohang", "#ctl01 > header > div > nav > ul > li > a");
        CSS_SELECTORS.put("headerThongtintaikhoan", "#divInfoMe > ul > li > div > a:nth-child(2)");
        CSS_SELECTORS.put("popupThanhcong", "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button");
        CSS_SELECTORS.put("blockBannertopChplay", "#block-bannertop > div > div > div.col-sm-12.col-lg-7 > div > div.content-2 > div > div > a:nth-child(1)");
        CSS_SELECTORS.put("blockBannertopAppstore", "#block-bannertop > div > div > div.col-sm-12.col-lg-7 > div > div.content-2 > div > div > a:nth-child(2)");
        CSS_SELECTORS.put("blockBannertopBkidsApp", "#block-bannertop > div > div > div.col-sm-12.col-lg-7 > div > div.content-2 > div > div > a:nth-child(3)");
        CSS_SELECTORS.put("blockBannertopVideo", "#block-bannertop > div > div > div.col-sm-12.col-lg-7 > div > div.content-2 > div > div > a.btn.btn-video");
        CSS_SELECTORS.put("sectionVideo1", "#video-tabs > div:nth-child(1) > div.card-header > button");
        CSS_SELECTORS.put("sectionVideo1Video", "#showvideo-1 > video");
        CSS_SELECTORS.put("sectionVideo2", "#video-tabs > div:nth-child(2) > div.card-header > button");
        CSS_SELECTORS.put("sectionVideo2Img", "#showvideo-2 > img");
        CSS_SELECTORS.put("sectionVideo3", "#video-tabs > div:nth-child(3) > div.card-header > button");
        CSS_SELECTORS.put("sectionVideo3Video", "#showvideo-3 > video");
        CSS_SELECTORS.put("sectionVideo4", "#video-tabs > div:nth-child(4) > div.card-header > button");
        CSS_SELECTORS.put("sectionVideo4Img", "#showvideo-4 > img");
        CSS_SELECTORS.put("section2Video1", "#video-tabs > div:nth-child(1) > div.card-header > button");
        CSS_SELECTORS.put("section2Video1Video", "#showvideo-1 > video");
        CSS_SELECTORS.put("section2Video2", "#video-tabs > div:nth-child(2) > div.card-header > button");
        CSS_SELECTORS.put("section2Video2Img", "#showvideo-2 > img");
        CSS_SELECTORS.put("section2Video3", "#video-tabs > div:nth-child(3) > div.card-header > button");
        CSS_SELECTORS.put("section2Video3Video", "#showvideo-3 > video");
        CSS_SELECTORS.put("section2Video4", "#video-tabs > div:nth-child(4) > div.card-header > button");
        CSS_SELECTORS.put("section2Video4Img", "#showvideo-4 > img");
        CSS_SELECTORS.put("section2Button1", "#accordion > div:nth-child(1) > div.card-header > button");
        CSS_SELECTORS.put("section2Button2", "#accordion > div:nth-child(2) > div.card-header > button");
        CSS_SELECTORS.put("section2Button3", "#accordion > div:nth-child(3) > div.card-header > button");
        CSS_SELECTORS.put("section2Button4", "#accordion > div:nth-child(4) > div.card-header > button");
        CSS_SELECTORS.put("section2Video", "#section-2 > div > div.row > div.col-12.col-lg-6.col-xl-7 > div > video");
        CSS_SELECTORS.put("sectionCommentsButton", "#movie_player > div.ytp-cued-thumbnail-overlay > button");
        CSS_SELECTORS.put("sectionCommentsVideo", "#section-comments > div > div.row.align-items-center > div.col-lg-6.col-xl-5 > div > div > iframe");
        CSS_SELECTORS.put("contactIconSuccess", "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-icon.swal-icon--success");
        CSS_SELECTORS.put("contactTite", "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-title");
        CSS_SELECTORS.put("contactText", "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-text");
        CSS_SELECTORS.put("contactIconWarning", "body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-icon.swal-icon--warning");
        CSS_SELECTORS.put("sectionappButton", "#section-app > div > div > div.col-lg-6.wow.fadeInLeft.animated > div.block-app > div.button.mt-5.mb-5 > a");
        CSS_SELECTORS.put("sectionappChPlay", "#section-app > div > div > div.col-lg-6.wow.fadeInLeft.animated > div.list-download > div:nth-child(1) > img");
        CSS_SELECTORS.put("sectionappAppStore", "#section-app > div > div > div.col-lg-6.wow.fadeInLeft.animated > div.list-download > div:nth-child(2) > img");
        CSS_SELECTORS.put("sectionappWebsite", "#section-app > div > div > div.col-lg-6.wow.fadeInLeft.animated > div.list-download > div:nth-child(3) > img");
        CSS_SELECTORS.put("footerFacebookBlackIcon", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(1) > div.footer-block.social > a:nth-child(1)");
        CSS_SELECTORS.put("footerLinkedinBlackIcon", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(1) > div.footer-block.social > a:nth-child(2)");
        CSS_SELECTORS.put("footerYoutubeBlackIcon", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(1) > div.footer-block.social > a:nth-child(3)");
        CSS_SELECTORS.put("footerTiktokBlackIcon", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(1) > div.footer-block.social > a:nth-child(4)");
        CSS_SELECTORS.put("footerFacebookGreenIcon", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div.col-12.col-md > div > div:nth-child(2) > a");
        CSS_SELECTORS.put("footerAppStore", "#section-footer > div.footer-top > div > div > div.col-lg-4 > div > div > div:nth-child(1) > a");
        CSS_SELECTORS.put("footerGooglePlay", "#section-footer > div.footer-top > div > div > div.col-lg-4 > div > div > div:nth-child(2) > a");
        CSS_SELECTORS.put("footerWebsite", "#section-footer > div.footer-top > div > div > div.col-lg-4 > div > div > div:nth-child(3) > a");
        CSS_SELECTORS.put("footerPhuongPhap", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(2) > div > ul > li:nth-child(1) > a");
        CSS_SELECTORS.put("footerCauhoi", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(2) > div > ul > li:nth-child(2) > a");
        CSS_SELECTORS.put("footerChinhSach", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(2) > div > ul > li:nth-child(3) > a");
        CSS_SELECTORS.put("footerDieuKhoan", "#section-footer > div.footer-top > div > div > div.col-lg-8 > div.row > div:nth-child(2) > div > ul > li:nth-child(4) > a");

        CSS_SELECTORS.put("", "");

    }

    public static final Map<String, String> ID = new HashMap<>();

    static {
        ID.put("btnShowLogin", "btnShowLogin");
        ID.put("txtemaillogin", "txtemaillogin");
        ID.put("txtpass", "txtpass");
        ID.put("btnlogin", "btnlogin");
        ID.put("userdropdown", "userdropdown");
        ID.put("btnlogout", "btnlogout");
        ID.put("txtushoten", "txtushoten");
        ID.put("lbfullname", "lbfullname");
        ID.put("formlogin", "formlogin");
        ID.put("tabsvideo1", "tabsvideo-1");
        ID.put("showvideo1", "showvideo-1");
        ID.put("tabsvideo2", "tabsvideo-2");
        ID.put("tabsvideo3", "tabsvideo-3");
        ID.put("tabsvideo4", "tabsvideo-4");
        ID.put("collapse1", "collapse1");
        ID.put("collapse3", "collapse3");
        ID.put("collapse4", "collapse4");
        ID.put("collapse5", "collapse5");
        ID.put("txrContactFullname", "txrContactFullname");
        ID.put("txrContactEmail", "txrContactEmail");
        ID.put("txrContactPhone", "txrContactPhone");
        ID.put("txrContactDesc", "txrContactDesc");
        ID.put("btnSendContact", "btnSendContact");
    }

    public static final Map<String, String> EXPECTED_VALUES = new HashMap<>();

    static {
        EXPECTED_VALUES.put("headerLogo", "https://beekids.edu.vn/");
        EXPECTED_VALUES.put("headerVebeekids", "https://beekids.edu.vn/");
        EXPECTED_VALUES.put("headerCuocthi", "https://beekids.edu.vn/cuoc-thi");
        EXPECTED_VALUES.put("headerCuahang", "https://beekids.edu.vn/cua-hang");
        EXPECTED_VALUES.put("headerGoibeexu", "https://beekids.edu.vn/goi-beexu");
        EXPECTED_VALUES.put("headerCauhoithuonggap", "https://beekids.edu.vn/cau-hoi-thuong-gap");
        EXPECTED_VALUES.put("headerDaisu", "https://beekids.edu.vn/dai-su");
        EXPECTED_VALUES.put("headerTrainghiemngay", "https://bkids.edu.vn/");
        EXPECTED_VALUES.put("headerGiohang", "https://beekids.edu.vn/gio-hang");
        EXPECTED_VALUES.put("blockBannertopChplay", "https://play.google.com/store/apps/details?id=com.dragold.bkids");
        EXPECTED_VALUES.put("blockBannertopAppstore", "https://apps.apple.com/vn/app/bkids/id1534126323");
        EXPECTED_VALUES.put("blockBannertopBkidsApp", "https://bkids.edu.vn/");
        EXPECTED_VALUES.put("blockBannertopVideo", "https://www.youtube.com/embed/Cw111KXOny4");
        EXPECTED_VALUES.put("sectionVideo1Text", "Giúp giáo viên không chuyên công nghệ thiết kế giảng dạy và tương tác với Học viên hiệu quả tại Trường hoặc online tại Nhà.");
        EXPECTED_VALUES.put("sectionVideo1Video", "https://beekids.edu.vn/video/Beekids-LoTrinh.mp4");
        EXPECTED_VALUES.put("sectionVideo2Text", "Chương trình học tập dài hạn 12 tháng hay 24 tháng dễ dàng được Trẻ hấp thu hiệu quả chỉ với 20 phút tương tác mỗi ngày.");
        EXPECTED_VALUES.put("sectionVideo2Img", "https://beekids.edu.vn/images/img-video-2.png");
        EXPECTED_VALUES.put("sectionVideo3Text", "Xây dựng nội dung cuộc thi và chia sẻ đến học viên cùng đăng ký tham gia, tổng kết và trao giải ngay.");
        EXPECTED_VALUES.put("sectionVideo3Video", "https://beekids.edu.vn/video/Beekids-GiaiCuuDo.mp4");
        EXPECTED_VALUES.put("sectionVideo4Text", "Chia sẻ tình hình học tập và hướng dẫn Phụ Huynh giúp Trẻ rèn luyện thêm tại nhà thông qua chương trình bài học và bài tập được sắp xếp sẵn.");
        EXPECTED_VALUES.put("sectionVideo4Img", "https://beekids.edu.vn/images/img-video-4.png");
        EXPECTED_VALUES.put("section2Text1", "Giúp kiểm soát được tình trạng thừa thiếu nhân sự ở mỗi vị trí và bảng lương tại mọi thời điểm của năm.");
        EXPECTED_VALUES.put("section2Text2", "Giáo viên đơn giản để kết nối, tương tác và báo cáo kết quả đến Phụ Huynh thông qua ứng dụng \"Sổ liên lạc online\" trên điện thoại di động.");
        EXPECTED_VALUES.put("section2Text3", "Tự động hóa hệ thống kiểm kê, tính toán giúp hạn chế sai sót và giảm thiểu nhân lực cho các đơn vị.");
        EXPECTED_VALUES.put("section2Text4", "Báo cáo các số liệu thông qua biểu đồ định kỳ. Giúp các Trung tâm, Trường mầm non dễ dàng so sánh một cách trực quan.");
        EXPECTED_VALUES.put("section2Video", "https://beekids.edu.vn/video/Beekids-HeThongQuanLyNoiBo.mp4");
        EXPECTED_VALUES.put("sectionCommentsVideo", "https://www.youtube.com/embed/pk56RWmXG2w");
        EXPECTED_VALUES.put("textTransformNone", "none");
        EXPECTED_VALUES.put("textAlignStart", "start");
        EXPECTED_VALUES.put("textIndent0px", "0px");
        EXPECTED_VALUES.put("cursorText", "text");
        EXPECTED_VALUES.put("textShadow", "none");
        EXPECTED_VALUES.put("verifyNumber", "123");
        EXPECTED_VALUES.put("contactTiteSuccess", "Thành công");
        EXPECTED_VALUES.put("contactTextSuccess", "Cảm ơn bạn đã liên hệ với chúng tôi.");
        EXPECTED_VALUES.put("contactTiteWarning", "Cảnh báo");
        EXPECTED_VALUES.put("contactTextWarningFullname", "Vui lòng nhập họ và tên của bạn.");
        EXPECTED_VALUES.put("contactTextWarningEmail", "Email bạn nhập không đúng định dạng.");
        EXPECTED_VALUES.put("contactTextWarningEmailBlank", "Vui lòng nhập email của bạn.");
        EXPECTED_VALUES.put("contactTextWarningPhoneBlank", "Vui lòng nhập số điện thoại của bạn.");
        EXPECTED_VALUES.put("contactTextWarningDescBlank", "Vui lòng nhập nội dung liên hệ.");
        EXPECTED_VALUES.put("contactTiteWarningData", "Đã có lỗi xảy ra");
        EXPECTED_VALUES.put("contactTextWarningData", "Lỗi hệ thống");
        EXPECTED_VALUES.put("sectionappButton", "https://bkids.edu.vn/");
        EXPECTED_VALUES.put("sectionappChPlay", "https://beekids.edu.vn/images/ma-qr-ch.png");
        EXPECTED_VALUES.put("sectionappAppStore", "https://beekids.edu.vn/images/ma-qr-app.png");
        EXPECTED_VALUES.put("sectionappWebsite", "https://beekids.edu.vn/images/ma-qr-web.png");
        EXPECTED_VALUES.put("footerFacebookBlackIcon", "https://www.facebook.com/beekids.edu.vn");
        EXPECTED_VALUES.put("footerLinkedinBlackIcon", "https://www.linkedin.com/company/beekids-learning-gamification-platform/");
        EXPECTED_VALUES.put("footerYoutubeBlackIcon", "https://www.youtube.com/channel/UC4P8FkBzpZGEbABKweYWZ6g");
        EXPECTED_VALUES.put("footerTiktokBlackIcon", "https://www.tiktok.com/@beekids_education");
        EXPECTED_VALUES.put("footerFacebookGreenIcon", "https://www.facebook.com/beekids.edu.vn");
        EXPECTED_VALUES.put("footerAppStore", "https://apps.apple.com/vn/app/bkids/id1534126323");
        EXPECTED_VALUES.put("footerGooglePlay", "https://play.google.com/store/apps/details?id=com.dragold.bkids");
        EXPECTED_VALUES.put("footerWebsite", "https://bkids.edu.vn/");
        EXPECTED_VALUES.put("footerPhuongPhap", "https://beekids.edu.vn/hinh-thuc-thanh-toan");
        EXPECTED_VALUES.put("footerCauhoi", "https://beekids.edu.vn/cau-hoi-thuong-gap");
        EXPECTED_VALUES.put("footerChinhSach", "https://beekids.edu.vn/chinh-sach-bao-mat");
        EXPECTED_VALUES.put("footerDieuKhoan", "https://beekids.edu.vn/dieu-khoan-su-dung");



    }

    public static final Map<String, String> INPUT_VALUE = new HashMap<>();

    static {
        INPUT_VALUE.put("emailInput", "nguyenbaolamht123@gmail.com");
        INPUT_VALUE.put("passwordInput", "123456");
        INPUT_VALUE.put("contactHoTenValid", "Lâm");
        INPUT_VALUE.put("contactHoTenInvalid", "hdsjhjsahjkansadghjksadbnsmadhasjkhdsanbdsakbdasjkldbsanmdsabdjkd");
        INPUT_VALUE.put("contactHoTenBlank", "");
        INPUT_VALUE.put("contactEmailValid", randomEmail());
        INPUT_VALUE.put("contactEmailInvalid", "nguyenbaolamht123");
        INPUT_VALUE.put("contactEmailBlank", "");
        INPUT_VALUE.put("contactSodienthoaiValid", "0837521651");
        INPUT_VALUE.put("contactSodienthoaiInvalid", "1234567");
        INPUT_VALUE.put("contactSodienthoaiBlank", "");
        INPUT_VALUE.put("contactNoidungValid", "Không có");
        INPUT_VALUE.put("contactNoidungBlank", "");
        INPUT_VALUE.put("verifyCopy", "Cam kết mang lại sự an tâm và hài lòng cho Quý Khách");
        INPUT_VALUE.put("verifySpace", "");
        INPUT_VALUE.put("verifyNumber", "-abc123");
    }

    public static String randomEmail() {
        return UUID.randomUUID().toString().replace("-", "") + "@gmail.com";
    }
    public static String randomUsername() {
        int desiredLength = 5;
        return UUID.randomUUID().toString().substring(0, desiredLength);
    }
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void scrollDown(int pixels) {
        JavascriptExecutor je = (JavascriptExecutor) chromeDriver;
        je.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
    public void verifyElementAttribute(String selector, String attributeName, String expectedValue) {
        WebElement element = chromeDriver.findElement(By.cssSelector(selector));
        String actualValue = element.getAttribute(attributeName);
        Assert.assertEquals(actualValue, expectedValue);
    }
//    public void clickElementWithId(String id) {
//        chromeDriver.findElement(By.id(ID.get(id))).click();
//    }
//    private void clickElementWithCssSelector(String cssSelector) {
//        chromeDriver.findElement(By.cssSelector(cssSelector)).click();
//    }
}
