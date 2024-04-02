package Builder;

import Factory.FactoryPatternDemo;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private String fatherName;
    private String motherName;
    private int maths;
    private int science;
    private int social;
    private int english;

    public Student(StudentBuilder studentBuilder) {
        this.name=studentBuilder.name;
        this.age=studentBuilder.age;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    public static class StudentBuilder
    {
        private int rollNo;
        private String name;
        private int age;
        private long phoneNumber;
        private String address;
        private String fatherName;
        private String motherName;
        private int maths;
        private int science;
        private int social;
        private int english;

        public StudentBuilder name(String name)
        {
            this.name=name;
            return this;
        }
        public StudentBuilder fatherName(String fatherName)
        {
            this.fatherName= fatherName;
            return this;
        }
        public StudentBuilder age(int age)
        {
            this.age=age;
            return this;
        }
        public Student build()
        {
            return new Student(this);
        }
    }
}
