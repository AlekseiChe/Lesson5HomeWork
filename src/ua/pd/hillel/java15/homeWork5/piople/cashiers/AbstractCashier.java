package ua.pd.hillel.java15.homeWork5.piople.cashiers;

import ua.pd.hillel.java15.homeWork5.piople.Human;
import ua.pd.hillel.java15.homeWork5.piople.cashiers.Cashier;

/**
 * Created by aleksei on 07.06.17.
 */
public abstract class AbstractCashier extends Human implements Cashier {

    public abstract void sleep();

    @Override
    public int takeMoney() {
        return 22;
    }
}
