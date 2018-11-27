package abstractFactoryPattern2;

/**
 * 具体的pizza，他的原料来自工厂，所以由具体的工厂创建原料
 * Created by Administrator on 2018/11/26 0026.
 */
public class CheesePizza extends AbstractPizza {
    private IPizzaSourceFactory pizzaSourceFactory;

    public CheesePizza(IPizzaSourceFactory pizzaSourceFactory) {
        this.pizzaSourceFactory = pizzaSourceFactory;
        prepare();
    }

    /**
     * 原料由具体工厂创建，
     */
    void prepare() {
        System.out.println("prepare :"+name);
        this.sauce= pizzaSourceFactory.createSauce();
        this.cheese=pizzaSourceFactory.createCheese();
    }

}
