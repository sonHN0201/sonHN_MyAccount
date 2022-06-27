package starter.myaccount.help;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.myaccount.page.MyAccountPage;

public class GetText implements Question<String> {
    public static GetText displayed() {
        return new GetText();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MyAccountPage.CHECK_EMAIL_BLANK).answeredBy(actor);
    }
}
