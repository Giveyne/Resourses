package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_de extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "This is German"},
            {"background", Color.black}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
