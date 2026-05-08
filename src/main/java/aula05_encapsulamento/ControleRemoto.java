package aula05_encapsulamento;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if(!isLigado()) {
            setLigado(true);
        }
        else{
            System.out.println("TV já está ligada!");
        }
    }

    @Override
    public void desligar() {
        if(isLigado()) {
            setLigado(false);
        }
        else {
            System.out.println("TV já está desligada!");
        }
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            System.out.println("---------- MENU -----------");
            System.out.println("Está ligado:  " + isLigado());
            System.out.println("Está tocando: " + isTocando());
            System.out.println("Volume: " + getVolume());

            for (int i = 0; i <= getVolume(); i+=10 ) {
                System.out.print("|");
            }
        } else {
            System.out.println("TV está desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
            if (isLigado()) {
                setVolume(getVolume() + 5);
            }
            else {
                System.out.print("TV desligada, não pode aumentar o volume");
            }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 5);
        }
        else {
            System.out.print("TV desligada, não pode aumentar o volume");
        }
    }
    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() >=0 ){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0 ){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(isLigado() && !isTocando()){
            setTocando(false);
        }
    }
}
