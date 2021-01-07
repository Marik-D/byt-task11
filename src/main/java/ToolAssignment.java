public class ToolAssignment {
    private final Long toolAssignmentId;
    private Plumber plumber;
    private Tool tool;

    public ToolAssignment(Long toolAssignmentId, Plumber plumber, Tool tool) {
        this.toolAssignmentId = toolAssignmentId;
        this.plumber = plumber;
        this.tool = tool;
    }

    public ToolAssignment(Long toolAssignmentId) {
        this.toolAssignmentId = toolAssignmentId;
    }

    public Long getToolAssignmentId() {
        return toolAssignmentId;
    }

    public Plumber getPlumber() {
        return plumber;
    }

    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
