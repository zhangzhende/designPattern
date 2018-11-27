package abstractFactoryPattern2;

/**
 * Created by Administrator on 2018/11/26 0026.
 */
public abstract class AbstractPizza {
    String name;
    String sauce;
    String cheese;

    public void bake() {
        System.out.println("bake.....");
    }

    public void cut(){
        System.out.println("cut.......");
    }
    public void box(){
        System.out.println("box.......");
    }

    /**
     * 准备原料，但是原料来自原料工厂，
     */
    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

