import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class EmployeeTest {
    private Employee emp;
    @Before
    public void setUp() throws Exception {
        emp = new Employee(1,"Jan","Kowalski",123123123,"jkowalski","stupidPassword", "jkow@plumbing.com");
    }

    @Test
    public void getIdEmployee() {
        assertEquals(1, emp.getIdEmployee());
    }

    @Test
    public void setIdEmployee() {
        emp.setIdEmployee(2);
        assertEquals(2, emp.getIdEmployee());
    }

    @Test
    public void getFirstName() {
        assertSame("Jan", emp.getFirstName());
    }

    @Test
    public void setFirstName() {
        emp.setFirstName("Andrzej");
        assertSame("Andrzej", emp.getFirstName());
    }

    @Test
    public void getLastName() {
        assertSame("Kowalski", emp.getLastName());
    }

    @Test
    public void setLastName() {
        emp.setLastName("Nowak");
        assertSame("Nowak", emp.getLastName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(123123123, emp.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        emp.setPhoneNumber(321321321);
        assertEquals(321321321, emp.getPhoneNumber());
    }

    @Test
    public void getUsername() {
        assertSame("jkowalski", emp.getUsername());
    }

    @Test
    public void setUsername() {
        emp.setUsername("anowak");
        assertSame("anowak", emp.getUsername());
    }

    @Test
    public void getPassword() {
        assertSame("stupidPassword", emp.getPassword());
    }

    @Test
    public void setPassword() {
        emp.setPassword("Password");
        assertSame("Password", emp.getPassword());
    }

    @Test
    public void getEmail() {
        assertSame("jkow@plumbing.com", emp.getEmail());
    }

    @Test
    public void setEmail() {
        emp.setEmail("anow@plumbing.com");
        assertSame("anow@plumbing.com", emp.getEmail());
    }

    @Test
    public void contact() {
        Contact contactTest = new Contact(5, emp.getIdEmployee());
        assertEquals(contactTest.toString(), emp.contact(5).toString());
    }
}
