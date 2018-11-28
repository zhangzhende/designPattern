package visitorPattern;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public abstract class AbstractVisitor {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visitor(MedicineA medicine);

    public abstract void visitor(MedicineB medicine);
}
