import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Merrick", "34567", 30000);
    }

            @Test
            public void canGetName() {
                assertEquals("Merrick", developer.getName());

            }

            @Test
            public void canGetNINum() {
                assertEquals("34567", developer.getNINum());
            }

            @Test
            public void canGetSalary() {
                assertEquals(30000, developer.getSalary());
            }

            @Test
            public void canRaiseSalary() {
                assertEquals(33000, developer.raiseSalary(), 0.01);


            }

            @Test
            public void canPayBonus() {
                assertEquals(300, developer.payBonus(), 0.01);
            }
        }


