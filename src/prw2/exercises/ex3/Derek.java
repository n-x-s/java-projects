package exercises.ex3;

public class Derek {
    private Tool tool;

    void setTool(Tool tool) {
        this.tool = tool;
    }

    private Boolean canHangPainting() {
        return (tool != null) && tool.getName().equalsIgnoreCase("hammer");
    }

    void hangPainting() {
        if ((!canHangPainting())) {
            System.out.println("Derek has no hammer! He can't hang the painting.");
        } else {
            System.out.println("Derek will hang the painting!");
        }
    }
}
