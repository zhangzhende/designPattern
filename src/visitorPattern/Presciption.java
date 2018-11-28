package visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class Presciption {
    private List<AbstractMedicine> list = new ArrayList<AbstractMedicine>();

    public void accept(AbstractVisitor visitor) {
        Iterator<AbstractMedicine> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(AbstractMedicine medicine) {
        list.add(medicine);
    }

    public void remove(AbstractMedicine medicine) {
        list.remove(medicine);
    }
}
