package ua.pd.hillel.java15.homeWork5.piople.buyers;

import ua.pd.hillel.java15.homeWork5.piople.buyers.AbstractBuyer;

/**
 * Created by aleksei on 07.06.17.
 */
public class TeenagerBuyer extends AbstractBuyer {

    @Override
    public int takeGoods() {
        System.out.println("Пиво");
        System.out.println("Кальмары");
        System.out.println("Сигареты");
        return 3;
    }

    @Override
    public void swears() {
        System.out.println("Иди ты");
        System.out.println("Сдачу давай");
        System.out.println("Тупая овца");
    }
}
