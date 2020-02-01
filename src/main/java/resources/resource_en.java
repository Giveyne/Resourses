package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_en  extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "This is English text"},
            {"background", Color.black}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
