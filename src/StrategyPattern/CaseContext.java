package StrategyPattern;

/**
 * 上下文对象，维护cashSuper具体的引用对象，看他具体指向那个子类
 */
public class CaseContext {
    private CashSuper cashSuper;

    /**
     * 传入子类对象，具体的实例对象
     *
     * @param cashSuper
     */
    public CaseContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 根据具体的实例对象，调用其方法
     *
     * @param money
     * @return
     */
    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

    /**
     * 结合简单工厂模式的方式
     *
     * @param type
     */
    public CaseContext(String type) {
        switch (type) {
            //0-正常收费
            case "0":
                cashSuper = new CaseNormal();
                break;
            //1-满减
            case "1":
                cashSuper = new CashReturn(300, 100);
                break;
            //2-打折
            case "2":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }
}
