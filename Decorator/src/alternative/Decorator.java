package alternative;

public class Decorator extends Misha {

    public Decorator(Student student) {
        this.student = student;
    }

    @Override
    public void look() {
        System.out.println(":) In look() " + this);
        student.look();
        System.out.println(":)");
    }
}
