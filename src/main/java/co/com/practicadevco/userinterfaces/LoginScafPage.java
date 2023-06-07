package co.com.practicadevco.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScafPage {
    public static final Target BTN_INICIAR_SESION = Target.the("UsernameText Box ").located(By.xpath("//a[@class='btn scaf-accept-btn']"));
    public static final Target TXT_USERNAME = Target.the("UsernameText Box ").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("PasswordText Box ").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.xpath("//input[@type='submit']"));
}
