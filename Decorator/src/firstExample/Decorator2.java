package firstExample;

public class Decorator2 extends AbstractDecorator{
    private Student student;

    public Decorator2(Student student) {
        this.student = student;
    }

    @Override
    public void look() {
        System.out.println(":( In look() " + this);
        student.look();
        System.out.println(":(");
    }
}