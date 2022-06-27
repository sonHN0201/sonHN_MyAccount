package starter.myaccount.page;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {
    public static Target TXT_EMAIL = Target.the("email input").locatedBy("//input[@id='reg_email']");
    public static Target CHECK_EMAIL_BLANK  = Target.the("email input").locatedBy("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong");
    public static Target TXT_PASSWORD = Target.the("password input").locatedBy("//input[@id='reg_password']");
    public static Target BTN_REGISTER = Target.the("register button").locatedBy("//input[@name='register']");
    public static Target CHECK_REGISTER_SUCCESSFUL = Target.the("check register successful").locatedBy("div[class*='MyAccount']>p>a:nth-of-type(3)");
}
