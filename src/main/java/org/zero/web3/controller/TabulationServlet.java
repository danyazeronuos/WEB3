package org.zero.web3.controller;

import java.io.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.zero.web3.utils.Calculator;

@ApplicationScoped
@WebServlet("/hello")
public class TabulationServlet extends HttpServlet {
    private Calculator calculator;
    @Override
    public void init() throws ServletException {
        calculator = new Calculator();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        request.setAttribute("result", calculator.apply(5.0));

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}