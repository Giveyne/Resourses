package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_ru  extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "Это русский текст"},
            {"background", Color.black},
            {"Population", new Integer(1000)}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
