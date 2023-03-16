package com.librerianacional.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        tags = "@All",
        glue = "com.librerianacional.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class RegisterRunner {

}
