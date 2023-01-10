package org.example.tasks;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.example.userinterfaces.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Cycles implements Task {

    private DataTable dataTable;

    public Cycles(DataTable dataTable) {

        this.dataTable = dataTable;
    }

    public static Cycles the(DataTable dataTable) {

        return Tasks.instrumented(Cycles.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Map<String, String>> data = dataTable.asMaps();

        //CICLO 1
        actor.attemptsTo(
                //Bloque 1
                Click.on(CycleOnePage.INPUT_168),
                Click.on(CycleOnePage.INPUT_150),
                Click.on(CycleOnePage.INPUT_138),
                Click.on(CycleOnePage.INPUT_60),
                Click.on(CycleOnePage.INPUT_156),

                //Bloque 2
                Click.on(CycleOnePage.INPUT_10762),

                //Bloque 3
                SendKeys.of("19/12/2022").into(CycleOnePage.DATE),

                //Bloque 4
                Click.on(CycleOnePage.SELECT),
                Click.on(CycleOnePage.OPTION_6037897),

                //Enviar
                Click.on(CycleOnePage.SUBMIT)
        );

        //CICLO 2
        actor.attemptsTo(
                //Bloque 1
                Click.on(CycleTwoPage.INPUT_31069),

                //Bloque 2
                Click.on(CycleTwoPage.SELECT),
                Click.on(CycleTwoPage.OPTION_89611),

                //Bloque 3
                Enter.theValue("19").into(CycleTwoPage.NUMBER),

                //Bloque 4
                Enter.theValue("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY").into(CycleTwoPage.TEXT_AREA),

                //Enviar
                Click.on(CycleTwoPage.SUBMIT)
        );

        //CICLO 3
        actor.attemptsTo(
                //Bloque 1
                Enter.theValue("ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg").into(CycleThreePage.TEXT_AREA),

                //Bloque 2
                Click.on(CycleThreePage.SELECT),
                Click.on(CycleThreePage.OPTION_3647920),

                //Bloque 3
                Click.on(CycleThreePage.INPUT_168),
                Click.on(CycleThreePage.INPUT_96),

                //Bloque 4
                Click.on(CycleThreePage.INPUT_2261704),

                //Enviar
                Click.on(CycleThreePage.SUBMIT)
        );

        //CICLO 4
        actor.attemptsTo(
                //Bloque 1
                Click.on(CycleFourPage.SELECT),
                Click.on(CycleFourPage.OPTION_2005208),

                //Bloque 2
                Click.on(CycleFourPage.INPUT_3740),

                //Bloque 3
                Clear.field(CycleFourPage.TEXT_AREA),
                Enter.theValue("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm").into(CycleFourPage.TEXT_AREA),

                //Bloque 4
                Click.on(CycleFourPage.INPUT_72),
                Click.on(CycleFourPage.INPUT_176),
              //  Click.on(CycleFourPage.INPUT_94),

                //Enviar
                Click.on(CycleFourPage.SUBMIT)
        );


    }
}
