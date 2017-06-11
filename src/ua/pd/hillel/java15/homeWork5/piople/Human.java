package ua.pd.hillel.java15.homeWork5.piople;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by aleksei on 05.06.17.
 */
public class Human {

    private final Random random = new SecureRandom();

    protected int randomAction() {
        return random.nextInt(15);
    }
}
