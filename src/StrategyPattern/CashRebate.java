package StrategyPattern;

/**
 * 打折收费类，将收费打折计算好后返回
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 0.8;

    /**
     * 计算打折后返回
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
    public CashRebate(double moneyRebate){
        this.moneyRebate=moneyRebate;
    }
}
