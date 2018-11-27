package compositePattern;

/**
 * 组合模式
 * <p>
 * 指：将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
 * <p>
 * 场景：当发现需求中是体现部分与整体的层次结构时，用户希望可以忽略组合对象和单个对象的不同，统一的使用组合结构中的所有对象时
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        root.display(1);
        root.LineOfDuty();
    }
}
