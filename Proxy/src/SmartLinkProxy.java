import java.awt.*;
import java.util.HashMap;

public class SmartLinkProxy extends AbstractProxy {
    AbstractImage abstractImage;
    HashMap<Request, Color> cache = new HashMap<>();

    public SmartLinkProxy(AbstractImage abstractImage) {
        this.abstractImage = abstractImage;
    }

    @Override
    public Color getColor(String name, int x, int y) {
        System.out.println("In getColor() " + this);
        Request request = new Request(name, x, y);
        Color color;
        if (cache.containsKey(request)) {
            color = cache.get(request);
        } else {
            color = abstractImage.getColor(name, x, y);
            cache.put(request, color);
        }
        return color;
    }
}
