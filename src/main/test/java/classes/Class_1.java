package classes;

import classes.Class_4;
import org.testng.annotations.*;

public class Class_1 {
    @BeforeSuite
    public void bSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public void bClass() {
        System.out.println("BeforeClass");
    }

    @AfterSuite
    public void aSuite() {
        System.out.println("AfterSuite");
    }

    @AfterMethod
    public void aMethod() {
        System.out.println("AfterMethod");
    }

    @Test
    public void test_1() {
        System.out.println("Test");
    }

    @Test(dataProvider = "first_data", dataProviderClass = Class_4.class)
    public void test_2(Object o1, Object o2) {
        if (o1 != "After") {
            System.out.println("Test");
            System.out.println(o1 + " " + o2);
        }
    }
}
