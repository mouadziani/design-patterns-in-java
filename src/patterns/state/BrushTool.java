package patterns.state;

public class BrushTool extends Tool
{
    @Override
    String mouseUp()
    {
        return "[Brush state]: Brush ICON";
    }

    @Override
    String mouseDown()
    {
        return "[Brush state]: Draw a line";
    }
}
