package visitorPattern;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class MedicineB extends AbstractMedicine {
    public MedicineB(String name, double price) {
        super(name, price);
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visitor(this);
    }
}
