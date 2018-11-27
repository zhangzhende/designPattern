package StrategyPattern;

/**
 * 收费的抽象类
 *
 * 子类是各自不同的收费方式，包括但不限于，正常收费，打折收费等
 */
public abstract  class CashSuper {
    /**
     * 正常收费，原价返回
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
