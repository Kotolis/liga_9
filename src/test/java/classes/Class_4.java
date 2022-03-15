package classes;

import org.testng.annotations.*;

public class Class_4 {


    @DataProvider(name = "first_data")
    public Object[][] Data(){
        return new Object[][] {
                {"Test data:", "1 2"},
                {"After", "Method"},
                {"Test data:", "three four"},
                {"Test data:", "true false"}
        };
    }
}


