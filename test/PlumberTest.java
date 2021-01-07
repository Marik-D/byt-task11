import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PlumberTest {
    private  Plumber plumber1;


    @Before
    public void setUp(){
        plumber1 = new Plumber(1L,"some qualifications");
    }
    @Test
    public void testQualifications(){
        String qualifications = "new qualifications";
        plumber1.setQualifications(qualifications);
        assertEquals(qualifications,plumber1.getQualifications());
    }

    @Test
    public void testId(){
       Plumber newPlumber = new Plumber(2L);
       assertEquals(Long.valueOf(2),newPlumber.getPlumberId());
    }

    @Test
    public void testGettingAllPlumbers(){
        assertEquals(new ArrayList<Plumber>(),Plumber.getAllPlumbers());
    }

    @Test
    public void testGettingParticularPlumber(){
        Plumber.getAllPlumbers().add(new Plumber(3L));
        assertTrue(Plumber.getPlumberById(3L).isPresent());
        assertTrue(Plumber.getPlumberById(10L).isEmpty());
    }
}
