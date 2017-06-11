package ua.pd.hillel.java15.homeWork5.piople.cashiers;

import ua.pd.hillel.java15.homeWork5.piople.Human;

import java.util.Random;

/**
 * Created by aleksei on 07.06.17.
 */
public class HonestCashier extends Human implements Cashier {


    @Override
    public int takeMoney() {
        return randomAction();
    }

    @Override
    public int pierce() {
        return randomAction();
    }

    @Override
    public int serviceTime() {
        return randomAction();
    }
}
