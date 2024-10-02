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

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        var start = Double.parseDouble(request.getParameter("start"));
        var end = Double.parseDouble(request.getParameter("finish"));
        var step = Double.parseDouble(request.getParameter("step"));

        var service = new TabulationService(start, end, step);

        List<Result> tabulate = service.tabulate();
        for (Result r : tabulate) {
            System.out.println(r);
        }
        request.setAttribute("result", tabulate);
        request.setAttribute("sum", TabulationService.getSum(tabulate));
        request.setAttribute("min", TabulationService.getMin(tabulate));
        request.setAttribute("max", TabulationService.getMax(tabulate));
        request.setAttribute("avg", TabulationService.getAvg(tabulate));

        request.setAttribute("start", start);
        request.setAttribute("finish", end);
        request.setAttribute("step", step);

        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}