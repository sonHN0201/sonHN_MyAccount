package starter.training.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopPage {
    public static Target SLIDER_RIGHT = Target.the("right button").locatedBy("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]");
    public static Target BTN_FILTER = Target.the("filter button").locatedBy("//button[@type='submit']");
    public static Target SELECT_CATEGORY = Target.the("select category").located(By.className("orderby"));
    public static Target SELECT_SORT_BY_POPULARITY = Target.the("select category").locatedBy(".orderby>option:nth-of-type(2)");
    public static Target SELECT_SORT_BY_AVERAGE_RATINGS = Target.the("select category").locatedBy(".orderby>option:nth-of-type(3)");
    public static Target SELECT_SORT_BY_NEWNESS = Target.the("select category").locatedBy(".orderby>option:nth-of-type(4)");
    public static Target SELECT_SORT_BY_LOW_TO_HIGH_ITEM = Target.the("select category").locatedBy(".orderby>option:nth-of-type(5)");
    public static Target SELECT_SORT_BY_HIGH_TO_LOW_ITEM = Target.the("select category").locatedBy(".orderby>option:nth-of-type(6)");
    public static Target CHECK = Target.the("check product").locatedBy("//*[@id=\"content\"]/ul/li[1]/a[1]/span");
    public static Target VIEW_PRODUCT_DETAILS = Target.the("view product details").locatedBy("ul[class*='products']>li:nth-of-type(1)>a>img");
    public static Target VERIFY_VIEW_PRODUCT_DETAILS = Target.the("view product details").locatedBy("div[class*='entry-summary']>div>div>div>div>p:nth-of-type(1)");
    //Read more product
    public static Target READ_MORE_PRODUCTS = Target.the("read more products").locatedBy("li[class*='post-160']>a:nth-of-type(2)");
    public static Target OUT_OF_STOCK = Target.the("out of stock").locatedBy(".stock");
    public static Target SUBMIT_BUTTON = Target.the("button submit").locatedBy("//button[@type='submit']");
    //Sale product
    public static Target SALE_PRODUCTS = Target.the("sale products").locatedBy("li[class*='post-169']>a>img");
    public static Target OLD_PRICE = Target.the("Old price").locatedBy(".price>del>span");
    public static Target NEW_PRICE = Target.the("new price").locatedBy(".price>ins>span");


}
