package state;

public class Main
{
    public static void main(String[] args)
    {
        Canvas canvas = new Canvas();

        // Set SelectionTool as current Tool (current state)
        canvas.setCurrentTool(new SelectionTool());

        // Handle mouse up method based on current tool
        canvas.mouseUp();

        // Handle mouse down method based on current tool
        canvas.mouseDown();


        // Change the Current Tool (state) and Set Brush Tool as current Tool (state)
        canvas.setCurrentTool(new BrushTool());

        // Handle mouse up method based on current tool
        canvas.mouseUp();

        // Handle mouse down method based on current tool
        canvas.mouseDown();
    }
}
