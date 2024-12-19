package za.ac.geeks;
import java.util.Scanner;

public class TossCoinManager implements TossCoinInterface {

    private static String[] coin = {"Heads", "Tails"};

    @Override
    public String tossCoin() {
        int index;
        index = (int) Math.floor(Math.random() * 2);
        return coin[index];
    }

    @Override
    public String compareGuessToToss(String userGuess, String computerToss) {
        String outcome;

        if (userGuess.equals(computerToss)) {
            outcome = "Won";

        } else {

            outcome = "Lost";

        }

        return outcome;

    }
}
