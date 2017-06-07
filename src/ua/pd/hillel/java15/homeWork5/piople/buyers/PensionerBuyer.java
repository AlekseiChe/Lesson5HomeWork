package ua.pd.hillel.java15.homeWork5.piople.buyers;

import ua.pd.hillel.java15.homeWork5.piople.buyers.AbstractBuyer;

/**
 * Created by aleksei on 07.06.17.
 */
public class PensionerBuyer extends AbstractBuyer {

    @Override
    public int takeGoods() {
        System.out.println("Гречка");
        System.out.println("Соль");
        System.out.println("Масло");
        return 3;
    }

    @Override
    public void swears() {
        System.out.println("Курва");
    }
}
