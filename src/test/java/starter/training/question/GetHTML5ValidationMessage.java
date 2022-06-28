package starter.training.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetHTML5ValidationMessage implements Task {
    private final Target element;
    private static String result;

    public GetHTML5ValidationMessage(Target element) {
        this.element = element;
    }

    public static GetHTML5ValidationMessage getHTML5(Target target) {
        return Tasks.instrumented(GetHTML5ValidationMessage.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement webElement = driver.findElement(By.xpath(element.getCssOrXPathSelector()));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        result = (String) jsExecutor.executeScript("return arguments[0].validationMessage;", webElement);

    }

    public static String getErrorMessage() {
        return result;
    }
}
