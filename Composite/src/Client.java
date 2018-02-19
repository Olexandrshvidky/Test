public class Client {
    public Client(Component component) {
        System.out.println("Constructor in object " + this);
        component.operation();
    }
}
