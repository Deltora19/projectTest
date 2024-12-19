
package za.ac.geeks;

import jakarta.servlet.http.HttpServletRequest;

public interface TossCoinInterface {
    
    public String tossCoin();
    public String compareGuessToToss(String userGuess, String computerToss);
    
}
