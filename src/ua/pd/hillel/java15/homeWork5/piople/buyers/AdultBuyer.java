package ua.pd.hillel.java15.homeWork5.piople.buyers;

import ua.pd.hillel.java15.homeWork5.piople.Human;

/**
 * Created by aleksei on 07.06.17.
 */
public class AdultBuyer extends Human implements Buyer {

    @Override
    public int putGoodsOnTheLine() {
        return randomAction();
    }

    @Override
    public int payForGoods() {
        return randomAction();
    }
}
