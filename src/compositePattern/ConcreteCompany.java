package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends AbstractCompany {
    private List<AbstractCompany> childrenList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany abstractCompany) {
        childrenList.add(abstractCompany);
    }

    @Override
    public void remove(AbstractCompany abstractCompany) {
        childrenList.remove(abstractCompany);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (AbstractCompany company : childrenList) {
            company.display(depth + 2);
        }
    }

    @Override
    public void LineOfDuty() {
        for (AbstractCompany company : childrenList) {
            company.LineOfDuty();
        }
    }
}
