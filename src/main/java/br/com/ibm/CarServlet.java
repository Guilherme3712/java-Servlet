package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "CarServlet", urlPatterns = { "/car" })
public class CarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Car c = new Car("Carro", "Lancer", "Mitsubishi", "Cinza", "Sedan", "Gasolina", 2018, 220);
        c.desligar();
        c.status();
        c.tracao();
        c.freio();
        c.rodas();

        request.setAttribute("modelCar", c.getModelo());
        request.setAttribute("brandCar", c.getMarca());
        request.setAttribute("colorCar", c.getCor());
        request.setAttribute("quantPassengers", c.getPassageiros());


        RequestDispatcher dispatcher = request.getRequestDispatcher("/car.jsp");
        dispatcher.forward(request, response);
    }
}