package compositePattern;

//财务部，也是一个叶子结点，没有增删部门的能力
public class FinanceDepartment extends AbstractCompany {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany abstractCompany) {

    }

    @Override
    public void remove(AbstractCompany abstractCompany) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
