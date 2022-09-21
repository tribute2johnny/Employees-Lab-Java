import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {developer = new Developer("Felicity Farseer", 764323, 32000.00);}

    @Test
    public void canGetDevelopersName() {
        assertEquals("Felicity Farseer", developer.getName());
    }

    @Test
    public void canGetDevelopersNINumber() {
        assertEquals(764323, developer.getNINumber());
    }

    @Test
    public void canGetDevelopersSalary() {
        assertEquals(32000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseDevelopersSalary() {
        assertEquals(35200.00, developer.raiseSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(32320.00, developer.payBonus(), 0.0);
    }
}
