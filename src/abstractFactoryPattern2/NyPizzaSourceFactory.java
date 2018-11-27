package abstractFactoryPattern2;

/**
 * 具体创建原料的工厂，每种原料都有具体的创建方法
 * Created by Administrator on 2018/11/26 0026.
 */
public class NyPizzaSourceFactory implements IPizzaSourceFactory {
    public String createSauce() {
        return "NY sause";
    }

    public String createCheese() {
        return "NY cheese";
    }
}
