package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    AndroidDriver driver;
    ReusableMethods methods = new ReusableMethods(driver);

    public LoginPage(AndroidDriver androidDriver) {
        driver = androidDriver;
    }

    By loginButton = By.xpath("android");

    By image = By.xpath("android");

    public void checkSignInButton() {
        methods.checkElement(loginButton);
    }

    public  void clickLoginButton(){
        methods.click(loginButton);
    }

    public void checkImage(){
        methods.checkElement(image);
    }
}
