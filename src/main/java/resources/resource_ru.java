package resources;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_ru  extends ListResourceBundle {
    private static final Object[][] contents = {
            {"somevalue", "Это русский текст"},
            {"background", Color.black}
    };
    @Override
    public Object[][] getContents() {
        return contents;
    }
}
