package SimpleFactory;

/**
 * 简单工厂模式
 * <p>
 * 问题：解决如何去实例化对象的问题，以及以后如果有增加，如何维护
 * <p>
 * 通过传入的条件去选择分支，从而动态创建实例化对象
 * <p>
 * 如果有新的运算分支，创建相应的运算类，然后添加实例化分支即可
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
