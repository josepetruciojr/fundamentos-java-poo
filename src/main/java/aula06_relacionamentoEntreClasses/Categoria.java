package aula06_relacionamentoEntreClasses;

public enum Categoria {
    LEVE("Leve"),
    MEDIO("Medio"),
    PESADO("Pesado");

    private final String codigo;

    Categoria(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }
}
