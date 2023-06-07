package co.com.practicadevco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.practicadevco.userinterfaces.HomePage.TXT_ERRORMESSAGE;

public class ValidateLoginMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_ERRORMESSAGE).answeredBy(actor);
    }

    public static Question<String> withMessage() {
        return new ValidateLoginMessage();
    }
}
