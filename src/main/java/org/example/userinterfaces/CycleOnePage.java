package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CycleOnePage extends PageObject {

    //CICLO 1

    //Bloque 1
    public static final Target INPUT_168 = Target.the("input 168").located(By.xpath("//input[@value='168']"));
    public static final Target INPUT_150 = Target.the("input 150").located(By.xpath("//input[@value='150']"));
    public static final Target INPUT_138 = Target.the("input 138").located(By.xpath("//input[@value='138']"));
    public static final Target INPUT_60 = Target.the("input 60").located(By.xpath("//input[@value='60']"));
    public static final Target INPUT_156 = Target.the("input 156").located(By.xpath("//input[@value='156']"));

    //Bloque 2
    public static final Target INPUT_10762 = Target.the("input 10762").located(By.xpath("//input[@value='10762']"));


    //Bloque 3
    public static final Target DATE = Target.the("date").located(By.name("date"));


    //Bloque 4
    public static final Target SELECT = Target.the("select").located(By.name("select"));
    public static final Target OPTION_6037897 = Target.the("option 6037897").located(By.xpath("//option[@value='6037897']"));
    public static final Target SUBMIT = Target.the("button the submit").located(By.xpath("//button[@type='submit']"));



}
