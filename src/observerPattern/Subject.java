package observerPattern;


/**
 * 通知者抽象类
 */
public abstract class Subject {
    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void call();

    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }
}
