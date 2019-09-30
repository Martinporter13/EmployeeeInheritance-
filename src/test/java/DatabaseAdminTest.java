import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Billy", "67890", 45000);
    }

    @Test
    public void canGetName() {
        assertEquals("Billy",  databaseAdmin.getName());

    }

    @Test
    public void canGetNINum() {
        assertEquals("67890", databaseAdmin.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(45000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(49500, databaseAdmin.raiseSalary(), 0.01);


    }

    @Test
    public void canPayBonus() {
        assertEquals(450, databaseAdmin.payBonus(), 0.01);
    }
}




