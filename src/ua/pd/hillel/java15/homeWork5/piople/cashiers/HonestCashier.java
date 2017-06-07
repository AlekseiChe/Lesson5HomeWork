package ua.pd.hillel.java15.homeWork5.piople.cashiers;

import java.util.Random;

/**
 * Created by aleksei on 07.06.17.
 */
public class HonestCashier extends AbstractCashier {

    private final Random random = new Random();

    @Override
    public void pierce() {
        System.out.println("Я пробиваю продукты");
    }

    @Override
    public int serviceTime() {
        return random.nextInt();
    }

    @Override
    public void sleep() {
        System.out.println("Храп");

    }
}
