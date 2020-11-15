package units.state;

import org.junit.Assert;
import org.junit.Test;
import patterns.state.BrushTool;
import patterns.state.Canvas;
import patterns.state.SelectionTool;

public class StatePatternTest extends Assert {

    @Test
    public void should_use_selection_tool_state() {
        Canvas canvas = new Canvas();

        // Set Selection tool as  Current Tool (state)
        canvas.setCurrentTool(new SelectionTool());

        // Handle mouse up method based on current tool
        assertEquals(new String("[Selection state]: Draw dashed rectangle"), canvas.mouseUp());

        // Handle mouse down method based on current tool
        assertEquals(new String("[Selection state]: Selection ICON"), canvas.mouseDown());
    }

    @Test
    public void should_use_brush_tool_state() {
        Canvas canvas = new Canvas();

        // Set Brush tool as  Current Tool (state)
        canvas.setCurrentTool(new BrushTool());

        // Handle mouse up method based on current tool
        assertEquals(new String("[Brush state]: Brush ICON"), canvas.mouseUp());

        // Handle mouse down method based on current tool
        assertEquals(new String("[Brush state]: Draw a line"), canvas.mouseDown());
    }
}
