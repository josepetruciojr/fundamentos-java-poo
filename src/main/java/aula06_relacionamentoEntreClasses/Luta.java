package aula06_relacionamentoEntreClasses;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){};

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if((desafiado.getCategoria().equals(desafiante.getCategoria()))
                && (desafiado != desafiante)){
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
        }
        else{
            setAprovada(!isAprovada());
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {

        if (isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random numero = new Random();
            int vencedor = numero.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Ganhou: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhou: " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }
        else{
            System.out.println("Luta não pode acontecer!");
        }
    }

}
