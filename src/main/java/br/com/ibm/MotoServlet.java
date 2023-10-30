package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.stream.Stream;

@WebServlet(name = "MotoServlet", urlPatterns = { "/moto" })
public class MotoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Moto m[] = new Moto[3];
        m[0] = new Moto("Moto", "Titan 150", "Honda", "Prata", "Street", "Gasolina", 2006, 130);
        m[0].ligar();
        m[0].status();
        m[0].tracao();
        m[0].freio();
        m[0].rodas();
        m[0].setCilindradas(150);
        m[0].cilindradas();

        m[1] = new Moto("Moto", "TW CB300", "Honda", "Dourada", "Street", "Flex", 2023, 160);
        m[1].desligar();
        m[1].status();
        m[1].tracao();
        m[1].freio();
        m[1].rodas();
        m[1].setCilindradas(300);
        m[1].cilindradas();

        m[2] = new Moto("Moto", "MT-07", "Yamaha", "Preta", "Naked", "Gasolina", 2022, 190);
        m[2].desligar();
        m[2].status();
        m[2].tracao();
        m[2].freio();
        m[2].rodas();
        m[2].setCilindradas(689);
        m[2].cilindradas();

        Stream<Moto> cilindrada = Stream.of(m)
                .filter(c -> c.getCilindradas() >= 300);
        System.out.println("====================================");
        System.out.println("Motos com mais de 300 cilindradas ");
        cilindrada.forEach(c -> System.out.println(c.getModelo() + " " + c.getCilindradas() + " cc"));
        System.out.println("====================================");


        request.setAttribute("modelMoto", m[0].getModelo());
        request.setAttribute("brandMoto", m[0].getMarca());
        request.setAttribute("colorMoto", m[0].getCor());
        request.setAttribute("ccMoto", m[0].cilindradas);

        request.setAttribute("modelMoto1", m[1].getModelo());
        request.setAttribute("brandMoto1", m[1].getMarca());
        request.setAttribute("colorMoto1", m[1].getCor());
        request.setAttribute("ccMoto1", m[1].cilindradas);

        request.setAttribute("modelMoto2", m[2].getModelo());
        request.setAttribute("brandMoto2", m[2].getMarca());
        request.setAttribute("colorMoto2", m[2].getCor());
        request.setAttribute("ccMoto2", m[2].cilindradas);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/moto.jsp");
        dispatcher.forward(request, response);
    }
}