package aula01_criandoClassesEObjetos.exercicio_proposto;

public class Copo {

    String cor;
    String forma;
    int volume;
    boolean interior;

    void status(){
        System.out.println("cor: " + this.cor
                + "\nforma: " + this.forma
                + "\nvolume: " + this.volume);
    }
    void acao(){
        if (interior != true){
            System.out.println("Estou enchendo!");
        }
          else{
            System.out.println("Error: copo cheio!");
        }
    }

}
