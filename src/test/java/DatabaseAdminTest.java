import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {databaseAdmin = new DatabaseAdmin("Jude Navarro", 878432, 35000.00);}

    @Test
    public void canGetDatabaseAdminName() {
        assertEquals("Jude Navarro", databaseAdmin.getName());
    }

    @Test
    public void canGetDataBaseAdminNINumber() {
        assertEquals(878432, databaseAdmin.getNINumber());
    }

    @Test
    public void canGetDatabaseAdminSalary() {
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseDatabaseAdminSalary() {
        assertEquals(38500.00, databaseAdmin.raiseSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(35350.00, databaseAdmin.payBonus(), 0.0);
    }
}
