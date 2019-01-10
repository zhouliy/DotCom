import csdnJavaDemos.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1,"张三",23);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
