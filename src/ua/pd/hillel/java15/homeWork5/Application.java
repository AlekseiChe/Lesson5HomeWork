package ua.pd.hillel.java15.homeWork5;

import ua.pd.hillel.java15.homeWork5.piople.buyers.AdultBuyer;
import ua.pd.hillel.java15.homeWork5.piople.buyers.PensionerBuyer;
import ua.pd.hillel.java15.homeWork5.piople.buyers.TeenagerBuyer;
import ua.pd.hillel.java15.homeWork5.piople.cashiers.HonestCashier;
import ua.pd.hillel.java15.homeWork5.piople.cashiers.LazyCashier;
import ua.pd.hillel.java15.homeWork5.store.registors.FirstRegister;
import ua.pd.hillel.java15.homeWork5.store.registors.SecondRegister;

import java.util.Random;

/**
 * Created by aleksei on 07.06.17.
 */
public class Application implements Runnable {

    @Override
    public void run() {
        Random random = new Random();

        //Первая касса, честный кассир
        FirstRegister firstRegister = new FirstRegister(new HonestCashier());

        for (int i = 0; i < random.nextInt(100); i++) {
            firstRegister.newBuyer(new TeenagerBuyer());
            firstRegister.newBuyer(new AdultBuyer());
            firstRegister.newBuyer(new PensionerBuyer());
        }

        firstRegister.run();


        //Вторая касса, ленивый кассир
        SecondRegister secondRegister = new SecondRegister(new LazyCashier());

        for (int i = 0; i < random.nextInt(100); i++) {
            secondRegister.newBuyer(new TeenagerBuyer());
            secondRegister.newBuyer(new AdultBuyer());
            secondRegister.newBuyer(new PensionerBuyer());
        }

        secondRegister.run();
    }
}
