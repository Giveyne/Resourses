package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_fr  extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "This is franch text"},
            {"background", Color.black}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
