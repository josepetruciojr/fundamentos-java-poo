package aula04_exemploPraticoContaBancaria;

import java.util.Locale;

public class ProgramBanco {
    public static void main(String[] args){

        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(1111);
        c1.setTipoConta("cc");
        c1.setNome("Jose das Couves");
        c1.abrirConta(c1.getTipoConta());
        c1.depositar(600);

        System.out.println("Numero da conta: " + c1.getNumeroConta()
                            + "\nTipo de Conta: " + c1.getTipoConta().toUpperCase()
                            + "\nNome: " + c1.getNome()
                            + "\nSaldo: " + c1.getSaldo()
                            + "\nStatus Conta: " + c1.isStatus());
        System.out.println("---------------------------------------------");

        c1.fecharConta();
        c1.sacar(650);//acrescenta o valor para encerrar a conta com base em valores estaticos

        System.out.println("Agora posso encerrar a conta?");
        c1.fecharConta();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        ContaBancaria c2 = new ContaBancaria();
        c2.setNumeroConta(2222);
        c2.setTipoConta("CP");
        c2.setNome("Jose das Couves");
        c2.abrirConta(c2.getTipoConta());
        c2.depositar(600);
        c2.sacar(750);
        c2.pagarMensalidade();//neste caso debita 20 reais


        System.out.println("Numero da conta: " + c2.getNumeroConta()
                + "\nTipo de Conta: " + c2.getTipoConta().toUpperCase()
                + "\nNome: " + c2.getNome()
                + "\nSaldo: " + c2.getSaldo()
                + "\nStatus Conta: " + c2.isStatus());

        System.out.println("---------------------------------------------");

        c2.fecharConta();
        c2.depositar(20);//acrescenta o valor para encerrar a conta com base em valores estaticos

        System.out.println("Agora posso encerrar a conta?");
        c2.fecharConta();
    }
}
