package aula01_criandoClassesEObjetos.exercicio_proposto;

public class ProgramCopo {

    public static void main(String[] args) {

        Copo copo = new Copo();
        copo.cor = "azul";
        copo.forma = "cilindrico";
        copo.volume = 300;
        copo.interior = true;
        copo.status();
        copo.acao();
    }
}
