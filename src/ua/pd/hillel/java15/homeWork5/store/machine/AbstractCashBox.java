package ua.pd.hillel.java15.homeWork5.store.machine;

/**
 * Created by aleksei on 07.06.17.
 */
public abstract class AbstractCashBox extends Machine implements CashBox {

    @Override
    public int displayTotalSumm() {
        return 100;
    }

    public abstract boolean buggy();

    @Override
    public int giveChange() {
        if(buggy()){
            return 0;
        } else return 1;
    }
}
