package starter.myaccount.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.myaccount.help.WaitABit;
import starter.myaccount.page.HomePage;
import starter.myaccount.page.MyAccountPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MyAccount implements Task {
    final String email;
    final String password;

    public MyAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static MyAccount inputData(String email,String password){
        return Tasks.instrumented(MyAccount.class,email,password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.MY_ACCOUNT),
                Enter.theValue(email).into(MyAccountPage.TXT_EMAIL),
                WaitABit.sleep(8000),
                Enter.theValue(password).into(MyAccountPage.TXT_PASSWORD),
                Click.on(MyAccountPage.BTN_REGISTER)
        );
    }
}
