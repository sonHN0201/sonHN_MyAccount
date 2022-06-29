package starter.training.page;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target MY_ACCOUNT = Target.the("My account menu").located(By.id("menu-item-50"));
    public static Target SHOP_MENU = Target.the("Shop menu").located(By.id("menu-item-40"));
}
