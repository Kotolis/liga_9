package classes;

import org.testng.annotations.*;

public class Class_3 {

    @BeforeTest
    public void bTest() {
       System.out.println("BeforeTest");
    }

    @AfterTest
    public void aTest(){
        System.out.println("AfterTest");
    }

    @AfterMethod
    public void aMethod() {
        System.out.println("AfterMethod");
    }

    @Test
    public void test_5() {
        System.out.println("Test");
    }

}
