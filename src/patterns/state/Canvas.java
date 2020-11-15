package patterns.state;

public class Canvas
{
    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public String mouseUp()
    {
        return currentTool.mouseUp();
    }

    public String mouseDown()
    {
        return currentTool.mouseDown();
    }
}
