package aula02_visibilidadeDeUmObjeto;

public class ProgramAula03{
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80;//mesmo sendo protected o modificador, o metodo main esta dentro uma classe que utiliza a classe caneta
        //c1.tampada = true;
        c1.tampar();//mesmo o atributo sendo private, o metodo que chama é public e mexe no atributo privado pois esta na mesma classe
        c1.status();
    }
}
