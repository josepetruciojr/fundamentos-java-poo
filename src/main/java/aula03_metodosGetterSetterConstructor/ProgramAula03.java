package aula03_metodosGetterSetterConstructor;

public class ProgramAula03{
    public static void main(String[] args) {

        //construtor sem argumentos
        Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setCor("Azul");
        c1.setPonta(0.5);
        c1.tampar();


        System.out.println("Tenho uma:\nCaneta: " + c1.getModelo()
                            + "\nPonta: " + c1.getPonta()
                            + "\nCor: " + c1.getCor()
                            + "\nTampada: " + c1.isTampada());

        //construtor com argumentos
        Caneta c2 = new Caneta("NIC", "Verde", 0.7);
        c2.destampar();

        System.out.println("Tenho uma:\nCaneta: " + c2.getModelo()
                + "\nPonta: " + c2.getPonta()
                + "\nCor: " + c2.getCor()
                + "\nTampada: " + c2.isTampada());
    }
}
