package aula01_criandoClassesEObjetos;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta de cor: " + this.cor);
        System.out.println("Está tampada: " + this.tampada);
        System.out.println("Ponta de tamanho: " + this.ponta);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Error ");
        }
         else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
