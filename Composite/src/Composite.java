import java.util.ArrayList;

public class Composite extends Component{
    private ArrayList<Component> children = new ArrayList<>();

    @Override
    void addChild(Component component) {
        children.add(component);
    }

    @Override
    void operation() {
        System.out.println("Operation in object " + this);
        for (Component component : children) {
            component.operation();
        }
    }
}
