package starter.training.task.shop;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.training.page.HomePage;
import starter.training.page.ShopPage;

public class ViewProductDetails implements Task {
    public static ViewProductDetails viewProduct(){
        return Tasks.instrumented(ViewProductDetails.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU),
                Click.on(ShopPage.VIEW_PRODUCT_DETAILS)
        );
    }
}
