package aula03_metodosGetterSetterConstructor;

public class Caneta {

    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    public Caneta(){

    }

    public Caneta(String modelo, String cor, double ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada(){
        return this.tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }


}
