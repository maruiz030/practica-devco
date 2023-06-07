package co.com.practicadevco.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TXT_ERRORMESSAGE = Target.the("Login Error Message").located(By.xpath("//h1[@data-testid='welcomeMessage']"));

}
