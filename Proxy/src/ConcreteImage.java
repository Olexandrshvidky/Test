import java.awt.*;

public class ConcreteImage extends AbstractImage{
    public ConcreteImage(String name) {
        System.out.println("In ConcreteImage() " + this);
        /*try {
            Scanner scanner = new Scanner(new File(name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public Color getColor(String name, int x, int y) {
        /*System.out.println("In getColor() " + this);
        return Color.BLACK;*/
        throw new UnsupportedOperationException();
    }

    public Color getColor(int x, int y) {
        System.out.println("In getColor() " + this);
        return Color.BLACK;
    }
}
