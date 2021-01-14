import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToolAssignment that = (ToolAssignment) o;
        return Objects.equals(toolAssignmentId, that.toolAssignmentId) &&
                Objects.equals(plumber, that.plumber) &&
                Objects.equals(tool, that.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolAssignmentId, plumber, tool);
    }

    @Override
    public String toString() {
        return "ToolAssignment{" +
                "toolAssignmentId=" + toolAssignmentId +
                ", plumber=" + plumber +
                ", tool=" + tool +
                '}';
    }
}
