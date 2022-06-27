package starter.myaccount.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.myaccount.help.DateHelper;
import starter.myaccount.help.GetHTML5;
import starter.myaccount.help.Question;
import starter.myaccount.page.MyAccountPage;
import starter.myaccount.page.NavigateWebsite;
import starter.myaccount.task.RegisterAccount;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@ExtendWith(SerenityJUnit5Extension.class)
public class MyAccountAndRegistration {
    @CastMember(name = "sonHN")
    Actor sonHN;

    @Test
    @Title("Verify that the user will be successfully registered and will be navigated to the Home page")
    public void tc_01() throws Exception {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateWebsite()));

        when(sonHN).attemptsTo(RegisterAccount.inputData("ngocson" + DateHelper.getDateToDay("ddHHmm") + "@gmail.com", "sonhn23@gmail.com12"));

        then(sonHN).should(
                seeThat("Check registration successful", WebElementQuestion.the(MyAccountPage.CHECK_REGISTER_SUCCESSFUL), isVisible())
        );
    }

    @Test
    @Title("Verify that user registration must fail with a warning message (i.e. You must enter a valid email address)")
    public void tc_02() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateWebsite()));

        when(sonHN).attemptsTo(RegisterAccount.inputData("son112", "Huynhngocson123@^"));

        then(sonHN).should(
                seeThat("Check the displayed error message", WebElementQuestion.the(),isVisible()
        ));
    }

    @Test
    @Title("Verify that user registration must fail with an empty email field (i.e. please provide a valid email address)")
    public void tc_03() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateWebsite()));

        when(sonHN).attemptsTo(RegisterAccount.inputData("", "Huynhngocson123@^"));

        then(sonHN).attemptsTo(
                Ensure.that(Question.errorMessage()).isEqualTo("Error: Please provide a valid email address.")
        );
    }

    @Test
    @Title("Verify that user registration failed with password field blank (i.e. please enter account password)")
    public void tc_04() throws Exception {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateWebsite()));

        when(sonHN).attemptsTo(RegisterAccount.inputData("ngocson" + DateHelper.getDateToDay("ddHHmm") + "@gmail.com", ""));

        then(sonHN).attemptsTo(
                Ensure.that(Question.errorMessage()).isEqualTo("Error: Please enter an account password.")
        );
    }

    @Test
    @Title("Verify that user registration must fail with all fields left blank (i.e. please provide a valid email address)")
    public void tc_05() {
        givenThat(sonHN).attemptsTo(Open.browserOn(new NavigateWebsite()));

        when(sonHN).attemptsTo(RegisterAccount.inputData("", ""));

        then(sonHN).attemptsTo(
                Ensure.that(Question.errorMessage()).isEqualTo("Error: Please provide a valid email address.")
        );
    }
}
