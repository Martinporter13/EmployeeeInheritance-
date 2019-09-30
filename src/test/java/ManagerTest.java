import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before

    public void before() {
        manager = new Manager("Martin", "123456", 40000, "Admin");
    }

    @Test
    public void canGetName() {
        assertEquals("Martin", manager.getName());

    }

    @Test
    public void canGetNINum() {
        assertEquals("123456", manager.getNINum());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Admin", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(44000, manager.raiseSalary(), 0.01);


    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }
}

