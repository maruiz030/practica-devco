package co.com.practicadevco.stepdefinitions;

import co.com.practicadevco.interactions.NavigateTo;
import co.com.practicadevco.models.LoginData;
import co.com.practicadevco.tasks.CrearTareas;

import co.com.practicadevco.tasks.EliminarTarea;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearTarea {
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        theActorCalled("User").wasAbleTo(NavigateTo.swaglabPage());
    }

    @When("User create elements")
    public void user_attempts_to_create_element() {
        theActorInTheSpotlight().attemptsTo(CrearTareas.crearTareas());
    }

    @When("User eliminate elements")
    public void user_attempts_to_eliminate_element() {
        theActorInTheSpotlight().attemptsTo(EliminarTarea.eliminarTareas());
    }

}
