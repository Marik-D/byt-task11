import java.util.Objects;

public class Tool {
    private final  Long toolId;
    private String name;
    private String useDescription;

    public Tool(Long toolId, String name, String useDescription) {
        this.toolId = toolId;
        this.name = name;
        this.useDescription = useDescription;
    }

    public Tool(Long toolId) {
        this.toolId = toolId;
    }

    public Long getToolId() {
        return toolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseDescription() {
        return useDescription;
    }

    public void setUseDescription(String useDescription) {
        this.useDescription = useDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tool tool = (Tool) o;
        return Objects.equals(toolId, tool.toolId) &&
                Objects.equals(name, tool.name) &&
                Objects.equals(useDescription, tool.useDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toolId, name, useDescription);
    }

    @Override
    public String toString() {
        return "Tool{" +
                "toolId=" + toolId +
                ", name='" + name + '\'' +
                ", useDescription='" + useDescription + '\'' +
                '}';
    }
}
