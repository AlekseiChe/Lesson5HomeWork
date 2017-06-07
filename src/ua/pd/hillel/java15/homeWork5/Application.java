package ua.pd.hillel.java15.homeWork5;

import ua.pd.hillel.java15.homeWork5.piople.buyers.AdultBuyer;
import ua.pd.hillel.java15.homeWork5.piople.buyers.PensionerBuyer;
import ua.pd.hillel.java15.homeWork5.piople.buyers.TeenagerBuyer;

/**
 * Created by aleksei on 07.06.17.
 */
public class Application implements Runnable {


    @Override
    public void run() {
        new TeenagerBuyer();
        new AdultBuyer();
        new PensionerBuyer();
    }
}
