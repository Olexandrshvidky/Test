package alternative;

public class Teacher {
    private Student student;

    public Teacher (Student student) {
        this.student = student;
    }

    public void interconnect() {
        System.out.println("In interconnect() " + this);
        student.look();
    }
}
