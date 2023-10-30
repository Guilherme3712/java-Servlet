package br.com.ibm;

class Bus extends Veiculo {
    @Override
    public void tracao() {
        System.out.println("Dianteira");
    }

    @Override
    public void freio() {
        System.out.println("Freio a tambor");
    }

    @Override
    public void rodas() {
        System.out.println("Roda de Aluminio 17,5 X 6");
    }

    public Bus(String tipo, String modelo, String marca, String cor, String categoria, String combustivel, int ano, int velocidadeMax) {
        super(tipo, modelo, marca, cor, categoria, combustivel, ano, velocidadeMax);
    }

}
