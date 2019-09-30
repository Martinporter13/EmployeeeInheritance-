import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


        Director director;

        @Before

        public void before() {
            director = new Director("John", "23451", 75000, "Admin", 1000000.00);
        }

        @Test
        public void canGetName() {
            assertEquals("John", director.getName());

        }

        @Test
        public void canGetNINum() {
            assertEquals("23451", director.getNINum());
        }

        @Test
        public void canGetSalary() {
            assertEquals(75000, director.getSalary());
        }

        @Test
        public void canGetDeptName() {
            assertEquals("Admin", director.getDeptName());
        }

        @Test
        public void canGetBudget(){
            assertEquals(1000000, director.getBudget(), 0.01);
        }

        @Test
        public void canRaiseSalary() {
            assertEquals(82500, director.raiseSalary(), 0.01);


        }
        
        @Test
        public void canPayBonus() {
            assertEquals(750, director.payBonus(), 0.01);
        }
    }



