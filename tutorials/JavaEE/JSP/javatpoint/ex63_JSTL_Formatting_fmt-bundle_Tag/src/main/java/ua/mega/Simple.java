package ua.mega;

import java.util.ListResourceBundle;

public class Simple extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return connects;
    }

    static final Object[][] connects = {
            {"colour.Violet", "Violet"},
            {"colour.Indigo", "Indigo"},
            {"colour.Blue", "Blue"},
    };
}
