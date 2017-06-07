package ua.pd.hillel.java15.homeWork5.piople.buyers;

import ua.pd.hillel.java15.homeWork5.piople.buyers.AbstractBuyer;

/**
 * Created by aleksei on 07.06.17.
 */
public class AdultBuyer extends AbstractBuyer {

    @Override
    public int takeGoods() {
        System.out.println("Помидоры");
        System.out.println("Пельмени");
        System.out.println("Хлеб");
        return 3;
    }

    @Override
    public void swears() {
        System.out.println("Долбаный");
        System.out.println("Говнище");
        System.out.println("Бред собачий!");
    }
}
