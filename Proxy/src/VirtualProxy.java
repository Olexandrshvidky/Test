import java.awt.*;

public class VirtualProxy extends AbstractProxy {

    @Override
    public Color getColor(String name, int x, int y) {
        System.out.println("In getColor() " + this);
        return new ConcreteImage(name).getColor(x, y);
    }

    public AbstractImage loadImage(String name) {
        System.out.println("In loadImage() " + this);
        return new ConcreteImage(name);
    }
}
