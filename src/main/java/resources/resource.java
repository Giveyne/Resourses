package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "This is default"},
            {"background", Color.black}
            {"Population", new Integer(1000)}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
