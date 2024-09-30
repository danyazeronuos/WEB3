package org.zero.web3.controller;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.zero.web3.model.Result;
import org.zero.web3.service.TabulationService;

@WebServlet("/tabulate")
public class TabulationServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        var start = 0.5;
        var end = 2.0;
        var step = 0.005;

        var service = new TabulationService(start, end, step);

        List<Result> tabulate = service.tabulate();
        request.setAttribute("result", tabulate);
        request.setAttribute("start", start);
        request.setAttribute("finish", end);
        request.setAttribute("step", step);

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}