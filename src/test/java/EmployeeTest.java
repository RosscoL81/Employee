import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;
import staff.management.Director;
import staff.techStaff.Developer;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;
    Employee employee1;
    Employee employee2;
    Employee employee3;

    @Before
    public void before(){
        employee = new Manager("Mr Smith", "98765432A", 50000, "Financial Admin");
        employee1 = new Director(
                "Mr Reeves",
                "98111111A",
                60000,
                "Financial Admin",
                1000000);
        employee2 = new Developer("Ms Jones", "29384756B", 30000);
        employee3 = new DatabaseAdmin("Mr Mortimer", "44445555C", 25000);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Mr Smith", employee.getName());
        assertEquals("Mr Reeves", employee1.getName());
        assertEquals("Ms Jones", employee2.getName());
        assertEquals("Mr Mortimer", employee3.getName());
    }

    @Test
    public void employeeHasNINumber(){
        assertEquals("98765432A", employee.getNiNumber());
        assertEquals("98111111A", employee1.getNiNumber());
        assertEquals("29384756B", employee2.getNiNumber());
        assertEquals("44445555C", employee3.getNiNumber());

    }

    @Test
    public void employeeHasSalary(){
        assertEquals(50000.0, employee.getSalary(), 0.01);
        assertEquals(60000.0, employee1.getSalary(), 0.01);
        assertEquals(30000.0, employee2.getSalary(), 0.01);
        assertEquals(25000.0, employee3.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(60000, employee.raiseSalary(10000), 0.01);
        assertEquals(70000, employee1.raiseSalary(10000), 0.01);
        assertEquals(40000, employee2.raiseSalary(10000), 0.01);
        assertEquals(35000, employee3.raiseSalary(10000), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, employee.payBonus(), 0.01);
        assertEquals(600, employee1.payBonus(), 0.01);
        assertEquals(300, employee2.payBonus(), 0.01);
        assertEquals(250, employee3.payBonus(), 0.01);

    }
}
