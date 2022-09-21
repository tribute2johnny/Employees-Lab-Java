import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {director = new Director("Tool Development", "Todd McQuinn", 657456, 60000.00, 750000.00);}

    @Test
    public void canGetDirectorDepartment() {
        assertEquals("Tool Development", director.getDeptName());
    }

    @Test
    public void canGetDirectorName() {
        assertEquals("Todd McQuinn", director.getName());
    }

    @Test
    public void canGetDirectorNINumber() {
        assertEquals(657456, director.getNINumber());
    }

    @Test
    public  void canGetDirectorSalary() {
        assertEquals(60000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(750000.00, director.getBudget(), 0.0);
    }

    @Test
    public  void canRaiseDirectorsSalary() {
        assertEquals(66000.00, director.raiseSalary(), 0.0);
    }

    @Test
    public  void canPayBonus() {
        assertEquals(60600.00, director.payBonus(), 0.0);
    }
}
