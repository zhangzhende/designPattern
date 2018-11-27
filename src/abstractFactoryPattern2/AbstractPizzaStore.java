package abstractFactoryPattern2;

/**
 * Created by Administrator on 2018/11/26 0026.
 */
public abstract class AbstractPizzaStore {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract AbstractPizza createPizza(String type);
}
