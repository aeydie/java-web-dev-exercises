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
        test_SmartPhone = new SmartPhone(100, true, true, "black");
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10, .001);
    }

    @Test
    public void checkCameraTrue() {
        assertEquals("You can do all of the live meetings you want!", test_Laptop.cameraTrue());
    }

    @Test
    public void checkAddRamMethod() {
        Computer awesomeComputer = new Computer(100, true, true);
        assertEquals(104, awesomeComputer.addRam(4), .001);
    }

    @Test
    public void verifySuperInLaptopConstructor() {
        assertEquals("Thank goodness you have a keyboard!", test_Laptop.keyboardTrue());
    }

    @Test
    public void verifySuperInSmartPhoneConstructor() {
        assertEquals("You can do all of the live meetings you want!", test_SmartPhone.cameraTrue());
    }

    @Test
    public void checksColorChoice() {
        SmartPhone cellphone = new SmartPhone(25000,false, true, "red");
        assertEquals("Your phone will be deliver within 5-7 days!", cellphone.colorChoice());
    }




    }
