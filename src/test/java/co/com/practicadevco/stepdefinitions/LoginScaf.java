package co.com.practicadevco.stepdefinitions;

import co.com.practicadevco.exceptions.AssertionsErrors;
import co.com.practicadevco.interactions.NavigateTo;
import co.com.practicadevco.models.LoginData;
import co.com.practicadevco.questions.ValidateLoginMessage;
import co.com.practicadevco.tasks.LoginWithCredentials;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.xml.soap.SAAJResult;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class LoginScaf {
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        theActorCalled("User").wasAbleTo(NavigateTo.swaglabPage());
    }

    @When("User attempts to login with credentials:")
    public void user_attempts_to_login_with_credentials(List<LoginData> loginData) {
        theActorInTheSpotlight().attemptsTo(LoginWithCredentials.userCredentials(loginData));
    }

    @Then("he should be presented message")
    public void he_should_be_presented_message(List<String> message) {
        theActorInTheSpotlight().should(seeThat(ValidateLoginMessage.withMessage(),
                containsString(message.get(1))).orComplainWith(AssertionsErrors.class,"Not completed"));
    }

}
