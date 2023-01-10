package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CycleThreePage extends PageObject {

    //CICLO 3

    //Bloque 1
    public static final Target TEXT_AREA = Target.the("text area").located(By.name("text"));

    //Bloque 2
    public static final Target SELECT = Target.the("select").located(By.name("select"));
    public static final Target OPTION_3647920 = Target.the("option 3647920").located(By.xpath("//option[@value='3647920']"));


    //Bloque 3
    public static final Target INPUT_168 = Target.the("input 168").located(By.xpath("//input[@value='168']"));
    public static final Target INPUT_96 = Target.the("input 96").located(By.xpath("//input[@value='96']"));


    //Bloque 4
    public static final Target INPUT_2261704 = Target.the("input 2261704").located(By.xpath("//input[@value='2261704']"));


    //Enviar
    public static final Target SUBMIT = Target.the("button the submit").located(By.xpath("//button[@type='submit']"));

}
