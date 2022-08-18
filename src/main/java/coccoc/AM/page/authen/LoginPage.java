package coccoc.AM.page.authen;

import coccoc.AM.page.common.CommonPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://testing.qc.coccoc.com/")
public class LoginPage {
//    @FindBy(xpath = "(//a[contains(@href,'https://testing.qc.coccoc.com/user/login')])[1]")
//    private WebElementFacade iconLanguage;
//
//    @FindBy(xpath = "//form[@action='/user/login']//input[@name='email']")
//    private WebElementFacade userName;
//
//    @FindBy(xpath = "//form[@action='/user/login']//input[@name='password']")
//    private WebElementFacade pwd;
//
//    @FindBy(xpath = "//button[text()='Log in']")
//    private WebElementFacade btnLogin;
//
//    public String getLanguage(){
//        return iconLanguage.getAttribute("title");
//    }
//
//    public void changeLanguage(){
//        iconLanguage.click();
//    }
//
//    public void inputEmail(String user){
//        userName.sendKeys(user);
//    }
//
//    public void inputPwd(String pass){
//        pwd.sendKeys(pass);
//    }
//
//    public void clickLogin(){
//        btnLogin.click();
//    }

    public static String iconLanguage = "(//a[contains(@href,'https://testing.qc.coccoc.com/user/login')])[1]";
    public static String xpathEmail = "//form[@action='/user/login']//input[@name='email']";
    public static String xpathPassword = "//form[@action='/user/login']//input[@name='password']";

}
