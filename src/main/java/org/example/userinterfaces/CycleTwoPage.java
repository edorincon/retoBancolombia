package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CycleTwoPage extends PageObject {

    //CICLO 2

    //Bloque 1
    public static final Target INPUT_31069 = Target.the("input 31069").located(By.xpath("//input[@value='31069']"));

    //Bloque 2
    public static final Target SELECT = Target.the("select").located(By.name("select"));
    public static final Target OPTION_89611 = Target.the("option 89611").located(By.xpath("//option[@value='89611']"));



    //Bloque 3
    public static final Target NUMBER = Target.the("number").located(By.name("number"));



    //Bloque 4
    public static final Target TEXT_AREA = Target.the("text area").located(By.name("text"));


    //Enviar
    public static final Target SUBMIT = Target.the("button the submit").located(By.xpath("//button[@type='submit']"));

}
