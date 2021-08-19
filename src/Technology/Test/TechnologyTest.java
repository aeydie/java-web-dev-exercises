package Technology.Test;

import Technology.Laptop;
import Technology.Computer;
import Technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TechnologyTest {

Computer test_Laptop;
Computer test_SmartPhone;

    @Before
    public void createLaptopObject() {
        test_Laptop = new Laptop(100, true, true, "Samsung");
        test_SmartPhone = new SmartPhone(100, true, false, "black");
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10, .001);
    }

    @Test
    public void checkCameraTrue() {

    }




    }
