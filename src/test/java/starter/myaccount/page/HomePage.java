package starter.myaccount.page;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target MY_ACCOUNT = Target.the("").locatedBy(".main-nav>li:nth-of-type(2)>a");
}
