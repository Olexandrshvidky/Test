package alternative;

public class Misha extends Student {
    protected Student student;
    @Override
    public void look() {
        System.out.println("in look() " + this);
    }
}
