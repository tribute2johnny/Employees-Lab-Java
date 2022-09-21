import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {manager = new Manager("Tool Development", "Bill Turner", 766653, 45000.00);}

    @Test
    public void canGetDepartmentName() {
        assertEquals("Tool Development", manager.getDeptName());
    }

    @Test
    public void canGetManagersName() {
        assertEquals("Bill Turner", manager.getName());
    }

    @Test
    public void canGetManagersNI() {
        assertEquals(766653, manager.getNINumber());
    }

    @Test
    public void canGetManagersSalary() {
        assertEquals(45000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseManagersSalary() {
        assertEquals(49500.00, manager.raiseSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(45450.00, manager.payBonus(), 0.0);
    }

}
