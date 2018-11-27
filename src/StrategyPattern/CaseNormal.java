package StrategyPattern;

/**
 * 正常收费，计算后返回原价
 */
public class CaseNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
