package factoryPattern;


/**
 * 加法运算
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = a + b;
        return result;
    }

}
