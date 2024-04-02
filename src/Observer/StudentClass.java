package Observer;

public class StudentClass implements Student{
    boolean isLeave;

    public boolean isLeave() {
        return isLeave;
    }

    public void setLeave(boolean leave) {
        isLeave = leave;
    }

    public boolean getLeave()
    {
        return this.isLeave;
    }

    @Override
    public void update(boolean isLeave) {
        this.setLeave(isLeave);
    }
}
