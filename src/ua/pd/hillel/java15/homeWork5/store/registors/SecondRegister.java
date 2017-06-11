package ua.pd.hillel.java15.homeWork5.store.registors;

import ua.pd.hillel.java15.homeWork5.piople.buyers.Buyer;
import ua.pd.hillel.java15.homeWork5.piople.cashiers.Cashier;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by aleksei on 07.06.17.
 */
public class SecondRegister extends AbstractRegister implements Runnable{


    private final Cashier cashier;
    private final Queue<Buyer> queue = new LinkedList<>();

    public SecondRegister(Cashier cashier){
        this.cashier = cashier;
    }

    public void newBuyer(Buyer buyer){
        queue.add(buyer);
    }

    public void run(){
        int numberOfCustomers = 0;
        int totalTime = 0;
        int brokenTime = 0;
        Buyer buyer;
        while ((buyer = queue.poll()) != null) {
            brokenTime += isBroken();
            totalTime += brokenTime;
            totalTime += buyer.putGoodsOnTheLine();
            totalTime += cashier.pierce();
            totalTime += cashier.takeMoney();
            totalTime += buyer.payForGoods();
            totalTime += cashier.serviceTime();
            numberOfCustomers++;
        }
        System.out.println("На второй кассе было: " + numberOfCustomers + " покупателей, обслуживание заняло: " + totalTime + " секунд." +
                " Касса была неисправна: " + brokenTime + " секунд.");
    }
}
