package starter.training.task.shop;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import starter.training.help.WaitABit;
import starter.training.page.HomePage;
import starter.training.page.ShopPage;

public class PriceSlider implements Task {
    private final Target element;

    public PriceSlider(Target element) {
        this.element = element;
    }

    public static PriceSlider selectedPrice(Target target){
        return Tasks.instrumented(PriceSlider.class,target);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU)
        );
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement slider1 = driver.findElement(By.xpath(element.getCssOrXPathSelector()));
        WaitABit.sleep(3000);
        Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(slider1, -29, 0).build();
        action.perform();
        actor.attemptsTo(
                Click.on(ShopPage.BTN_FILTER)
        );
    }
}
