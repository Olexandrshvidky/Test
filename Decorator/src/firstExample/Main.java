package firstExample;

public class Main {
    public static void main(String[] args) {
        Misha misha = new Misha();
        AbstractDecorator decorator = new Decorator2(misha);

        /**/

        decorator = new Decorator(misha);

        Teacher teacher = new Teacher(decorator);
        teacher.interconnect();
    }
}
