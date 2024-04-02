package Observer;

public class ObserverMain {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        StudentClass student1=new StudentClass();
        StudentClass student2=new StudentClass();
        StudentClass student3=new StudentClass();

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);

        teacher.setLeave(true);

        System.out.println(student1.getLeave());
        System.out.println(student2.getLeave());
        System.out.println(student3.getLeave());

    }
}
