package PrototypePattern;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private int age;

    private WorkingExperience workingExperience;

    public Resume(String name) {
        this.name = name;
        this.workingExperience = new WorkingExperience();
    }

    private Resume(WorkingExperience working) throws CloneNotSupportedException {
        this.workingExperience= (WorkingExperience) working.clone();
    }

    public void display() {
        System.out.println(name + "  " + sex + "  " + age);
        System.out.println("working:" + this.workingExperience.getTime() + " " + this.workingExperience.getCompany());
    }
    public Object clone() throws CloneNotSupportedException {
        Resume ob=new Resume(this.workingExperience);
        ob.name=this.name;
        ob.sex=this.sex;
        ob.age=this.age;
        return ob;
    }

    public WorkingExperience getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(String time, String company) {
        this.workingExperience.setCompany(company);
        this.workingExperience.setTime(time);
    }

    public void setUserinfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
