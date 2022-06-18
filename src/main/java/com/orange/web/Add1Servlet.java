package com.orange.web;

import com.orange.pojo.Card;
import com.orange.service.CardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.ScatteringByteChannel;

import static org.apache.taglibs.standard.functions.Functions.length;

@WebServlet("/add1Servlet")
public class Add1Servlet extends HttpServlet {

    private CardService service = new CardService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String ydk = request.getParameter("ydk");
        int i=0;int j=0;
        PrintWriter out = response.getWriter();
        out.write(ydk);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
