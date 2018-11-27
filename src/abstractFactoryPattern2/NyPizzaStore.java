package abstractFactoryPattern2;

/**
 * Created by Administrator on 2018/11/26 0026.
 */
public class NyPizzaStore extends AbstractPizzaStore {


    /**
     * 这里又是一个简单工厂
     * @param type
     * @return
     */
    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza=null;
        IPizzaSourceFactory iPizzaAbstractFactory=new NyPizzaSourceFactory();
        if("cheese".equalsIgnoreCase(type)){
            pizza=new CheesePizza(iPizzaAbstractFactory);
            pizza.setName("cheese");
        }

        return pizza;
    }
}
