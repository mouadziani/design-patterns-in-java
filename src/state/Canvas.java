package state;

public class Canvas
{
    private Tool currentTool;

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseUp()
    {
        currentTool.mouseUp();
    }

    public void mouseDown()
    {
        currentTool.mouseDown();
    }
}
