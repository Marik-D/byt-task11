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
}
