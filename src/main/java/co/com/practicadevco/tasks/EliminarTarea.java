package co.com.practicadevco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.practicadevco.userinterfaces.Editor.*;

public class EliminarTarea implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ELIMINAR_TAREA)
        );
    }

    public static EliminarTarea eliminarTareas() {
        return Tasks.instrumented(EliminarTarea.class);
    }
}
