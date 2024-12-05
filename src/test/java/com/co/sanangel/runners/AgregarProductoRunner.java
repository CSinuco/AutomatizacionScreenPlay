package com.co.sanangel.runners;


import com.co.sanangel.utils.BeforeSuite;
import com.co.sanangel.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@AgregarCarrito",
        glue = "com.co.sanangel.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(RunnerPersonalizado.class)
public class AgregarProductoRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/agregarProducto.feature");
    }
}
