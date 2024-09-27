package org.youcode.loansimulator.home;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "LoanSimulator" , urlPatterns = "/home")
public class HomeController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").include(request, response);
    }

}

