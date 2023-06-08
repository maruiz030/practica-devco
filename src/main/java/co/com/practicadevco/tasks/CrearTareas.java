package co.com.practicadevco.tasks;

import co.com.practicadevco.models.LoginData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.practicadevco.userinterfaces.Editor.*;

public class CrearTareas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_LISTA_TAREA),
                Enter.theValue("Tarea1").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER),
                Enter.theValue("Tarea2").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER),
                Enter.theValue("Tarea3").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER),
                Enter.theValue("Tarea4").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER),
                Enter.theValue("Tarea5").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER),
                Enter.theValue("Tarea6").into(TXT_ADICIONAR_TAREA).thenHit(Keys.ENTER)
        );
    }

    public static CrearTareas crearTareas() {
        return Tasks.instrumented(CrearTareas.class);
    }
}
