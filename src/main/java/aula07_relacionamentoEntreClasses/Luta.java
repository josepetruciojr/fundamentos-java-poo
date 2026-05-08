package aula07_relacionamentoEntreClasses;

public class Luta {

    public static void main(String[] args) {
        StringBuilder lu = new StringBuilder();

        lu
                .append("Pretty Boy")
                .append("França")
                .append(13)
                .append(1.78)
                .append(68.9)
                .append(Categoria.LEVE)
                .append(11)
                .append(2)
                .append(1)
                .toString();

        System.out.println(lu);
    }
}
