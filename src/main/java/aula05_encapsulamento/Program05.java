package aula05_encapsulamento;

public class Program05 {
    public static void main(String[] args) {


        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.abrirMenu();
        c1.fecharMenu();
        c1.maisVolume();
        c1.menosVolume();
        c1.play();
        c1.pause();
        c1.desligar();
    }
}
