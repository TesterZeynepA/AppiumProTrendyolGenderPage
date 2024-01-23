package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OfferPage {
    AndroidDriver driver;
    ReusableMethods methods = new ReusableMethods(driver);

    public OfferPage(AndroidDriver androidDriver) {
        driver = androidDriver;
    }

    By offerText = By.xpath("android");

    public void checkOfferPage(){
        methods.checkElement(offerText);
    }

}
