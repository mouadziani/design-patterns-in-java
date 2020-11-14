package state;

public class BrushTool extends Tool
{
    @Override
    void mouseUp()
    {
        System.out.println("[Brush state]: Brush ICON");
    }

    @Override
    void mouseDown()
    {
        System.out.println("[Brush state]: Draw a line");
    }
}
