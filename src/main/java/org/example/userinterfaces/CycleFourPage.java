package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CycleFourPage extends PageObject {

    //CICLO 4

    //Bloque 1
    public static final Target SELECT = Target.the("select").located(By.name("select"));
    public static final Target OPTION_2005208 = Target.the("option 2005208").located(By.xpath("//option[@value='2005208']"));

    //Bloque 2
    public static final Target INPUT_3740 = Target.the("input -3740").located(By.xpath("//input[@value='-3740']"));

    //Bloque 3
    public static final Target TEXT_AREA = Target.the("text area").located(By.name("text"));

    //Bloque 4
    public static final Target INPUT_72 = Target.the("input 72").located(By.xpath("//input[@value='72']"));
    public static final Target INPUT_176 = Target.the("input 176").located(By.xpath("//input[@value='176']"));

    //Enviar
    public static final Target SUBMIT = Target.the("button the submit").located(By.xpath("//button[@type='submit']"));

}
