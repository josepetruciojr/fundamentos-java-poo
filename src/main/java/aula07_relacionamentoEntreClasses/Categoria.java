package aula07_relacionamentoEntreClasses;

public enum Categoria {
    LEVE(1),
    MEDIO(2),
    PESADO(3);

    private final int codigo;

    Categoria(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }
}
