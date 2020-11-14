package state;

public class SelectionTool extends Tool
{
    @Override
    void mouseUp()
    {
        System.out.println("[Selection state]: Draw dashed rectangle");
    }

    @Override
    void mouseDown()
    {
        System.out.println("[Selection state]: Selection ICON");
    }
}
