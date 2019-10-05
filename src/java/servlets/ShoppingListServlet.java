/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
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
        String username = (String) session.getAttribute("user");

        if (username == null) {
            username = request.getParameter("user");
        }
        
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        } else {
            action = action;
        }
        
        switch (action) {
            case "register":
                session.setAttribute("username", request.getParameter("user"));
                break;
            case "logout":
                session.removeAttribute("user");
                list.clear();
                break;
            case "add":
                //add to an arrayList
                list.add(request.getParameter("item"));
                break;
            case "delete":
                //delete inventory items from the arrayList
                break;
        }

        if (username == null || username.equals("")) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }

    }

}
