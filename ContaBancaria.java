import java.math.BigDecimal;

public class ContaBancaria {
    private String nomeCompleto;
    private double saldoDaConta;
    private double investimento;
    ContaBancaria(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
        this.saldoDaConta = 100;
    }
    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public double getSaldoDaConta() {
        return saldoDaConta;
    }
    public boolean resgate(double valor){
        if(valor <= this.saldoDaConta){
            this.saldoDaConta -= valor;
            return true;
        }
        return false;
    }
    public void deposito(double valor){
        this.saldoDaConta += valor;
    }
    public boolean investimento(double valor){
        if(this.saldoDaConta >= valor){
            this.saldoDaConta -= valor;
            this.investimento += valor;
            return true;
        }
        return false;
    }
    public void imprimeDados(){
        System.out.println("Nome: " + this.nomeCompleto +
                "\n Saldo da conta: " + this.saldoDaConta+
                "\n Investimento: " + this.investimento);
    }
    public void bonus (){
        this.investimento += 0.05 * this.investimento;
    }

}
