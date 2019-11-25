import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr Smith", "98765432A", 50000, "Financial Admin");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Financial Admin", manager.getDeptName());
    }

}
