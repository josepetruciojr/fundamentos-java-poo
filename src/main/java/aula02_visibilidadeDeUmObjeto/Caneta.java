package aula02_visibilidadeDeUmObjeto;

public class Caneta {

    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta de cor: " + this.cor);
        System.out.println("Ponta de tamanho: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Error ");
        }
         else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
