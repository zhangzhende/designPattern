package abstractFactoryPattern2;

/**
 * 创建原料的工厂，抽象，
 * Created by Administrator on 2018/11/26 0026.
 */
public interface IPizzaSourceFactory {

     String createSauce();

     String createCheese();
}
