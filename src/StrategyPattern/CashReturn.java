package StrategyPattern;

import sun.nio.cs.ext.MacThai;

/**
 * 返利收费，初始化时需要输入返利条件和返利值
 *
 * 比如：满300减100，则moneyCondition=300,monryReturn 100
 */
public class CashReturn extends CashSuper{
    private double moneyCondition=0;
    private double moneyReturn=0;
    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition=moneyCondition;
        this.moneyReturn=moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result=0;
        if(money>=moneyCondition){
            result=money- Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
