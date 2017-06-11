package ua.pd.hillel.java15.homeWork5.store.registors;

import java.util.Random;

/**
 * Created by aleksei on 11.06.17.
 */
public abstract class AbstractRegister implements Register{

    private final boolean random = new Random().nextBoolean();

    @Override
    public int brokenTime(){
        return 60;
    }

    protected int isBroken() {
        if(random){
            return brokenTime();
        } else return 0;
    }
}
