public class Main {
    public static void main(String[] args) {
        Component component = new Composite();
        component.addChild(new Leaf());
        Component component2 = new Composite();
        component2.addChild(component);
        Client client = new Client(component2);
    }
}
