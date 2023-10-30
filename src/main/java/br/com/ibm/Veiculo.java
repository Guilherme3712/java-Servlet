package br.com.ibm;

public abstract class Veiculo implements Controlador{
    //Atributos
    private String tipo, modelo, marca, cor, combustivel, categoria, passageiros;
    private int ano, velocidadeMax;
    private boolean ligado;

    //Métodos de veiculo
    public abstract void tracao();
    public abstract void freio();
    public abstract void rodas();

    //Metodos Especiais
    public Veiculo(String tipo, String modelo, String marca, String cor, String categoria, String combustivel, int ano, int velocidadeMax) {
        this.setTipo(tipo);
        this.ligado = false;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.categoria = categoria;
        this.combustivel = combustivel;
        this.ano = ano;
        this.velocidadeMax = velocidadeMax;

    }

    public void status() {
        System.out.println("-----------------------------------------");
        if (ligado == true){
            System.out.println("O veiculo está ligado");
        }else{
            System.out.println("O veiculo está desligado");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Tipo de veículo: " + getTipo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Combustível: " + getCombustivel());
        System.out.println("Passageiros: " + getPassageiros());
        System.out.println("Ano de Fabricação: " + getAno());
        System.out.println("Velocidade final: " + getVelocidadeMax());
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        this.setPassageiros();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPassageiros() {
        return passageiros;
    }

    public void setPassageiros() {
        if(this.tipo == "Moto") {
            this.passageiros = "2 Passageiros";
        }
        else if(tipo == "Carro") {
            this.passageiros = "5 Passageiros";
        }else if (tipo == "Onibus"){
            this.passageiros = "30 passageiros";
        }else {
            this.passageiros = "Veiculo inválido";
        }

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


    //Metodos abstratos - Interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void acelerar() {
    }
    @Override
    public void frear() {
    }
    @Override
    public void passarMarcha() {
    }
    @Override
    public void reduzirMarcha() {
    }
}

