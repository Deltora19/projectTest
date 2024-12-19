<%-- 
    Document   : tossCoin
    Created on : 17 Dec 2024, 11:12:56
    Author     : Geeks_PC30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Play</title>
    </head>
    <body>
        <form action ="GuessServlet" method="POST">
            <table>
                <tr>
                <select name="guess">
                    <option value="Heads">Heads</option>
                     <option value="Tails">Tails</option>
                </select>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GUESS"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
