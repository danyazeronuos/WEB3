package org.zero.web3.controller;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.zero.web3.model.Data;
import org.zero.web3.model.Result;
import org.zero.web3.model.ResultModel;
import org.zero.web3.service.TabulationService;

@WebServlet("/tabulate")
public class TabulationServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        var start = Double.parseDouble(request.getParameter("start"));
        var end = Double.parseDouble(request.getParameter("finish"));
        var step = Double.parseDouble(request.getParameter("step"));

        var service = new TabulationService(start, end, step);

        List<Result> tabulate = service.tabulate();
        request.setAttribute("result", tabulate);
        var enteredData = new Data(start, end, step);
        var data = new ResultModel(TabulationService.getSum(tabulate),
                TabulationService.getMin(tabulate),
                TabulationService.getMax(tabulate),
                TabulationService.getAvg(tabulate),
                enteredData);


        request.setAttribute("data", data);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}