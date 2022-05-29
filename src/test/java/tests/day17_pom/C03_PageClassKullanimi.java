package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C03_PageClassKullanimi {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.facebook.com");


    }
}
