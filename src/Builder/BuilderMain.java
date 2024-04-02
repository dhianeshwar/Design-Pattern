package Builder;

public class BuilderMain {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder()
                .name("dhianesh")
                .age(22)
                .fatherName("balaraman")
                .build();

        System.out.println("name:"+student.getName());
        System.out.println("age:"+student.getAge());
        System.out.println("father name:"+student.getFatherName());

    }
}
