package aula01_criandoClassesEObjetos;

public class ProgramAula02 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2  = new Caneta();
        c2.cor = "azul";
        c2.ponta = 0.5;
        c2.tampada = false;
        c2.tampar();
        c2.status();
        c2.rabiscar();

    }
}
