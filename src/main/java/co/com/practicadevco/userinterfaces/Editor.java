package co.com.practicadevco.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Editor {
    public static final Target BTN_LISTA_TAREA = Target.the("UsernameText Box ").located(By.id("tasklist-tab"));
    public static final Target TXT_ADICIONAR_TAREA = Target.the("UsernameText Box ").located(By.id("my-list"));
    public static final Target BTN_ELIMINAR_TAREA = Target.the("UsernameText Box ").located(By.xpath("//img[@class='me-2 remove_list_item']"));
}
