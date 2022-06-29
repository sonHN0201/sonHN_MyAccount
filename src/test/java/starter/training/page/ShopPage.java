package starter.training.page;

import net.serenitybdd.screenplay.targets.Target;

public class ShopPage {
    public static Target RIGHT_BUTTON = Target.the("right button").locatedBy("div[class*='slider_wrapper']>div>span:nth-of-type(2)");
    public static Target LEFT_BUTTON = Target.the("left button").locatedBy("div[class*='slider_wrapper']>div>span:nth-of-type(1)");
    public static Target BTN_FILTER = Target.the("filter button").locatedBy("//button[@type='submit']");
}
