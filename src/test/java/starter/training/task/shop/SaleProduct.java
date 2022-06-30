package starter.training.task.shop;

import net.jodah.failsafe.internal.HalfOpenState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import starter.training.help.WaitABit;
import starter.training.page.HomePage;
import starter.training.page.ShopPage;

public class SaleProduct implements Task {
    public static SaleProduct selectSaleProduct(){
        return Tasks.instrumented(SaleProduct.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU),
                WaitABit.sleep(5000),
                Click.on(ShopPage.SALE_PRODUCTS)
        );
    }
}
