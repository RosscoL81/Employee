import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director(
                "Mr Reeves",
                "98111111",
                60000,
                "Financial Admin",
                1000000);
    }

    @Test
    public void hasDeptName(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
