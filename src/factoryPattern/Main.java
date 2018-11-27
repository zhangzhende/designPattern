package factoryPattern;

/**
 * 工厂模式
 * <p>
 * 工厂模式与简单工厂模式：工厂模式更符合开闭原则【即对拓展开放，对修改关闭】，简单工厂模式如果增加新的功能需要修改工厂类，增加判断
 * <p>
 * 而工厂模式只要新增的功能实现接口，不用修改工厂接口，但是判断逻辑放到的用户端。
 */
public class Main {

    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.a = 9;
        oper.b = 3;
        try {
            double result = oper.getResult();
            System.out.print("result:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
