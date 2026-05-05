package aula04_exemploPraticoContaBancaria;

public class ContaBancaria {

    public Integer numeroConta;
    protected String tipoConta;
    private String nome;
    private Double saldo;
    private boolean status;
    private double taxa;

    public ContaBancaria() {
        saldo = 0.0;
        status = false;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void abrirConta(String tipoConta) {
        setStatus(true);
        if(tipoConta.equalsIgnoreCase("CC")){
            setSaldo(getSaldo() + 50);
        }
        if (tipoConta.equalsIgnoreCase("CP")){
            setSaldo(getSaldo() + 150);
        }
    }

    //Boas práticas: métodos não devem escrever, mas para fins didáticos, aqui eles escrevem!
    public void fecharConta(){

        if(getSaldo() > 0){
            System.out.println("Não é possível encerrar, a conta possui saldo: " + getSaldo() + "\nSolicite o saque do valor em conta.");
        }

        else if(getSaldo() < 0){
            System.out.println("Não é possível encerrar, a conta possui debitos: " + getSaldo() + "\nRealize o Pagamento da dívida para encerrar!");
        }
        else {
            System.out.println("Saldo agora está: " + getSaldo() + "\nConta encerrada.");
            setStatus(false);
        }
    }

    public void depositar(double valor){
        if(isStatus()) {
             setSaldo(getSaldo() + valor);
        }
        else {
            System.out.println("Status invativo, não da para realizar depositos.");
        }
    }

    public void sacar(double valor) {

        if (isStatus() && getSaldo() >= valor ) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Status invativo ou saldo negativo, não da para realizar saques.");
        }
    }

    public void pagarMensalidade(){
        if(isStatus() && getTipoConta().equalsIgnoreCase("CC")){
            setSaldo(getSaldo() - 12.0);
        }
        if(isStatus() && getTipoConta().equalsIgnoreCase("CP")){
            setSaldo(getSaldo() - 20.0);
        }
    }

}
