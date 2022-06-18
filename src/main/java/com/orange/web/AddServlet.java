package com.orange.web;

import com.orange.pojo.Card;
import com.orange.service.CardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    private CardService service = new CardService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String cname = request.getParameter("cname");
        String ename = request.getParameter("ename");
        String jname = request.getParameter("jname");
        String pic = request.getParameter("pic");

        Card card = new Card();
        card.setId(Integer.parseInt(id));
        card.setCname(cname);
        card.setEname(ename);
        card.setJname(jname);
        card.setPic(pic);


        //完成添加
        service.add(card);

        request.getRequestDispatcher("/selectAllServlet").forward(request,response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
