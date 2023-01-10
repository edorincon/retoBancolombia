package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPage extends PageObject {

    public static final Target INPUT_USER = Target.the("input Usuario").located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the("input Contraseña").located(By.name("password"));

    public static final Target SUBMIT = Target.the("button the submit").located(By.xpath("//button[@type='submit']"));

    // Text Box
    public static final Target TEXT_BOX = Target.the("go to the Text Box").located(By.xpath("(//span)[text()='Text Box']"));
    public static final Target INPUT_FULL_NAME = Target.the("input Full Name").located(By.id("userName"));
    public static final Target INPUT_EMAIL = Target.the("input Email").located(By.id("userEmail"));
    public static final Target INPUT_CURRENT_ADDRESS = Target.the("input Current Address").located(By.id("currentAddress"));
    public static final Target INPUT_PERMANENT_ADDRESS = Target.the("input Permanent Address").located(By.id("permanentAddress"));
    public static final Target TEXT_BOX_SUBMIT = Target.the("button the submit").located(By.id("submit"));


    // Check Box
    public static final Target CHECK_BOX = Target.the("go to the Check Box").located(By.xpath("(//span)[text()='Check Box']"));
    public static final Target SHOW_DIRECTORY_HOME = Target.the("Show directory home").located(By.xpath("(//button)[@title='Toggle']"));
    public static final Target SHOW_DIRECTORY_DOCUMENTS = Target.the("Show directory documents").located(By.xpath("(//button)[@title='Toggle'][3]"));
    public static final Target SHOW_DIRECTORY_OFFICE = Target.the("Show directory office").located(By.xpath("(//button)[@title='Toggle'][5]"));
    public static final Target CHECK_FILE = Target.the("Check file").located(By.xpath("(//span)[@class='rct-checkbox'][7]"));


    //Radio Button
    public static final Target RADIO_BUTTON = Target.the("go to the Radio Button").located(By.xpath("(//span)[text()='Radio Button']"));
    public static final Target SELECT_RADIO_YES = Target.the("Radio Button Yes").located(By.xpath("(//label)[text()='Yes']"));
    public static final Target SELECT_RADIO_IMPRESSIVE = Target.the("Radio Button Impressive").located(By.xpath("(//label)[text()='Impressive']"));


    //Web Tables
    public static final Target WEB_TABLES = Target.the("go to the Web Tables").located(By.xpath("(//span)[text()='Web Tables']"));
    public static final Target ADD_WEB_TABLES = Target.the("button the add").located(By.id("addNewRecordButton"));
    public static final Target EDIT_WEB_TABLES = Target.the("button the edit").located(By.xpath("(//span)[@title='Edit'][1]"));
    public static final Target DELETE_WEB_TABLES = Target.the("button the delete").located(By.xpath("(//span)[@title='Delete'][1]"));
    public static final Target INPUT_FIRST_NAME_WEB_TABLES = Target.the("input First Name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME_WEB_TABLES = Target.the("input Last Name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL_WEB_TABLES = Target.the("input Email").located(By.id("userEmail"));
    public static final Target INPUT_AGE_WEB_TABLES = Target.the("input Age").located(By.id("age"));
    public static final Target INPUT_SALARY_WEB_TABLES = Target.the("input Salary").located(By.id("salary"));
    public static final Target INPUT_DEPARTMENT_WEB_TABLES = Target.the("input Department").located(By.id("department"));
    public static final Target SUBMIT_WEB_TABLES = Target.the("button the submit").located(By.id("submit"));


    //Buttons
    public static final Target BUTTONS = Target.the("go to the Buttons").located(By.xpath("(//span)[text()='Buttons']"));
    public static final Target BUTTON_DOUBLE_CLICK = Target.the("go to the Double Click Me").located(By.id("doubleClickBtn"));
    public static final Target BUTTON_RIGHT_CLICK = Target.the("go to the Right Click Me").located(By.xpath("rightClickBtn"));
    public static final Target BUTTON_CLICK = Target.the("go to the Click Me").located(By.xpath("(//button)[text()='Click Me']"));


    //Links
    public static final Target LINKS = Target.the("go to the Links").located(By.xpath("(//span)[text()='Links']"));


    //Broken Links - Images
    public static final Target BROKEN_LINKS_IMAGES = Target.the("go to the Broken Links - Images").located(By.xpath("(//span)[text()='Broken Links - Images']"));


    //Upload and Download
    public static final Target UPLOAD_AND_DOWNLOAD = Target.the("go to the Upload and Download").located(By.xpath("(//span)[text()='Upload and Download']"));


    //Dynamic Properties
    public static final Target DYNAMIC_PROPERTIES = Target.the("go to the Dynamic Properties").located(By.xpath("(//span)[text()='Dynamic Properties']"));


}
