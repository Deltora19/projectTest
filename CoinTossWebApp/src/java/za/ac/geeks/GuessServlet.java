package za.ac.geeks;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class GuessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        TossCoinInterface tci = new TossCoinManager();
        String guess = (String)request.getParameter("guess");
        String ComputerResult = tci.tossCoin();
        
        String outcome = tci.compareGuessToToss(guess, ComputerResult);
        String computerCoin = tci.tossCoin();
        
        
        session.setAttribute("computerCoin",computerCoin);
        request.setAttribute("outcome", outcome);
        request.setAttribute("guess", guess);
        session.setAttribute("ComputerResult", ComputerResult);

        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);

    }

}
