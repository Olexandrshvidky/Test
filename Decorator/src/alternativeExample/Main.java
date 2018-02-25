package alternativeExample;

public class Main {
    public static void main(String[] args) {
        Misha misha = new Misha();
        Decorator2 decorator2 = new Decorator2(misha);

        Teacher teacher = new Teacher(misha);
        teacher.interconnect();
    }
}
