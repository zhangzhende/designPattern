package SimpleFactory;

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (b != 0) {
            result = a / b;
        } else {
            throw new Exception("除数不能为0");
        }
        return result;
    }
}
