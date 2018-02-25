package variant5;

import java.awt.*;

public abstract class AbstractElement {
    protected Color color = Color.BLACK;

    public void show() {
        System.out.println("In show() " + this);
    }
}
