package classes;

import org.testng.annotations.*;

public class Class_2 {

    @BeforeClass
    public void bClass() {
        System.out.println("BeforeClass");
    }


    @AfterClass
    public void afClass() {
        System.out.println("AfterClass");
        System.out.println("AfterClass");
    }

    @AfterTest
    public void aTest() {
        System.out.println("AfterTest");
    }



    @Test(invocationCount = 2)
    public void test_3() {
        System.out.println("Test");
    }

    @Test(dataProvider = "first_data", dataProviderClass = Class_4.class)
    public void test_4(Object o1, Object o2) {
        if (o1 != "After"){
            System.out.println("Test");
            System.out.println(o1 + " " + o2);
        } else {
            System.out.println(o1 + "" + o2);
        }

    }


}
