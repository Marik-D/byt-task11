import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToolTest {
    private final Tool tool1 = new Tool(1L);


    @Test
    public void testCreatingNewTool(){
        Tool newTool = new Tool(1L,"a","b");
        assertEquals(Long.valueOf(1L),newTool.getToolId());
        assertEquals("a",newTool.getName());
        assertEquals("b",newTool.getUseDescription());
    }
    @Test
    public void testGettingId(){
        Tool newTool = new Tool(3L);
        assertEquals(Long.valueOf(3L),newTool.getToolId());
    }
    @Test
    public void testSettingName(){
        tool1.setName("newname");
        assertEquals("newname",tool1.getName());
    }

    @Test
    public void testSettingUseDescription(){
        tool1.setUseDescription("desc");
        assertEquals("desc",tool1.getUseDescription());
    }

}
