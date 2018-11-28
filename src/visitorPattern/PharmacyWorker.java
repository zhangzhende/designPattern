package visitorPattern;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class PharmacyWorker extends AbstractVisitor {
    @Override
    public void visitor(MedicineA medicine) {
        System.out.println("PharmacyWorker " + name + " take medicine " + medicine.getName());
    }

    @Override
    public void visitor(MedicineB medicine) {
        System.out.println("PharmacyWorker " + name + " take medicine " + medicine.getName());
    }
}
