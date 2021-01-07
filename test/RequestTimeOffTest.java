import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class RequestTimeOffTest {

    private RequestTimeOff rtf;

    @Before
    public void setUp() throws Exception {
        rtf = new RequestTimeOff(1,2, new Date(100000), new Date(200000));
    }

    @Test
    public void getStartTime() {
        assertEquals(new Date(100000), rtf.getStartTime());
    }

    @Test
    public void setStartTime() {
        rtf.setStartTime(new Date(150000));
        assertEquals(new Date(150000), rtf.getStartTime());
    }

    @Test
    public void getEndTime() {
        assertEquals(new Date(200000), rtf.getEndTime());
    }

    @Test
    public void setEndTime() {
        rtf.setEndTime(new Date(250000));
        assertEquals(new Date(250000), rtf.getEndTime());
    }

    @Test
    public void getIdRequest() {
        assertEquals(1, rtf.getIdRequest());
    }

    @Test
    public void setIdRequest() {
        rtf.setIdRequest(8);
        assertEquals(8, rtf.getIdRequest());
    }

    @Test
    public void getIdEmployee() {
        assertEquals(2, rtf.getIdEmployee());
    }

    @Test
    public void setIdEmployee() {
        rtf.setIdEmployee(9);
        assertEquals(9, rtf.getIdEmployee());
    }
}