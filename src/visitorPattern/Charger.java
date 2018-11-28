package visitorPattern;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class Charger extends AbstractVisitor {
    @Override
    public void visitor(MedicineA medicine) {
        System.out.println("charger " + name + " to medicine " + medicine.getName() + " set price " + medicine.getPrice());
    }

    @Override
    public void visitor(MedicineB medicine) {
        System.out.println("charger " + name + " to medicine " + medicine.getName() + " set price " + medicine.getPrice());
    }
}
