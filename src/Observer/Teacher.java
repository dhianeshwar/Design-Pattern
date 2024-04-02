package Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public boolean isLeave;
    public List<Student> interList=new ArrayList<>();

    public void addStudent(Student student)
    {
        this.interList.add(student);
    }
    public void removeStudent(Student student)
    {
        this.interList.remove(student);
    }

    public void setLeave(boolean leave)
    {
        this.isLeave=leave;
        for(Student student:interList)
        {
            student.update(this.isLeave);
        }
    }
}
