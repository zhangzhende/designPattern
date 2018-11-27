package compositePattern;

//人力资源部，是一个叶子结点，他没有增删部分的能力
public class HRDepartment extends AbstractCompany {

    public HRDepartment(String name) {
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
        System.out.println(name + "招聘员工，培训");
    }
}
