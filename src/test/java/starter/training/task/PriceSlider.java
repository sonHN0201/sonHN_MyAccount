package starter.training.task;

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
import starter.training.page.HomePage;

public class PriceSlider implements Task {
    private final Target element;

    public PriceSlider(Target element) {
        this.element = element;
    }

    public static PriceSlider selectedPrice(){
        return Tasks.instrumented(PriceSlider.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU)
        );
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement slider = driver.findElement(By.xpath("div[class*='slider_wrapper']>div>span:nth-of-type(2)"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider,30,0).build();
        ((Actions) action).perform();
    }
}
