package aula06_relacionamentoEntreClasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador() {
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void categoria() {
        if (getPeso() < 52) {
            System.out.println("Não se enquadra em nenhuma categoria");
        } else if (getPeso() <= 71) {
            System.out.println("Categoria: Leve");
        } else if (getPeso() <= 83) {
            System.out.println("Categoria: Médio");
        } else if (getPeso() <= 120) {
            System.out.println("Categoria: Pesado");
        }
        else{
            System.out.println("Não se enquadra em nenhuma categoria");
        }

    }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Nome: " + getNome() + "\n");
            sb.append("Nacionalidade: " + getNacionalidade() + "\n");
            sb.append("Idade: " + getIdade() + "\n");
            sb.append("Altura: " + getAltura() + "\n");
            sb.append("Peso: " + getPeso() + "\n");
            sb.append("Vitorias: " + getVitorias() + "\n");
            sb.append("Derrotas: " + getDerrotas() + "\n");
            sb.append("Empates: " + getEmpates() + "\n");
            return sb.toString();
    }

}
