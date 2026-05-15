package exercicio_pratica_poo;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Pedro", 22, "masculino");
        pessoa[1] = new Pessoa("Joao", 23, "masculino");

        livro[0] = new Livro("Use a cabeca", "José das Couves", 300, pessoa[0]);
        livro[1] = new Livro("Java Efetivo", "José das Laranjas", 700, pessoa[1]);
        livro[2] = new Livro("Java 8", "José das Maças", 1100, pessoa[0]);
        livro[2] = new Livro("Java 8", "José das Maças", 1100, pessoa[1]);

        livro[0].abrir();
        livro[0].folhear(499);
        System.out.println(livro[0].detalhes());
        System.out.println(livro[1].detalhes());
        System.out.println(livro[2].detalhes());

    }
}
