package patterns.state;

public class SelectionTool extends Tool
{
    @Override
    String mouseUp()
    {
        return "[Selection state]: Draw dashed rectangle";
    }

    @Override
    String mouseDown()
    {
        return "[Selection state]: Selection ICON";
    }
}
