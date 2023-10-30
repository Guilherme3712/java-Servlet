package br.com.ibm;

import java.util.stream.Stream;

public class Program {
        public static void main(String[] args) {
            Moto m[] = new Moto[3];

            m[0] = new Moto("Moto", "Titan 150", "Honda", "Prata", "Street", "Gasolina", 2006, 130);
            m[0].desligar();
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

            Car v2 = new Car("Carro", "Lancer", "Mitsubishi", "Cinza", "Sedan", "Gasolina", 2018, 220);
            v2.desligar();
            v2.status();
            v2.tracao();
            v2.freio();
            v2.rodas();

            Bus v3 = new Bus("Onibus", "Marcopolo Torino", "Mercedes", "Azul", "Serviço", "Gasolina", 2017, 120);
            v3.desligar();
            v3.status();
            v3.tracao();
            v3.freio();
            v3.rodas();
        }
}
