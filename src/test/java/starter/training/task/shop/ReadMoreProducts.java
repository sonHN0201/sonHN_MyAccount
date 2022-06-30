package starter.training.task.shop;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.training.help.WaitABit;
import starter.training.page.HomePage;
import starter.training.page.ShopPage;

public class ReadMoreProducts implements Task {
    public static ReadMoreProducts readMore(){
        return Tasks.instrumented(ReadMoreProducts.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU),
                Click.on(ShopPage.READ_MORE_PRODUCTS)
        );
    }
}
