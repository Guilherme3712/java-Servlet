package br.com.ibm;

class Car extends Veiculo{
    @Override
    public void tracao() {
        System.out.println("Tração traseira");
    }
    @Override
    public void freio() {
        System.out.println("Freio a Disco");
    }

    @Override
    public void rodas() {
        System.out.println("Liga leve Aro 17");
    }

    public Car(String tipo, String modelo, String marca, String cor, String categoria, String combustivel, int ano, int velocidadeMax) {
        super(tipo, modelo, marca, cor, categoria, combustivel, ano, velocidadeMax);
    }
}
