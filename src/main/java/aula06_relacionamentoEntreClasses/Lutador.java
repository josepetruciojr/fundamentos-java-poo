package aula06_relacionamentoEntreClasses;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
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
        this.vitorias = vitorias;
        setPeso(peso);
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

    private void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
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

    public String getCategoria(){
       return categoria;
    }

    private void setCategoria(){
        if (peso < 52) {
            categoria = "Inválido! Não se enquadra em nenhuma categoria\"";
        } else if (peso <= 71) {
            categoria =  "Leve";
        } else if (peso <= 83) {
            categoria = "Médio";
        } else if (peso <= 120) {
            categoria = "Pesado";
        }
        else{
            categoria = "Inválido! Não se enquadra em nenhuma categoria";
        }
    }


    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setDerrotas(getEmpates() + 1);
    }



    public String apresentar() {
            StringBuilder sb = new StringBuilder();
            sb.append("Nome: ").append(nome).append("\n");
            sb.append("Nacionalidade: ").append(nacionalidade).append("\n");
            sb.append("Idade: ").append(idade).append("\n");
            sb.append("Altura: ").append(altura).append("\n");
            sb.append("Peso: ").append(peso).append("\n");
            sb.append("Vitorias: ").append(vitorias).append("\n");
            sb.append("Derrotas: ").append(derrotas).append("\n");
            sb.append("Empates: ").append(empates).append("\n");
            return sb.toString();
    }

    public void status(){
        System.out.println("APresentando lutador: " + getNome() + " e é um peso " + getCategoria());
        System.out.println("E Ganhou: " + getVitorias() + " vezes.");
        System.out.println("E Perdeu: " + getDerrotas() + " vezes.");
        System.out.println("E Empatou: " + getEmpates() + " vezes.");

    }

}
