<%-- 
    Document   : outcome
    Created on : 17 Dec 2024, 12:07:39
    Author     : Geeks_PC30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome</title>
    </head>
    <body>
        <%
            
        String computerName = pageContext.getServletContext().getInitParameter("computerName");
        String outcome = (String)request.getAttribute("outcome");
        String computerCoin = (String)session.getAttribute("ComputerResult");
        String guess = (String)request.getAttribute("guess");
        
        %>
        <p>
            Hi, here are the results below:
        </p>
        <p>
            Toss by <b><%=computerName%></b> is <b><%=computerCoin%></b><br>
            Your guess <b><%=guess%></b><br>
            Outcome: <b><%=outcome%>!!</b><br>
            Please click <a href="play.jsp">here</a> to play again or <a href="endGame.jsp">here</a> to end the game
        </p>
    </body>
</html>
