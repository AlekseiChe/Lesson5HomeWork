package ua.pd.hillel.java15.homeWork5.store.machine;

import ua.pd.hillel.java15.homeWork5.piople.cashiers.AbstractCashier;

/**
 * Created by aleksei on 07.06.17.
 */
public class FirstCashBox extends AbstractCashBox{

    @Override
    public void printCashReceipt() {
        if(buggy()){
            System.out.println("Не напечатаю");
        }
    }

    @Override
    public boolean buggy() {
        return false;
    }
}
