package compositePattern;

public abstract class AbstractCompany {

    protected String name;

    public AbstractCompany(String name) {
        this.name = name;
    }

    //增
    public abstract void add(AbstractCompany abstractCompany);

    //删
    public abstract void remove(AbstractCompany abstractCompany);

    //展示
    public abstract void display(int depth);

    //履行职责
    public abstract void LineOfDuty();
}
