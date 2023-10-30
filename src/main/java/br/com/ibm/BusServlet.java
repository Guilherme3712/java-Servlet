package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "BusServlet", urlPatterns = { "/bus" })
public class BusServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Bus b = new Bus("Onibus", "Marcopolo Torino", "Mercedes", "Branco", "Serviço", "Gasolina", 2017, 120);
        b.desligar();
        b.status();
        b.tracao();
        b.freio();
        b.rodas();

        request.setAttribute("modelBus", b.getModelo());
        request.setAttribute("brandBus", b.getMarca());
        request.setAttribute("colorBus", b.getCor());
        request.setAttribute("quantPassengers", b.getPassageiros());


        RequestDispatcher dispatcher = request.getRequestDispatcher("/bus.jsp");
        dispatcher.forward(request, response);
    }
}