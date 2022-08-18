package coccoc.common;

import coccoc.AM.page.common.CommonPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.core.environment.ConfiguredEnvironment.getConfiguration;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;


public class CommonSteps extends PageObject {

    WebElementFacade element;

    public void openBrowser(){
        open();
    }

    public String getDefaultBaseUrl() {
        String baseUrl = "";
        if (isNotEmpty(getConfiguration().getBaseUrl())) {
            baseUrl = getConfiguration().getBaseUrl();
        }
        return baseUrl;
    }

    public void openBrowserWithURL(String url){
        openUrl(url);
    }

    public void highlightElement(String xpath) {
        try {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px solid red'",
                    findBy(xpath));
        } catch (Exception e) {

        }
    }

    public void clickOnElement(String xpath){
        highlightElement(xpath);
        element(xpath).waitUntilClickable().click();
    }

    public void sendKeyToElement(String xpath, String value){
        element(xpath).click();
        element(xpath).clear();
        element(xpath).sendKeys(value);
    }

    public String getText(String xpath){
        return element(xpath).getText();
    }

    public String getAttributeValue(String xpath, String attribute){
        return element(xpath).getAttribute(attribute);
    }

    public void clickButton(String button, int index){
        clickOnElement(String.format(CommonPage.xpathButton, button, index));
    }

    public void clickOnButton(String button){
        clickButton(button, 1);
    }

}
