
sealed class Person permits Teacher{
    public int id;
    protected String name;
}
non-sealed class Teacher extends Person{}
class Student extends Teacher{}
public class inheritence {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.id  = 1;
        teacher.name = "koko";
        student.id=2;
        student.name = "sambath";
        System.out.println(teacher.id);
        System.out.println(teacher.name);
        System.out.println(student.id);
        System.out.println(student.name);
    }
}

