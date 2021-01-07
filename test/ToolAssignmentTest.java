import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToolAssignmentTest {
    private final Plumber plumber = new Plumber(1L);
    private final Tool tool = new Tool(1L);
    private final ToolAssignment toolAssignment = new ToolAssignment(1L, plumber, tool);

    @Test
    public void testCreatingToolAssignment() {
        Plumber plumber = new Plumber(1L);
        Tool tool = new Tool(1L);
        ToolAssignment toolAssignment = new ToolAssignment(1L, plumber, tool);
        assertEquals(plumber,toolAssignment.getPlumber());
        assertEquals(tool,toolAssignment.getTool());
        assertEquals(Long.valueOf(1L),toolAssignment.getToolAssignmentId());
    }

    @Test
    public void testSettingPlumber(){
        Plumber newPlumber = new Plumber(3L);
        toolAssignment.setPlumber(newPlumber);
        assertEquals(newPlumber,toolAssignment.getPlumber());
    }
    @Test
    public void testSettingTool(){
        Tool tool = new Tool(3L);
        toolAssignment.setTool(tool);
        assertEquals(tool,toolAssignment.getTool());
    }


}
