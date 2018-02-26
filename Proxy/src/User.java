public class User {
    public User(VirtualProxy virtualProxy) {
        System.out.println("In User() " + this);
        String name = "1.png";
//        AbstractImage abstractImage = virtualProxy.loadImage(name);
        SmartLinkProxy smartLinkProxy = new SmartLinkProxy(virtualProxy);
        System.out.println(smartLinkProxy.getColor(name,0, 0));
    }
}
