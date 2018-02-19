public abstract class Component {
    void addChild(Component component) {
        throw new UnsupportedOperationException();
    };
    abstract void operation();
}
