import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ManagerTest {
    private Manager manager;
    @Before
    public void setUp() throws Exception {
        manager = new Manager(1,"Jan","Kowalski",123123123,"jkowalski","stupidPassword", "jkow@plumbing.com");
    }

    @Test
    public void getIdEmployee() {
        assertEquals(Long.valueOf(1), manager.getIdEmployee());
    }

    @Test
    public void setIdEmployee() {
        manager.setIdEmployee(Long.valueOf(2));
        assertEquals(Long.valueOf(2), manager.getIdEmployee());
    }

    @Test
    public void getFirstName() {
        assertSame("Jan", manager.getFirstName());
    }

    @Test
    public void setFirstName() {
        manager.setFirstName("Andrzej");
        assertSame("Andrzej", manager.getFirstName());
    }

    @Test
    public void getLastName() {
        assertSame("Kowalski", manager.getLastName());
    }

    @Test
    public void setLastName() {
        manager.setLastName("Nowak");
        assertSame("Nowak", manager.getLastName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(123123123, manager.getPhoneNumber());
    }

    @Test
    public void setPhoneNumber() {
        manager.setPhoneNumber(321321321);
        assertEquals(321321321, manager.getPhoneNumber());
    }

    @Test
    public void getUsername() {
        assertSame("jkowalski", manager.getUsername());
    }

    @Test
    public void setUsername() {
        manager.setUsername("anowak");
        assertSame("anowak", manager.getUsername());
    }

    @Test
    public void getPassword() {
        assertSame("stupidPassword", manager.getPassword());
    }

    @Test
    public void setPassword() {
        manager.setPassword("Password");
        assertSame("Password", manager.getPassword());
    }

    @Test
    public void getEmail() {
        assertSame("jkow@plumbing.com", manager.getEmail());
    }

    @Test
    public void setEmail() {
        manager.setEmail("anow@plumbing.com");
        assertSame("anow@plumbing.com", manager.getEmail());
    }

    @Test
    public void contact() {
        Contact contactTest = new Contact(5, Math.toIntExact(manager.getIdEmployee()));
        assertEquals(contactTest.toString(), manager.contact(5).toString());
    }
}
