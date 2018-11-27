package SimpleFactory;

public class Main {
    /**
     * 简单工厂模式----动态实例化对象
     * @param args
     */
    public static void main(String[] args) {
        Operation oper;
        oper=OperationFactory.createOperation("+");
        oper.a=1;
        oper.b=2;
        try {
            double result=oper.getResult();
            System.out.print("result:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
