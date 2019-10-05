/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Steven
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        doEverything(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doEverything(request, response);
    }

    protected void doEverything(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            
        } 

//        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
//        getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

}