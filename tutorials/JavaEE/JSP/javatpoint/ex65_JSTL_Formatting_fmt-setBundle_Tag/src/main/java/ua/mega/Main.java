package ua.mega;

import java.util.ListResourceBundle;

public class Main extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return connects;
    }

    static final Object[][] connects = {
            {"vegetable.Potato", "Potato"},
            {"vegetable.Tomato", "Tomato"},
            {"vegetable.Carrot", "Carrot"},
    };
}
