/**
 * Class for business logic with no reference to other components
 */
public class Leaf extends Component {

    /**
     *
     */
    @Override
    void operation() {
        System.out.println("Operation in object " + this);
    }
}
