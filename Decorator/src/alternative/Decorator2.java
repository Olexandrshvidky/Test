package alternative;

public class Decorator2 extends Misha{
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
