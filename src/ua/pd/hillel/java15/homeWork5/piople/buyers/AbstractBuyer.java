package ua.pd.hillel.java15.homeWork5.piople.buyers;

import ua.pd.hillel.java15.homeWork5.piople.Human;

import java.util.Random;

/**
 * Created by aleksei on 07.06.17.
 */
public abstract class AbstractBuyer extends Human implements Buyer {

    private final double money = new Random().nextDouble();

    @Override
    public int payMoney() {
        return 22;
    }

    public abstract void swears(); // ругается матом

    @Override
    public void love() {
        if(payMoney() < 25){
            swears();
        }
    }

    @Override
    public int takeGoods() {
        if(money <25){
            return 3;
        } else return 5;
    }
}
