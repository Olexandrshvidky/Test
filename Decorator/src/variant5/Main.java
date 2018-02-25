package variant5;

import variant5.decoraters.RedDecorator;
import variant5.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        RedDecorator redDecorator = new RedDecorator(rectangle);
        User user = new User(redDecorator);
        System.out.println("Done.");
    }
}
