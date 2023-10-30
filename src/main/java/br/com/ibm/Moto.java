package br.com.ibm;

public class Moto extends Veiculo {
    public int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void tracao() {
        System.out.println("Freio a traseira");
    }
    @Override
    public void freio() {
        System.out.println("Freio a tambor");
    }

    @Override
    public void rodas() {
        System.out.println("Rodas raiadas ARO 18");
    }

    public Moto(String tipo, String modelo, String marca, String cor, String categoria, String combustivel, int ano, int velocidadeMax) {
        super(tipo, modelo, marca, cor, categoria, combustivel, ano, velocidadeMax);
    }

    public void cilindradas() {
        System.out.println(getCilindradas()+ " Cilindradas");
    }
}
