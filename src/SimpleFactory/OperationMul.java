package SimpleFactory;

/**
 * 乘法运算
 */
public class OperationMul extends  Operation {
    @Override
    public double getResult() {
        double result =0;
        result =a*b;
        return result;

    }
}
