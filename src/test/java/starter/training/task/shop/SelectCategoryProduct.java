package starter.training.task.shop;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import starter.training.page.HomePage;
import starter.training.page.ShopPage;

public class SelectCategoryProduct implements Task {
    private final Target category;

    public SelectCategoryProduct(Target category) {
        this.category = category;
    }

    public static SelectCategoryProduct selectCategory(Target target){
        return Tasks.instrumented(SelectCategoryProduct.class,target);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SHOP_MENU),
                Click.on(ShopPage.SELECT_CATEGORY),
                Click.on(category)
        );
    }
}
