package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before
    public void before(){
        System.out.println("System Basladi");

    }
    @After
    public void after(){
        GWD.quitDriver();
    }
}
