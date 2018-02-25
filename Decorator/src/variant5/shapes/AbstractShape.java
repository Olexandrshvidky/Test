package variant5.shapes;

import variant5.AbstractElement;

public abstract class AbstractShape extends AbstractElement {
    @Override
    public void show() {
        super.show();
        System.out.println("Color " + color);
    }
}
