package starter.myaccount.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountPage {
    public static Target TXT_EMAIL = Target.the("email input").located(By.id("reg_email"));
    public static Target EMAIL_HTML5_VALIDATION_MESSAGE = Target.the("email input").locatedBy("//input[@id='reg_email']");
    public static Target ERROR_MESSAGE  = Target.the("error message").locatedBy("ul[class*='error']>li");
    public static Target TXT_PASSWORD = Target.the("password input").located(By.id("reg_password"));
    public static Target BTN_REGISTER = Target.the("register button").located(By.name("register"));
    public static Target CHECK_REGISTER_SUCCESSFUL = Target.the("check register successful").locatedBy("div[class*='MyAccount']>p>a:nth-of-type(3)");


}
